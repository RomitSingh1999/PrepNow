package org.preparation.DesignPatterns.factory.allOs;

import org.preparation.DesignPatterns.factory.Os;

public class AndroidOs implements Os {
    @Override
    public String spec() {
        return "I am only used in mobile phone and I am very flexible";
    }
}
