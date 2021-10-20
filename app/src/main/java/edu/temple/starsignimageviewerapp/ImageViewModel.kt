package edu.temple.starsignimageviewerapp

import android.widget.ImageView
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ImageViewModel: ViewModel() {
    private var _resourceId = MutableLiveData<Int>()
    val resourceId: LiveData<Int> = _resourceId
    private var _title = MutableLiveData<String>()
    val title: LiveData<String> = _title

    fun saveResourceId(newResourceId: Int){
        _resourceId.value = newResourceId
    }

    fun saveTitle(newTitle: String){
        _title.value = newTitle
    }

}