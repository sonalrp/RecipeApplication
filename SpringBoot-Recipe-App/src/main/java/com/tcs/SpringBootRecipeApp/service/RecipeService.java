package com.tcs.SpringBootRecipeApp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tcs.SpringBootRecipeApp.entity.Recipe;
import com.tcs.SpringBootRecipeApp.repository.RecipeRepository;

@Service("recipeService")
public class RecipeService{

	@Autowired
	private RecipeRepository recipeRepository;
	
	public List<Recipe> findAll() {
        return recipeRepository.findAll();
    }

    public Optional<Recipe> findById(Long id) {
        return recipeRepository.findById(id);
    }

    public Recipe save(Recipe recipe) {
        return recipeRepository.save(recipe);
    }

    public void deleteById(Long id) {
    	recipeRepository.deleteById(id);
    }
    
    public void deleteAll() {
    	recipeRepository.deleteAll();
    }

}
