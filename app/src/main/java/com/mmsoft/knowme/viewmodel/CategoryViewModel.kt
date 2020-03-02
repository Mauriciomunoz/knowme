package com.mmsoft.knowme.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.mmsoft.knowme.FakeRepository
import com.mmsoft.knowme.model.Category

class CategoryViewModel:ViewModel(){
    private var _categoryMutableLiveData=MutableLiveData<ArrayList<Category>>()
    var categoryArrayList=ArrayList<Category>()


    val categories:LiveData<ArrayList<Category>>
        get()=_categoryMutableLiveData


    fun getCategoryArrayList(){//:MutableLiveData<ArrayList<CategoryViewModel>>{

        categoryArrayList= FakeRepository.getCategories()
        _categoryMutableLiveData.value=categoryArrayList
    }




}