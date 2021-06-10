package com.example.kotlin1dz2

import android.widget.ImageView
import com.bumptech.glide.Glide

fun ImageView.loadImage(photo: String){

    Glide.with(this).load(photo).into(this)

}

fun urlImage(massive: MutableList<String>, string: String){
    massive.add(string)

}