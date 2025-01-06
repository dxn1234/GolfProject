package com.example.myapplication.view.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.R
import com.example.myapplication.viewmodel.RestApiImageViewModel
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

// fragment contain list favorite image
class FavoriteFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        fetchData()
        return inflater.inflate(R.layout.fragment_favorite, container, false)
    }

    private fun fetchData() {
        CoroutineScope(Dispatchers.IO).launch {
            // run in background thread to get data from room database
            getDataFromRoomDatabase()
            // to UI thread (Dispatchers.Main) to update UI
            withContext(Dispatchers.Main) {
                updateUI()
            }
        }
    }

    private fun getDataFromRoomDatabase() {

    }

    private fun updateUI() {

    }

}