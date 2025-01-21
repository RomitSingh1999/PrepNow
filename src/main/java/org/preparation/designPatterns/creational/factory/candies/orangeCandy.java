package org.preparation.designPatterns.creational.factory.candies;

public class orangeCandy implements Candy{
    @Override
    public String candyName() {
        return "SourOranges";
    }

    @Override
    public Integer candySweetness() {
        return 10;
    }

    @Override
    public String candyColor() {
        return "orange";
    }
}
