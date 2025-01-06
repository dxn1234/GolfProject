package com.example.myapplication.view.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.R
import com.example.myapplication.viewmodel.RestApiImageViewModel

class ListFragment : Fragment() {
    private val restApiImageViewModel: RestApiImageViewModel by viewModels()
    private lateinit var recyclerView: RecyclerView
    private lateinit var view: View
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        view = inflater.inflate(R.layout.fragment_list, container, false)
        initView()
        getData()
        onClickView()
        return view
    }

    /* catch event long CLick item in recyclerView
       event scroll recyclerView to bottom screen of device and call func loadMore to scroll list image smooth avoid lag
     */
    private fun onClickView() {

    }

    /* func loadMore remember use progressBar
    to when user scroll to bottom screen of device show progressBar and when have new data image hide progressBar
     */
    private fun loadMoreData() {

    }

    private fun initView() {
        recyclerView = view.findViewById(R.id.recyclerView)
    }

    // put data image from response api into recyclerview
    private fun getData() {
        restApiImageViewModel.infoImageLiveData.observe(viewLifecycleOwner) {
            updateUI()
        }
    }

    private fun updateUI() {
        // format recyclerView like GridView
        val spanCount = 3
        recyclerView.layoutManager = GridLayoutManager(requireContext(), spanCount)
    }
}