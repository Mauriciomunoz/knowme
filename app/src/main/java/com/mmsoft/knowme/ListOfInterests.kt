package com.mmsoft.knowme

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup


class ListOfInterests : Fragment() {

    companion object {
        fun newInstance() = ListOfInterests()
    }

    private lateinit var viewModel: ListOfInterestsViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.list_of_interests_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(ListOfInterestsViewModel::class.java)
        // TODO: Use the ViewModel
    }

}
