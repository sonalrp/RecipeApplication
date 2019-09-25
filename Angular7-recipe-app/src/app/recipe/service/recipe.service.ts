import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Recipe } from '../model/recipe.model';

@Injectable({
  providedIn: 'root'
})
export class RecipeService {

  constructor(private http: HttpClient) { }
  baseUrl: string = 'http://localhost:8080/recipe-portal';

  getRecipeById(id: number) {
    return this.http.get<Recipe>(this.baseUrl + '/' + id);
  }

  getAllRecipes() {
    return this.http.get<Recipe>(this.baseUrl + '/search');
  }

  createRecipe(recipe: Recipe) {
    return this.http.post(this.baseUrl + "/create", recipe);
  }

  updateRecipe(recipe: Recipe) {
    return this.http.put(this.baseUrl + '/' + recipe.recipeName, recipe);
  }

  deleteRecipe(recipe: Recipe) {
    return this.http.delete(this.baseUrl + '/' + recipe);
  }
}
