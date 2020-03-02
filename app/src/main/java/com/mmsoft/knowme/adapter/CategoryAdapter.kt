package com.mmsoft.knowme.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.mmsoft.knowme.R
import com.mmsoft.knowme.databinding.CategoryItemBinding
import com.mmsoft.knowme.model.Category

class CategoryAdapter(
    private val categories:List<Category>
):RecyclerView.Adapter<CategoryAdapter.CategoryViewHolder>(){


    override fun getItemCount(): Int {
        return categories.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CategoryViewHolder {
        return CategoryViewHolder(
            DataBindingUtil.inflate(
                LayoutInflater.from(parent.context),
                R.layout.category_item,
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: CategoryViewHolder, position: Int) {
        holder.categoryItemBinding.category = categories[position]
    }

    inner class CategoryViewHolder(val categoryItemBinding: CategoryItemBinding
    ):RecyclerView.ViewHolder(categoryItemBinding.root)

}