package com.developer.allef.boilerplateapp.util

import android.widget.ImageView
import com.bumptech.glide.Glide
import com.bumptech.glide.load.resource.bitmap.RoundedCorners
import com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions

/**
 * @author allef.santos on 28/06/20
 */

fun ImageView.loadImage(url: String) {
    Glide.with(this.context)
        .load(url)
        .transform(RoundedCorners(16))
        .transition(DrawableTransitionOptions.withCrossFade())
        .into(this)
}