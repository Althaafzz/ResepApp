package com.althaafridha.recipeapp.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.GridLayout
import androidx.recyclerview.widget.GridLayoutManager
import com.althaafridha.recipeapp.R
import com.althaafridha.recipeapp.adapter.RecipesAdapter
import com.althaafridha.recipeapp.data.DataRecipes
import com.althaafridha.recipeapp.databinding.FragmentBreakfastBinding

class BreakfastFragment : Fragment() {

    private var _binding: FragmentBreakfastBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentBreakfastBinding.inflate(inflater, container, false)

        binding.rvBreakfast.apply {
            setHasFixedSize(true)
            layoutManager = GridLayoutManager(context, 2)
            adapter = RecipesAdapter(DataRecipes.listBreakfast)
        }
        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}