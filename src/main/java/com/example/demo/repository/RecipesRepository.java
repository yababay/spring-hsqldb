package com.example.demo.repository;

import com.example.demo.models.Recipes;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RecipesRepository extends CrudRepository<Recipes, Integer>{

}
