package org.preparation.designPatterns.creational.factory.allOs;

import org.preparation.designPatterns.creational.factory.Os;

public class IosOs implements Os {
    @Override
    public String spec() {
        return "I am used in mobile phones and I am very secure";
    }
}
