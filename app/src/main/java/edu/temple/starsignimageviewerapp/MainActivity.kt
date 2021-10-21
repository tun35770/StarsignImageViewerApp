package edu.temple.starsignimageviewerapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import androidx.fragment.app.FragmentManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
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

        //instantiate fragments
        val selectionFragment = SelectionFragment.newInstance(imageObjects)
        val displayFragment = DisplayFragment()


        //add fragments to container views
        supportFragmentManager.beginTransaction()
            .add(R.id.SelectionFragment, selectionFragment)
            .add(R.id.DisplayFragment, displayFragment)
            .commit()

    }
}