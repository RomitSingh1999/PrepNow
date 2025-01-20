package org.preparation.designPatterns.creational.factory;

import org.preparation.designPatterns.creational.factory.allOs.AndroidOs;
import org.preparation.designPatterns.creational.factory.allOs.IosOs;
import org.preparation.designPatterns.creational.factory.allOs.MacOs;
import org.preparation.designPatterns.creational.factory.allOs.WindowsOs;

public class OSFactory {
    public Os getOsInstance(String s){
        switch (s){
            case("phoneFlexible"):
                return new AndroidOs();
            case("phoneSecure"):
                return new IosOs();
            case("laptopFelxible"):
                return new WindowsOs();
            case("laptopSecure"):
                return new MacOs();
        }
        return null;
    }
}
