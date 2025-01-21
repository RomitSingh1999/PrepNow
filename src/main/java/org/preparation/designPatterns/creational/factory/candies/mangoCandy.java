package org.preparation.designPatterns.creational.factory.candies;

public class mangoCandy implements Candy{
    @Override
    public String candyName() {
        return "SweetMango";
    }

    @Override
    public Integer candySweetness() {
        return 15;
    }

    @Override
    public String candyColor() {
        return "yellow";
    }
}
