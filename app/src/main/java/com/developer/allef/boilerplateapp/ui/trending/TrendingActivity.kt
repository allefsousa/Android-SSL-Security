package com.developer.allef.boilerplateapp.ui.trending

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.developer.allef.boilerplateapp.R
import org.koin.androidx.viewmodel.ext.android.viewModel

class TrendingActivity : AppCompatActivity() {
    private val trendingViewModel: TrendingViewModel by viewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_trending)

        trendingViewModel.getTopRepositories()

    }
}
