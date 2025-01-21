package org.preparation.designPatterns.creational.factory.stores;

import org.preparation.designPatterns.creational.factory.candies.Candy;
import org.preparation.designPatterns.creational.factory.candies.orangeCandy;

public class orangeCandyStore implements CandyStore{
    @Override
    public Candy getCandy() {
        return new orangeCandy();
    }
}
