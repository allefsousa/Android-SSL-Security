package com.developer.allef.boilerplateapp.ui.language

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.developer.allef.boilerplateapp.R
import com.developer.allef.boilerplateapp.ui.trending.TrendingActivity
import com.developer.allef.boilerplateapp.util.loadImage
import kotlinx.android.synthetic.main.activity_language.*
import kotlinx.android.synthetic.main.item_android.*
import kotlinx.android.synthetic.main.item_flutter.*
import kotlinx.android.synthetic.main.item_java.*
import kotlinx.android.synthetic.main.item_kotlin.*

class LanguageActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_language)

        loadImages()


        ll_android.setOnClickListener {
            navigateTrending("android")
        }

        ll_flutter.setOnClickListener {
            navigateTrending("flutter")
        }

        ll_java.setOnClickListener {
            navigateTrending("java")
        }

        ll_kotlin.setOnClickListener {
            navigateTrending("kotlin")
        }


    }

    private fun loadImages() {
        image_android.loadImage("")
        image_flutter.loadImage("")
        image_java.loadImage("")
        image_kotlin.loadImage("")
    }

    private fun navigateTrending(nameTecnology : String){
        val intent = Intent(this,TrendingActivity::class.java).apply {
            putExtra("name",nameTecnology)
        }
        startActivity(intent)
    }
}