package com.example.newsapi.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.newsapi.databinding.ItemRecyclerBinding
import com.example.newsapi.model.NewsDetails


class RecyclerViewAdapter(private val newsArrayList: List<NewsDetails>) :
    RecyclerView.Adapter<RecyclerViewAdapter.MyViewHolder>() {


    inner class MyViewHolder(private val binding: ItemRecyclerBinding) : ViewHolder(binding.root){
        fun bind(item: NewsDetails) {
            binding.newsDetail = item
            binding.executePendingBindings()
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val itemBinding: ItemRecyclerBinding = ItemRecyclerBinding.inflate(
            layoutInflater,
            parent,
            false
        )
        return MyViewHolder(itemBinding)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val item = newsArrayList[position]
        holder.bind(item)
    }

    override fun getItemCount(): Int {
        return newsArrayList.size
    }

}
