package org.preparation.DesignPatterns.factory.allOs;

import org.preparation.DesignPatterns.factory.Os;

public class MacOs implements Os {
    @Override
    public String spec() {
        return "I am Apple based Os for laptops and I am very secure and capable";
    }
}
