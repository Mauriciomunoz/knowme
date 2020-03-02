package com.mmsoft.knowme.ui.mainknowme

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.mmsoft.knowme.R
import com.mmsoft.knowme.adapter.CategoryAdapter
import com.mmsoft.knowme.databinding.CategoryItemBinding
import com.mmsoft.knowme.viewmodel.CategoryViewModel
import kotlinx.android.synthetic.main.main_know_me_fragment.*

class MainKnowMeFragment : Fragment() {

    companion object {
        fun newInstance() = MainKnowMeFragment()
    }

    private lateinit var viewModel: CategoryViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return inflater.inflate(R.layout.main_know_me_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        //viewModel = ViewModelProviders.of(this).get(MainKnowMeViewModel::class.java)
        // TODO: Use the ViewModel
        viewModel=ViewModelProviders.of(this).get(CategoryViewModel::class.java )
        viewModel.getCategoryArrayList()
        viewModel.categories.observe(viewLifecycleOwner, Observer { category ->
            category_recycler_view.also {
                it.layoutManager=LinearLayoutManager(requireContext())
                it.setHasFixedSize(true)
                it.adapter=CategoryAdapter(category)
            }
        })
    }

}
