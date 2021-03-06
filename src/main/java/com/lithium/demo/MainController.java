package com.lithium.demo;

import com.lithium.demo.services.Cat;
import com.lithium.demo.useCases.EnlistCats;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    private EnlistCats enlistCats;

    public MainController(EnlistCats enlistCats) {
        super();
        this.enlistCats = enlistCats;
    }

    @GetMapping("/cats")
    public Cat getCat() throws CatNotFound {
        Cat[] cats = enlistCats.getCats();
        if (cats.length < 1) {
            throw new CatNotFound();
        }
        return cats[0];
    }
}
