package com.mmsoft.knowme.ui.mainknowme

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.ListFragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.mmsoft.knowme.R
import com.mmsoft.knowme.adapter.CategoryAdapter
import com.mmsoft.knowme.databinding.CategoryItemBinding
import com.mmsoft.knowme.databinding.MainKnowMeFragmentBinding
import com.mmsoft.knowme.viewmodel.CategoryViewModel
import kotlinx.android.synthetic.main.main_know_me_fragment.*

class MainKnowMeFragment : Fragment() {

    companion object {
        fun newInstance() = MainKnowMeFragment()
    }

    private lateinit var viewModel: CategoryViewModel
    private lateinit var binding: MainKnowMeFragmentBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {


        // Inflate view and obtain an instance of the binding class
        binding=MainKnowMeFragmentBinding.inflate(inflater,container,false)

        //Attach listener class
        binding.listener=ClickHandler();

        //Return the inflated view with the listener attached.
        return binding.root
    }

}

class ClickHandler{
    fun clickOnMovies(view: View){
        Toast.makeText(view.context, "Clicked",Toast.LENGTH_LONG).show();
    }
}