package com.example.demo.service;

import com.example.demo.models.Recipes;
import com.example.demo.models.Recipes;
import com.example.demo.repository.RecipesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import com.google.common.collect.Lists;


@Service
public class RecipesServiceImpl implements RecipesServices{
    private RecipesRepository recipRepository;

    @Autowired
    public RecipesServiceImpl(RecipesRepository recipRepository) {
        this.recipRepository = recipRepository;
    }


    @Override
    public List<Recipes> getRecipes() {
        return null;
    }

    @Override
    public Recipes save(Recipes recipes) {
        return null;
    }

    @Override
    public void delete(Recipes recipes) {

    }
}
