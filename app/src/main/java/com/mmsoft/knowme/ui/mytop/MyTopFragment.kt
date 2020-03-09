package com.mmsoft.knowme.ui.mytop

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.mmsoft.knowme.R

class MyTopFragment : Fragment() {

    companion object {
        fun newInstance() = MyTopFragment()
    }

    private lateinit var viewModel: MyTopViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return inflater.inflate(R.layout.my_top_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(MyTopViewModel::class.java)
        // TODO: Use the ViewModel
    }

}
