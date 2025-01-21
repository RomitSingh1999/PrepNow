package org.preparation.designPatterns.creational.factory.stores;

import org.preparation.designPatterns.creational.factory.candies.Candy;
import org.preparation.designPatterns.creational.factory.candies.mangoCandy;
import org.preparation.practice.PracticeProblems;

public class mangoCandyStore implements CandyStore {
    @Override
    public Candy getCandy() {
        return new mangoCandy();
    }
}
