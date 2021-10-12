package edu.temple.starsignimageviewerapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView

class SelectionActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //image_names array from resources
        val imageNames = resources.getStringArray(R.array.image_names)

        //instantiating imageObjects array
        val imageObjects = arrayOf(ImageObject(imageNames[0], R.drawable.aquarius)
            , ImageObject(imageNames[1], R.drawable.aries)
            , ImageObject(imageNames[2], R.drawable.cancer)
            , ImageObject(imageNames[3], R.drawable.capricorn)
            , ImageObject(imageNames[4], R.drawable.gemini)
            , ImageObject(imageNames[5], R.drawable.leo)
            , ImageObject(imageNames[6], R.drawable.libra)
            , ImageObject(imageNames[7], R.drawable.pisces)
            , ImageObject(imageNames[8], R.drawable.sagittarius)
            , ImageObject(imageNames[9], R.drawable.scorpio)
            , ImageObject(imageNames[10], R.drawable.taurus)
            , ImageObject(imageNames[11], R.drawable.virgo)
        )


        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        recyclerView.adapter = ImageAdapter(this, imageObjects)

    }
}