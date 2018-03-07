package com.kz.incichecker.ingredients;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "ingredients", path = "ingredient")
public interface IngredientRepository extends MongoRepository<Ingredient, String>{

    List<Ingredient> getAll();
}
