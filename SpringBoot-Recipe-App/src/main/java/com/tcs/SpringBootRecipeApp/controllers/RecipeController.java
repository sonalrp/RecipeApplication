package com.tcs.SpringBootRecipeApp.controllers;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tcs.SpringBootRecipeApp.entity.Recipe;
import com.tcs.SpringBootRecipeApp.service.RecipeService;

@CrossOrigin
@RestController
@RequestMapping("/recipe-portal")
public class RecipeController {

	@Autowired
	private RecipeService recipeService;
	
	@GetMapping(value = "/search", consumes = "application/json;charset=UTF-8")
    public ResponseEntity<List<Recipe>> findAll() {
        return ResponseEntity.ok(recipeService.findAll());
    }

    @PostMapping(value = "/create", consumes = "application/json;charset=UTF-8")
    public ResponseEntity<Recipe> create(@Valid @RequestBody Recipe Recipe) {
        return ResponseEntity.ok(recipeService.save(Recipe));
    }

    @GetMapping(value = "/{id}", consumes = "application/json;charset=UTF-8")
    public ResponseEntity<Recipe> findById(@PathVariable Long id) {
        Optional<Recipe> recipeElement = recipeService.findById(id);
        if (!recipeElement.isPresent()) {
            //log.error("Id " + id + " is not existed");
            ResponseEntity.badRequest().build();
        }
        return ResponseEntity.ok(recipeElement.get());
    }

    @PutMapping(value = "/{id}", consumes = "application/json;charset=UTF-8")
    public ResponseEntity<Recipe> update(@PathVariable Long id, @Valid @RequestBody Recipe Recipe) {
        if (!recipeService.findById(id).isPresent()) {
            //log.error("Id " + id + " is not existed");
            ResponseEntity.badRequest().build();
        }
        return ResponseEntity.ok(recipeService.save(Recipe));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Recipe> delete(@PathVariable Long id) {
        if (!recipeService.findById(id).isPresent()) {
            //log.error("Id " + id + " is not existed");
            ResponseEntity.badRequest().build();
        }
        recipeService.deleteById(id);
        return ResponseEntity.ok().build();
    }
	
}
