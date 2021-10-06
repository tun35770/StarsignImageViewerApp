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

        //instantiating imageObjects array
        val imageObjects = arrayOf(ImageObject("Aquarius", R.drawable.aquarius)
            , ImageObject("Aries", R.drawable.aries)
            , ImageObject("Cancer", R.drawable.cancer)
            , ImageObject("Capricorn", R.drawable.capricorn)
            , ImageObject("Gemini", R.drawable.gemini)
            , ImageObject("Leo", R.drawable.leo)
            , ImageObject("Libra", R.drawable.libra)
            , ImageObject("Pisces", R.drawable.pisces)
            , ImageObject("Sagittarius", R.drawable.sagittarius)
            , ImageObject("Scorpio", R.drawable.scorpio)
            , ImageObject("Taurus", R.drawable.taurus)
            , ImageObject("Virgo", R.drawable.virgo)
        )


        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        recyclerView.adapter = ImageAdapter(this, imageObjects)

    }
}