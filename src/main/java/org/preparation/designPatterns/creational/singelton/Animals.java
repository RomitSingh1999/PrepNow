package org.preparation.designPatterns.creational.singelton;

public class Animals {
    private Animals(){}

    private static Animals animalInstance;

    public void speak()
    {
        System.out.println("Yes I am a animal!!");
    }


    public static synchronized Animals getInstance(){
            if(animalInstance==null)
                animalInstance=new Animals();
            return animalInstance;
    }

}
