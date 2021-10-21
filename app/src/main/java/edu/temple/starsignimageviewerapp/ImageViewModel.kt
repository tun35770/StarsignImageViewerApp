package edu.temple.starsignimageviewerapp

import android.widget.ImageView
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel


class ImageViewModel: ViewModel() {
    private var resourceId = MutableLiveData<Int>()
    //val resourceId: LiveData<Int> = _resourceId
    private var title = MutableLiveData<String>()
    //val title: LiveData<String> = _title


    fun saveResourceId(newResourceId: Int){
        resourceId.value = newResourceId
    }

    fun getResourceId(): LiveData<Int>{
        return resourceId
    }

    fun saveTitle(newTitle: String){
        title.value = newTitle
    }

    fun getTitle(): LiveData<String>{
        return title
    }

}