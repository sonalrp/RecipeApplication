package com.tcs.SpringBootRecipeApp.controllers;

import java.sql.Date;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.skyscreamer.jsonassert.JSONAssert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.tcs.SpringBootRecipeApp.entity.Recipe;
import com.tcs.SpringBootRecipeApp.service.RecipeService;

@RunWith(SpringRunner.class)
@WebMvcTest(value = RecipeController.class, secure = false)
@SuppressWarnings("unchecked")
public class RecipeControllerTest {

	@Autowired
	private MockMvc mockMvc;
	
	@MockBean
	private RecipeService recipeService;
	
	List<Recipe> mockrecipe = (List<Recipe>) new Recipe(1, "Butter Chicken", "new Date(0)", "Y", "4", "ajgkajhs", "aswdjqwghg");
	
	@Test
	public void getRecipeLists() throws Exception {
		Mockito.when(recipeService.findAll()).thenReturn(mockrecipe);
		
		RequestBuilder requestBuilder  = MockMvcRequestBuilders.get("/getRecipeLists").accept(MediaType.APPLICATION_JSON);
		
		MvcResult result =  mockMvc.perform(requestBuilder).andReturn();	
		
		System.out.println(result.getResponse());
		
		String expected = "{recipeId:1,recipeName:Butter Chicken,created_date_time:1970-01-01,veg:Y,no_of_ppl:4,list_of_ingrediants:ajgkajhs,cooking_instructions:aswdjqwghg}";	
		
		JSONAssert.assertEquals(expected, result.getResponse().getContentAsString(), false);
	}
}
