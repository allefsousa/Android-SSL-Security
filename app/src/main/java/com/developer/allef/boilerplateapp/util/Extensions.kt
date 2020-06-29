package com.developer.allef.boilerplateapp.util

import android.content.Context
import android.widget.ImageView
import androidx.core.content.ContextCompat
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
fun ImageView.loadImage(context:Context,resId: Int) {
    this.setImageDrawable(ContextCompat.getDrawable(context,resId))
}