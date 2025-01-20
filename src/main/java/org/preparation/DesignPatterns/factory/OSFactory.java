package org.preparation.DesignPatterns.factory;

import org.preparation.DesignPatterns.factory.allOs.AndroidOs;
import org.preparation.DesignPatterns.factory.allOs.IosOs;
import org.preparation.DesignPatterns.factory.allOs.MacOs;
import org.preparation.DesignPatterns.factory.allOs.WindowsOs;

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
