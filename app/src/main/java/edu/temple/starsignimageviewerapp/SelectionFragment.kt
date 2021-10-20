package edu.temple.starsignimageviewerapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.RecyclerView

/**
 * A simple [Fragment] subclass.
 * Use the [SelectionFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class SelectionFragment : Fragment() {

    lateinit var imageObjects: Array<ImageObject>
    lateinit var recyclerView: RecyclerView
    lateinit var layout: View
    private var imageViewModel: ImageViewModel? = null

    var startIndex : Int? = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        startIndex = arguments?.getInt("startIndex", 0)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        layout = inflater.inflate(R.layout.fragment_selection, container, false)
        recyclerView = layout.findViewById(R.id.recyclerView)

        return layout;
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment SelectionFragment.
         */

        @JvmStatic
        fun newInstance(param1: Array<ImageObject>): SelectionFragment{
            val fragment = SelectionFragment()
            fragment.imageObjects = param1
            return fragment
            /*val bundle: Bundle = Bundle()
            bundle.putParcelable("ImageObjects", param1)
            SelectionFragment().apply {
                arguments = Bundle().apply {
                }
            }*/
        }
    }
}