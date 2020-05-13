package com.mmsoft.knowme.ui.mainknowme

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction
import com.mmsoft.knowme.ListOfInterests
import com.mmsoft.knowme.MainActivity
import com.mmsoft.knowme.R
import com.mmsoft.knowme.databinding.MainKnowMeFragmentBinding
import com.mmsoft.knowme.viewmodel.CategoryViewModel


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
        binding.clicked=this


        //Return the inflated view with the listener attached.
        return binding.root
    }

    fun clicked(view: View, idView:Int){

        var fm:FragmentManager
        when(idView){
            1 -> {
                val detailsFragment: ListOfInterests =
                    ListOfInterests.newInstance()

                val fg: FragmentManager? =fragmentManager
                if (fg != null) {
                    fg.beginTransaction()
                    .replace(R.id.fragment_container, detailsFragment)
                    .addToBackStack(null)
                    .commit()
                }


            }


            2 -> Toast.makeText(view.context, "Clicked Music",Toast.LENGTH_LONG).show()
            3 -> Toast.makeText(view.context, "Clicked Books",Toast.LENGTH_LONG).show()
            4 -> Toast.makeText(view.context, "Clicked Hobbies",Toast.LENGTH_LONG).show()
            5 -> Toast.makeText(view.context, "Clicked Topics",Toast.LENGTH_LONG).show()
            6 -> Toast.makeText(view.context, "Clicked Quotes",Toast.LENGTH_LONG).show()
            7 -> Toast.makeText(view.context, "Clicked Food",Toast.LENGTH_LONG).show()
            8 -> Toast.makeText(view.context, "Clicked Custom",Toast.LENGTH_LONG).show()
        }


    }

}