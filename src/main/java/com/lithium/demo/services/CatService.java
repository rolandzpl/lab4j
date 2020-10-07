package com.lithium.demo.services;

public interface CatService {
    
    Cat[] getCats();

    Cat getCatByName(String name);
}
