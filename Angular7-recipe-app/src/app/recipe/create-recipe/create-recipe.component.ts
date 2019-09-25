import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup, FormBuilder } from '@angular/forms';
import { RecipeService } from '../service/recipe.service';

@Component({
  selector: 'app-create-recipe',
  templateUrl: './create-recipe.component.html',
  styleUrls: ['./create-recipe.component.scss']
})
export class CreateRecipeComponent implements OnInit {

  createRecipeForm: FormGroup;

  constructor(private recipeService: RecipeService) { 
  }

  create() {
    this.recipeService.createRecipe(this.createRecipeForm.value)
      .subscribe( data => {
        //this.router.navigate(['list-user']);
      });
  }

  ngOnInit() {
    this.createRecipeForm = new FormGroup({
      recipeName: new FormControl(),
      picker: new FormControl(),
      veg: new FormControl(),
      noofppl: new FormControl(),
      listofingrediants: new FormControl(),
      cookinginstructions: new FormControl()
   });
  }

}
