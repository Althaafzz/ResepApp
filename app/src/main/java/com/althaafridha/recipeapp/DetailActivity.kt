package com.althaafridha.recipeapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.althaafridha.recipeapp.data.Recipes
import com.althaafridha.recipeapp.databinding.ActivityDetailBinding
import com.bumptech.glide.Glide

class DetailActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDetailBinding

    companion object {
        const val RECIPES_DATA = "recipes"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setSupportActionBar(binding.toolbarDetail)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val dataRecipes = intent.getParcelableExtra<Recipes>(RECIPES_DATA) as Recipes

        binding.apply {
            tvNameRecipeDetail.text = dataRecipes.name
            tvCaloriesDetail.text = dataRecipes.calories
            tvCarboDetail.text = dataRecipes.carbo
            tvProteinDetail.text = dataRecipes.protein
            tvDescriptionDetail.text = dataRecipes.description
            tvIngredientsDetail.text = dataRecipes.ingredients
            tvInstructionDetail.text = dataRecipes.instructions
        }
        Glide.with(this).load(dataRecipes.photo).into(binding.imgDetail)
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return super.onSupportNavigateUp()
    }
}