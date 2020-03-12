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
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.ListFragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.mmsoft.knowme.MoviesTop
import com.mmsoft.knowme.R
import com.mmsoft.knowme.adapter.CategoryAdapter
import com.mmsoft.knowme.databinding.CategoryItemBinding
import com.mmsoft.knowme.databinding.MainKnowMeFragmentBinding
import com.mmsoft.knowme.ui.mytop.MyTopFragment
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
        binding=MainKnowMeFragmentBinding.inflate(inflater,container,false)
        binding.btnMovies.setOnClickListener{
            navigateToCategory()
        }

        return binding.root
        //return inflater.inflate(R.layout.main_know_me_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        //viewModel = ViewModelProviders.of(this).get(MainKnowMeViewModel::class.java)
        // TODO: Use the ViewModel
        /*
        viewModel=ViewModelProviders.of(this).get(CategoryViewModel::class.java )
        viewModel.getCategoryArrayList()
        viewModel.categories.observe(viewLifecycleOwner, Observer { category ->
            category_recycler_view.also {
                it.layoutManager=LinearLayoutManager(requireContext())
                it.setHasFixedSize(true)
                it.adapter=CategoryAdapter(category)
            }
        })*/
    }

    private fun navigateToCategory(){

        //Toast.makeText(this.context, "Hi there! This is a Toast.", Toast.LENGTH_SHORT).show()
        // Create new fragment (Either map or list fragment) and the transaction
        val fragment = MoviesTop()
        val transaction = fragmentManager!!.beginTransaction()


        // Replace whatever is in the fragment_container view with this fragment,
        // and add the transaction to the back stack if needed
        transaction.replace(R.id.mainknowme, fragment)
  //      transaction.addToBackStack(null)

        // Commit the transaction
        transaction.commit()

    }

}
