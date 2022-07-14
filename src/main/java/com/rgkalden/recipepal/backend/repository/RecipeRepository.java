package com.rgkalden.recipepal.backend.repository;

import com.rgkalden.recipepal.backend.model.Recipe;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RecipeRepository extends JpaRepository<Recipe, Long> {

        List<Recipe> findByPublished(boolean published);
        List<Recipe> findByTitleContaining(String title);

}
