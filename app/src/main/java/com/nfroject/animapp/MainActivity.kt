package com.nfroject.animapp

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.app.AppCompatDelegate
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.nfroject.animapp.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var rvAnimapp: RecyclerView
    private var list: ArrayList<Animapp> = arrayListOf()
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        rvAnimapp = binding.rvAnimapp
        rvAnimapp.setHasFixedSize(true)

        binding.aboutMe.setOnClickListener(this)
        initToolbar()

        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)

        list.addAll(AnimappData.listData)
        showRecyclerList()
    }

    private fun showRecyclerList(){
        rvAnimapp.layoutManager = LinearLayoutManager(this)
        val listAnimappAdapater = ListAnimappAdapter(list)
        rvAnimapp.adapter = listAnimappAdapater

        listAnimappAdapater.setOnItemClickCallBack(object : ListAnimappAdapter.OnItemClickCallBack{
            override fun onItemlicked(data: Animapp) {
                showSelectedAnimapp(data)
            }
        })
    }

    private fun showSelectedAnimapp(data: Animapp) {
        val detailActivity = Intent(this@MainActivity, DetailActivity::class.java)
        detailActivity.putExtra("DATA", data)
        startActivity(detailActivity)
    }

    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.about_me -> {
                val aboutIntent = Intent(this@MainActivity, AboutActivity::class.java)
                startActivity(aboutIntent)
            }
        }
    }

    private fun initToolbar() = with(binding){
        setSupportActionBar(toolbar)
        supportActionBar?.setDisplayShowTitleEnabled(false)
    }
}
