import { NgModule, CUSTOM_ELEMENTS_SCHEMA } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { MatDatepickerModule, MatNativeDateModule } from '@angular/material';
import { SearchRecipeComponent } from './search-recipe/search-recipe.component';
import { CreateRecipeComponent } from './create-recipe/create-recipe.component';

@NgModule({
  declarations: [SearchRecipeComponent, CreateRecipeComponent],
  imports: [
    CommonModule,
    FormsModule,
    ReactiveFormsModule,
    MatDatepickerModule,
    MatNativeDateModule
  ],
  exports: [SearchRecipeComponent, CreateRecipeComponent, MatDatepickerModule, MatNativeDateModule],
  schemas: [
    CUSTOM_ELEMENTS_SCHEMA,
  ]
})
export class RecipeModule { }
