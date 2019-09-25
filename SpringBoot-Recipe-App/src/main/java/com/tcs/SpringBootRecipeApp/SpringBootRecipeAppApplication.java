package com.tcs.SpringBootRecipeApp;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.tcs.SpringBootRecipeApp.entity.Recipe;
import com.tcs.SpringBootRecipeApp.repository.RecipeRepository;

@SpringBootApplication
public class SpringBootRecipeAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootRecipeAppApplication.class, args);
	}
	
	@Bean
	CommandLineRunner runner(RecipeRepository repository) {
		return args -> 	{
			repository.save(new Recipe(1, "Butter Chicken", "new Date(0)", "Y", "4", "ajgkajhs", "aswdjqwghg"));
		};
		
	}

}
