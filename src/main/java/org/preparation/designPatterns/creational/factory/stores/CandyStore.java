package org.preparation.designPatterns.creational.factory.stores;

import org.preparation.designPatterns.creational.factory.candies.Candy;

public interface CandyStore {

    default String sellCandy(){
        Candy candy=getCandy();
        return candy.candyName()+" candies are "+candy.candySweetness()+" unit sweet and its color is "+candy.candyColor();
    }
    Candy getCandy();
}
