package com.mmsoft.knowme

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.mmsoft.knowme.model.Category
import java.util.*
import kotlin.collections.ArrayList

object FakeRepository {

    private val category1= Category("1","Movies","Movies do you like","img1.png")
    private val category2= Category("2","Books","Books do you like","img2.png")
    private val category3= Category("3","Music","Music do you like","img2.png")

    private val categoryList: List<Category> ? = null

    var categoryArrayList=ArrayList<Category>()

    init {
        categoryArrayList!!.add(category1)
        categoryArrayList!!.add(category2)
        categoryArrayList!!.add(category3)
    }

    fun getCategories():ArrayList<Category>{
        return categoryArrayList
    }

}