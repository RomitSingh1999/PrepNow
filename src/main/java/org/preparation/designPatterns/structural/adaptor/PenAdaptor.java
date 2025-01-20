package org.preparation.designPatterns.structural.adaptor;

public class PenAdaptor implements Pen{
    Pilotpen pilotpen=new Pilotpen();
    @Override
    public String write() {
        return pilotpen.writing();
    }
}
