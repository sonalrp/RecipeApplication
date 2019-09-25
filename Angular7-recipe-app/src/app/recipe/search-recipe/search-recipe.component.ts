import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup, FormBuilder } from '@angular/forms';
import { RecipeService } from '../service/recipe.service';
import { Recipe } from '../model/recipe.model';

@Component({
  selector: 'app-search-recipe',
  templateUrl: './search-recipe.component.html',
  styleUrls: ['./search-recipe.component.scss']
})
export class SearchRecipeComponent implements OnInit {

  view:boolean= false;
  recipeForm: FormGroup;
  recipes: Recipe[];

  //recipes = ['Select', 'USA', 'Canada', 'Uk']
  constructor(private fb: FormBuilder, private recipeService: RecipeService) {}

  ngOnInit() {
    // this.recipeForm = this.fb.group({
    //   recipeControl: ['Select']
    // });
    this.view = true;
    this.recipeService.getAllRecipes()
      .subscribe( data => {
         console.log(data);
      });
  }

  createForm() {
    
  }

  // search(searchInput: number) {
  //   this.view = true;
  //   this.recipeService.getRecipeById(searchInput);
  //   //console.log(searchInput.nativeElement.value);
  // }
  

  // search() {
  //   this.view = true;
  //   this.recipeService.getAllRecipes()
  //     .subscribe( data => {
  //       this.recipes = data;
  //     });
  // }
//    recipeconsts: Recipe[] = [
//     {recipeId:'', recipeName: '1050 AJ', creationdatenadtime: 'Fe', veg: '0.297', noofppl:'', listofingrediants:'', cookinginstructions:'' },
//     {recipeId:'', recipeName: '1050 AJ', creationdatenadtime: 'Fe', veg: '0.297', noofppl:'', listofingrediants:'', cookinginstructions:'' },
//     {recipeId:'', recipeName: '1050 AJ', creationdatenadtime: 'Fe', veg: '0.297', noofppl:'', listofingrediants:'', cookinginstructions:'' },
//     {recipeId:'', recipeName: '1050 AJ', creationdatenadtime: 'Fe', veg: '0.297', noofppl:'', listofingrediants:'', cookinginstructions:'' },
//     {recipeId:'', recipeName: '1050 AJ', creationdatenadtime: 'Fe', veg: '0.297', noofppl:'', listofingrediants:'', cookinginstructions:'' }    
// ];

}
