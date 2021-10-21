package edu.temple.starsignimageviewerapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider

/**
 * A simple [Fragment] subclass.
 * Use the [DisplayFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class DisplayFragment : Fragment() {


    lateinit private var imageViewModel: ImageViewModel
    lateinit private var title: TextView
    lateinit private var image: ImageView
    lateinit private var layout: View

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {

        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        layout = inflater.inflate(R.layout.fragment_display, container, false)
        // Inflate the layout for this fragment

        return layout
    }

    override fun onViewCreated(view: android.view.View, savedInstanceState: android.os.Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        imageViewModel = ViewModelProvider(requireActivity()).get(ImageViewModel::class.java)

        title = layout.findViewById(R.id.displayTextView)
        image = layout.findViewById(R.id.displayImageView)

        //observe image and text
        //val imageObserver = Observer<Int> {item -> image.setImageResource(item)}
        //imageViewModel.getResourceId().observe(this, imageObserver)
        imageViewModel.getResourceId().observe(viewLifecycleOwner, Observer{it ->
            image.setImageResource(it)
        })

        // titleObserver = Observer<String> {item -> title.text = item}
        //imageViewModel.getTitle().observe(this, titleObserver)
        imageViewModel.getTitle().observe(viewLifecycleOwner, Observer{it ->
            title.text = it
        })
    }
    /*companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment DisplayFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            DisplayFragment().apply {
                arguments = Bundle().apply {

                }
            }
    }*/
}