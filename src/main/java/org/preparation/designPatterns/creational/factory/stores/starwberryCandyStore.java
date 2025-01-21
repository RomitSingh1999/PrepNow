package org.preparation.designPatterns.creational.factory.stores;

import org.preparation.designPatterns.creational.factory.candies.Candy;
import org.preparation.designPatterns.creational.factory.candies.strawberryCandy;

public class starwberryCandyStore implements CandyStore{
    @Override
    public Candy getCandy() {
        return new strawberryCandy();
    }
}
