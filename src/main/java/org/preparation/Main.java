package org.preparation;

import org.preparation.designPatterns.creational.factory.OSFactory;
import org.preparation.designPatterns.creational.factory.Os;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        OSFactory factory= new OSFactory();
        Os newOs=factory.getOsInstance("laptopFlexible");
        if(newOs==null) {
            System.out.println("No Os detected!");
            return;
        }
        System.out.println(newOs.spec());
    }
}