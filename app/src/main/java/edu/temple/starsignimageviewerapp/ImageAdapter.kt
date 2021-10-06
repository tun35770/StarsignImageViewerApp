package edu.temple.starsignimageviewerapp

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.RecyclerView

class ImageAdapter(val _context : Context, val _imageObjects : Array<ImageObject>): RecyclerView.Adapter<ImageAdapter.ViewHolder>(){

    val context = _context
    val imageObjects = _imageObjects

    //ViewHolder class
    inner class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {

        val imageViewRecycler : ImageView

        init {
            // Define click listener for the ViewHolder's View.
            imageViewRecycler = view.findViewById(R.id.imageViewRecycler)
        }
    }

    // Create new views (invoked by the layout manager)
    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): ImageAdapter.ViewHolder {
        // Create a new view, which defines the UI of the list item
        val view = LayoutInflater.from(viewGroup.context)
            .inflate(R.layout.recycler_element, viewGroup, false)

        return ViewHolder(view)
    }

    // Replace the contents of a view (invoked by the layout manager)
    override fun onBindViewHolder(viewHolder: ImageAdapter.ViewHolder, _position: Int) {

        // Get element from your dataset at this position and replace the
        // contents of the view with that element
        val position = _position
        viewHolder.imageViewRecycler.setImageResource(imageObjects[position].resourceId)

        viewHolder.imageViewRecycler.setOnClickListener(object : View.OnClickListener {
            override fun onClick(view: View?) {
                val intent = Intent(context, DisplayActivity::class.java)
                intent.putExtra("resourceId", imageObjects[position].resourceId)
                intent.putExtra("title", imageObjects[position].title)
                context.startActivity(intent)
            }
        })

    }

    // Return the size of your dataset (invoked by the layout manager)
    override fun getItemCount(): Int{ return imageObjects.size }

}