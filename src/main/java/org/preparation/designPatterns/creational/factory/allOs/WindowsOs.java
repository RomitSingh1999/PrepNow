package org.preparation.designPatterns.creational.factory.allOs;

import org.preparation.designPatterns.creational.factory.Os;

public class WindowsOs implements Os {
    @Override
    public String spec() {
        return "I am a very wide know Os and I am very flexible";
    }
}
