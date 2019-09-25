package com.tcs.SpringBootRecipeApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.tcs.SpringBootRecipeApp.entity.Recipe;

@Repository
@Transactional
public interface RecipeRepository extends JpaRepository<Recipe, Long>{

}
