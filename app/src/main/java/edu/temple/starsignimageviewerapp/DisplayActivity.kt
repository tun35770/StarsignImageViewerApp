package edu.temple.starsignimageviewerapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class DisplayActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_display)

        val textView = findViewById<TextView>(R.id.textView)
        val imageView = findViewById<ImageView>(R.id.imageView)

        //get values from intent
        val title = getIntent().getStringExtra("title")
        val resourceId = getIntent().getIntExtra("resourceId", 1)


        //set values from intent
        textView.setText(title)
        imageView.setImageResource(resourceId)


    }
}