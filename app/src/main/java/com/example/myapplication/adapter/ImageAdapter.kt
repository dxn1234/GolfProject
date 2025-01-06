package com.example.myapplication.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.myapplication.R
import com.example.myapplication.model.InfoImage


class ImageAdapter : RecyclerView.Adapter<ImageAdapter.MyViewHolder>() {
    private var imagelist = ArrayList<InfoImage>()
    private lateinit var context: Context

    inner class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val imageView: ImageView = itemView.findViewById(R.id.imageView)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ImageAdapter.MyViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_image, parent, false)
        return MyViewHolder(view)
    }

    override fun getItemCount(): Int {
        return imagelist.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        /*
            put data image from response api into recyclerview
            use Glide to load url image avoid scroll lag
         */
        Glide.with(context)
            .load(imagelist[position].imageUrl)
            .into(holder.imageView)
    }
}