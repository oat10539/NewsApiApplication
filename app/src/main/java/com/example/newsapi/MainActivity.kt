package com.example.newsapi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View.GONE
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.GridLayoutManager
import com.example.newsapi.adapter.RecyclerViewAdapter
import com.example.newsapi.databinding.ActivityMainBinding
import com.example.newsapi.viewmodel.ViewModel
import org.koin.androidx.viewmodel.ext.android.viewModel

class MainActivity : AppCompatActivity() {

    private val viewModel: ViewModel by viewModel()
    private lateinit var  binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        viewModel.getNews()

        viewModel.errorMessage().observe(this, { error ->
        })
        viewModel.newsList().observe(this, { newsList ->
            binding.textView.visibility = GONE
            binding.recyclerView.layoutManager = GridLayoutManager(this, 1);
            binding.recyclerView.adapter = RecyclerViewAdapter(newsList)
        })
    }
}