package org.preparation.designPatterns.creational.factory.candies;

public class strawberryCandy implements Candy{
    @Override
    public String candyName() {
        return "Strawberry";
    }

    @Override
    public Integer candySweetness() {
        return 8;
    }

    @Override
    public String candyColor() {
        return "pink";
    }
}
