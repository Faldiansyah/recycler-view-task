package com.cowok.hijrah.chapter3topic5b

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val listStudent = arrayListOf(
            ListStudent("Andika", "F55120002", R.drawable.ic_launcher_foreground),
            ListStudent("Sinta", "A55120002", R.drawable.ic_launcher_foreground),
            ListStudent("Dandi", "B55120002", R.drawable.ic_launcher_foreground),
            ListStudent("Citra", "D55120002", R.drawable.ic_launcher_foreground),
            ListStudent("Rangga", "L55120002", R.drawable.ic_launcher_foreground),
        )

        var adapterStudent = StudentAdapter(listStudent)
        val llm = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)

        recyclerViewStudent.layoutManager = llm
        recyclerViewStudent.adapter = adapterStudent

        buttonProvinsi.setOnClickListener {
            val pindahActivity = Intent(this, ProvinsiActivity::class.java)
            startActivity(pindahActivity)
        }
    }
}