package com.lithium.demo.services;

public class DefaultCatService implements CatService {

    @Override
    public Cat[] getCats() {
        return new Cat[0];
    }

    @Override
    public Cat getCatByName(String name) {
        return new Cat(name);
    }
}
