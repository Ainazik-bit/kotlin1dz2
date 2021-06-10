package com.example.kotlin1dz2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        button.setOnClickListener {
            urlImage(massiv, edit_text.text.toString())
        }
        random_button.setOnClickListener {
            val random = Random
            val number = random.nextInt(massiv.size)
            image_view.loadImage(massiv.elementAt(number))

        }
           }



    companion object{
        val massiv = mutableListOf("https://i.gifer.com/WPa.gif", "https://i.gifer.com/origin/67/6753f47c6c2c2ed7e8eb32063d5944ab.gif",
            "https://i.gifer.com/26A.gif","https://thumbs.gfycat.com/CarelessAgileKagu-size_restricted.gif",
        "https://99px.ru/sstorage/86/2020/10/image_862210202032412656333.gif")

    }
}