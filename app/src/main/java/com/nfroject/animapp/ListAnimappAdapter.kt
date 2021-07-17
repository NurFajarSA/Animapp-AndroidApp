package com.nfroject.animapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.load.DecodeFormat
import com.bumptech.glide.request.RequestOptions
import com.bumptech.glide.request.target.Target


class ListAnimappAdapter(private val listAnimapp: ArrayList<Animapp>) :
    RecyclerView.Adapter<ListAnimappAdapter.ListViewHolder>() {
    private lateinit var onItemClickCallback: OnItemClickCallBack

    interface OnItemClickCallBack {
        fun onItemlicked(data: Animapp)
    }

    fun setOnItemClickCallBack(onItemClickCallback: OnItemClickCallBack) {
        this.onItemClickCallback = onItemClickCallback
    }

    inner class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var tvImg: ImageView = itemView.findViewById(R.id.rv_img_animapp)
        var tvName: TextView = itemView.findViewById(R.id.rv_animal_name)
        var tvClass: TextView = itemView.findViewById(R.id.rv_class)
//        var tvOrde: TextView = itemView.findViewById(R.id.orde_name)
//        var tvFamily: TextView = itemView.findViewById(R.id.family_name)
//        var tvOverview: TextView = itemView.findViewById(R.id.overview)
//        var tvReproduction: TextView = itemView.findViewById(R.id.reproduction)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.listview, parent, false)
        return ListViewHolder(view)
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val animapp = listAnimapp[position]

        Glide.with(holder.itemView.context)
            .load(animapp.img).apply(RequestOptions()
                .fitCenter()
                .format(DecodeFormat.PREFER_ARGB_8888)
                .override(Target.SIZE_ORIGINAL))
            .into(holder.tvImg)
        holder.tvName.text =  animapp.name
        holder.tvClass.text = animapp.className
//        holder.tvOrde.text = animapp.ordeName
//        holder.tvFamily.text = animapp.familyName
//        holder.tvOverview.text = animapp.overview
//        holder.tvReproduction.text = animapp.reproduction
        holder.itemView.setOnClickListener{onItemClickCallback.onItemlicked(listAnimapp[holder.adapterPosition])}

    }

    override fun getItemCount(): Int {
        return listAnimapp.size
    }
}