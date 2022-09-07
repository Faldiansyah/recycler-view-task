package com.cowok.hijrah.chapter3topic5b

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_provinsi.*

class ProvinsiActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_provinsi)

        val listProvinsi = arrayListOf(
            ListProvinsi("Bengkulu", "Bengkulu", R.drawable.bengkulu),
            ListProvinsi("DKI Jakarta", "Jakarta", R.drawable.dki_jakarta),
            ListProvinsi("Gorontalo", "Gorontalo", R.drawable.gorontalo),
            ListProvinsi("Jawa Barat", "Bandung", R.drawable.jawa_barat),
            ListProvinsi("Kalimantan Tengah", "Palangkaraya", R.drawable.kalteng),
            ListProvinsi("Kalimantan Timur", "Samarinda", R.drawable.kaltim),
            ListProvinsi("Kalimantan Utara", "Tanjung Selor", R.drawable.kalut),
            ListProvinsi("Lampung", "Bandar LAmpung", R.drawable.lampung),
            ListProvinsi("Maluku", "Ambon", R.drawable.maluku),
            ListProvinsi("Kepulauan Riau", "Tanjung Pinang", R.drawable.riau),
        )

        var adapterProvinsi = ProvinsiAdapter(listProvinsi)
        val linearProvinsi = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)

        recyclerViewProvinsi.layoutManager = linearProvinsi
        recyclerViewProvinsi.adapter = adapterProvinsi
    }
}