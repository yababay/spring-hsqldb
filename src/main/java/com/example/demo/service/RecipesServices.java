package com.example.demo.service;

import com.example.demo.models.Recipes;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public interface RecipesServices {
    List<Recipes> getRecipes();

    Recipes save(Recipes recipes);

    void delete(Recipes recipes);

    //Recipes getRecipByName(String name);
}
