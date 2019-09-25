package com.tcs.SpringBootRecipeApp.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="recipe")
public class Recipe implements Serializable{

	private static final long serialVersionUID = 2714899076846796708L;
	
	@Id @GeneratedValue
	@Column(name="recipe_id")
	private int recipeId;
	
	@Column(name="recipe_name")
	private String recipeName;
	
	@Column(name="created_date_time")
	private String created_date_time;
	
	@Column(name="veg")
	private String veg;
	
	@Column(name="no_of_ppl")
	private String no_of_ppl;
	
	@Column(name="list_of_ingrediants")
	private String list_of_ingrediants;
	
	@Column(name="cooking_instructions")
	private String cooking_instructions;
	
	public Recipe() {
	}


	public Recipe(int recipeId, String recipeName, String created_date_time, String veg, String no_of_ppl,
			String list_of_ingrediants, String cooking_instructions) {
		super();
		this.recipeId = recipeId;
		this.recipeName = recipeName;
		this.created_date_time = created_date_time;
		this.veg = veg;
		this.no_of_ppl = no_of_ppl;
		this.list_of_ingrediants = list_of_ingrediants;
		this.cooking_instructions = cooking_instructions;
	}




	public int getRecipeId() {
		return recipeId;
	}


	public void setRecipeId(int recipeId) {
		this.recipeId = recipeId;
	}


	public String getRecipeName() {
		return recipeName;
	}


	public void setRecipeName(String recipeName) {
		this.recipeName = recipeName;
	}


	public String getCreated_date_time() {
		return created_date_time;
	}


	public void setCreated_date_time(String created_date_time) {
		this.created_date_time = created_date_time;
	}


	public String getVeg() {
		return veg;
	}


	public void setVeg(String veg) {
		this.veg = veg;
	}


	public String getNo_of_ppl() {
		return no_of_ppl;
	}


	public void setNo_of_ppl(String no_of_ppl) {
		this.no_of_ppl = no_of_ppl;
	}


	public String getList_of_ingrediants() {
		return list_of_ingrediants;
	}


	public void setList_of_ingrediants(String list_of_ingrediants) {
		this.list_of_ingrediants = list_of_ingrediants;
	}


	public String getCooking_instructions() {
		return cooking_instructions;
	}


	public void setCooking_instructions(String cooking_instructions) {
		this.cooking_instructions = cooking_instructions;
	}


	public static long getSerialversionuid() {
		return serialVersionUID;
	}


	@Override
	public String toString() {
		return "Recipe [recipeId=" + recipeId + ", recipeName=" + recipeName + ", created_date_time="
				+ created_date_time + ", veg=" + veg + ", no_of_ppl=" + no_of_ppl + ", list_of_ingrediants="
				+ list_of_ingrediants + ", cooking_instructions=" + cooking_instructions + "]";
	}
	
}
