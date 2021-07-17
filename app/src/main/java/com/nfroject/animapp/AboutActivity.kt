package com.nfroject.animapp

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.app.AppCompatDelegate
import com.nfroject.animapp.databinding.ActivityAboutBinding

class AboutActivity : AppCompatActivity() {

    private lateinit var binding: ActivityAboutBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAboutBinding.inflate(layoutInflater)
        setContentView(binding.root)

        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)

        initToolbar()
        actionListener()
    }

    private fun initToolbar() = with(binding){
        setSupportActionBar(toolbar)
        supportActionBar?.setDisplayShowTitleEnabled(false)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }

    private fun actionListener() = with(binding){

        waBtn.setOnClickListener {
            goToUrl("https://wa.me/6285559414940/")
        }

        igBtn.setOnClickListener {
            goToUrl("https://www.instagram.com/nfadjar_/")
        }

        mailBtn.setOnClickListener {
            goToUrl("https://mailto:nurjafar13@gmail.com")
        }

        ytBtn.setOnClickListener {
            goToUrl("https://www.youtube.com/channel/UCT-yXW5W3V4ztjXp7oO0kkA/")
        }
    }

    private fun goToUrl(url: String) {
        val intent = Intent()
        intent.action = Intent.ACTION_VIEW
        intent.addCategory(Intent.CATEGORY_BROWSABLE)
        intent.data = Uri.parse(url)
        startActivity(intent)
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

