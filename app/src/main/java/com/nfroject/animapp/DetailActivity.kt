package com.nfroject.animapp

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.app.AppCompatDelegate
import com.bumptech.glide.Glide
import com.bumptech.glide.load.DecodeFormat
import com.bumptech.glide.request.RequestOptions
import com.bumptech.glide.request.target.Target
import com.nfroject.animapp.databinding.ActivityDetailBinding
import kotlinx.android.synthetic.main.activity_detail.*


class DetailActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)

        initToolbar()
        recylerViewShow()
    }

    private fun recylerViewShow() = with(binding){
        val data = intent.getParcelableExtra<Animapp>("DATA")
        if (data != null){
            title = data.name
            animal_name.text = data.name
            class_name.text = data.className
            orde_name.text = data.ordeName
            family_name.text = data.familyName
            overview.text = data.overview
            reproduction.text = data.reproduction
            Glide.with(this@DetailActivity)
                .load(data.img)
                .apply(RequestOptions()
                    .fitCenter()
                    .format(DecodeFormat.PREFER_ARGB_8888)
                    .override(Target.SIZE_ORIGINAL))
                .into(img_animal)
        }
        infoBtn.setOnClickListener {
            if (data != null) {
                goToUrl(data.information)
            }
        }
    }

    private fun goToUrl(url: String) {
        val intent = Intent()
        intent.action = Intent.ACTION_VIEW
        intent.addCategory(Intent.CATEGORY_BROWSABLE)
        intent.data = Uri.parse(url)
        startActivity(intent)
    }

    private fun initToolbar() = with(binding){
        setSupportActionBar(toolbar)
        supportActionBar?.setDisplayShowTitleEnabled(false)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        val id = item.itemId
        if (id == android.R.id.home) {
            onBackPressed()
            return true
        }
        return super.onOptionsItemSelected(item)
    }
}