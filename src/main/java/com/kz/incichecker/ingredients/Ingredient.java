package com.kz.incichecker.ingredients;

import lombok.Data;
import org.springframework.data.annotation.Id;

@Data
public class Ingredient {
    @Id
    private long id;
    private String name;
    private String description;
}
