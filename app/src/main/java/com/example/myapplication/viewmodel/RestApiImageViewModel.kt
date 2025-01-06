package com.example.myapplication.viewmodel


import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.myapplication.api.BaseRetrofitClient
import com.example.myapplication.model.InfoImage
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

// RestApiImageViewModel use to handle logic get list image from response api
class RestApiImageViewModel : ViewModel() {
    // use LiveData to storage data image from response api
    val infoImageLiveData = MutableLiveData<ArrayList<InfoImage>>()

    // function get lis image from response api and update LiveData
    fun fetchListInfoImage() {
        viewModelScope.launch(Dispatchers.IO) {
            try {
                val infoImageList = BaseRetrofitClient.retrofitApi.getListInfoImage()
                infoImageLiveData.postValue(infoImageList)
            } catch (e: Exception) {
            }
        }
    }
}