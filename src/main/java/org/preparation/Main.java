package org.preparation;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import org.preparation.designPatterns.creational.factory.stores.CandyStore;
import org.preparation.designPatterns.creational.factory.stores.mangoCandyStore;
import org.preparation.designPatterns.creational.factory.stores.orangeCandyStore;

public class Main {
    public static void main(String[] args) {
        CandyStore candyStore= new mangoCandyStore();
        CandyStore candyStore1=new orangeCandyStore();
        System.out.println(candyStore.sellCandy());
        System.out.println(candyStore1.sellCandy());
    }
}