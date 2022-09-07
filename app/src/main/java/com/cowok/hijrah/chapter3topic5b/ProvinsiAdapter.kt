package com.cowok.hijrah.chapter3topic5b

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ProvinsiAdapter(val listProvinsi: ArrayList<ListProvinsi>): RecyclerView.Adapter<ProvinsiAdapter.ViewHolder>() {
    class ViewHolder(view : View): RecyclerView.ViewHolder(view) {
        var namaProvinsi = view.findViewById<TextView>(R.id.tvProvinsi)
        var namaIbuKota = view.findViewById<TextView>(R.id.tvIbuKota)
        var imgProvinsi = view.findViewById<ImageView>(R.id.imgProvinsi)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        var view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_provinsi, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.namaProvinsi.text = listProvinsi[position].namaProvinsi
        holder.namaIbuKota.text = listProvinsi[position].ibuKota
        holder.imgProvinsi.setImageResource(listProvinsi[position].imageProvinsi)
    }

    override fun getItemCount(): Int {
        return listProvinsi.size
    }
}