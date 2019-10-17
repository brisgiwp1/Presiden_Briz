package com.example.presiden_briz.Adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.presiden_briz.R
import com.example.presiden_briz.Model.Presiden
import com.example.presiden_briz.Model.Data_Presiden.Presiden_List

class Presiden_List(private val context: Context, private val Presiden : ArrayList <Presiden>,
                    private val listener: (Presiden) -> Unit): RecyclerView.Adapter<Presiden_List.viewHolder>() {
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): Presiden_List.viewHolder {
        return viewHolder(LayoutInflater.from(context).inflate(R.layout.item_presiden, parent, false))
    }

    override fun getItemCount(): Int {
        return Presiden_List.size
    }

    override fun onBindViewHolder(holder: viewHolder, position: Int) {
        holder.bindPresiden(Presiden[position], listener)

    }

    class viewHolder(view: View):RecyclerView.ViewHolder(view){
        var tvName: TextView = view.findViewById(R.id.tv_item_name)
        var tvDetail: TextView = view.findViewById(R.id.tv_item_detail)
        var imgPoster: ImageView = view.findViewById(R.id.img_item_poster)

        fun bindPresiden(Presiden : Presiden, listener: (Presiden) -> Unit){
            tvName.text = Presiden.name
            tvDetail.text = Presiden.detail
            Glide.with(itemView.context)
                .load(Presiden.poster)
                .into(imgPoster)
        }
    }
}
