package com.cowok.hijrah.chapter3topic5b

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class StudentAdapter(val listStudent: ArrayList<ListStudent>): RecyclerView.Adapter<StudentAdapter.ViewHolder>() {
    class ViewHolder(view : View): RecyclerView.ViewHolder(view) {
        var namaStudent = view.findViewById<TextView>(R.id.tvNama)
        var nimStudent = view.findViewById<TextView>(R.id.tvNim)
        var imgStudent = view.findViewById<ImageView>(R.id.imgStudent)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        var view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_student, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.namaStudent.text = listStudent[position].nama
        holder.nimStudent.text = listStudent[position].nim
        holder.imgStudent.setImageResource(listStudent[position].image)
    }

    override fun getItemCount(): Int {
        return listStudent.size
    }
}