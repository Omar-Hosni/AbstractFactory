package com.company;

public class Main {
    public static void main(String[] args){

        AbstractFactory shapeChoice = FactoryProducer.getFactory("SHAPE");
        Shape shape1 = shapeChoice.getShape("RECTANGLE");
        shape1.draw();

        AbstractFactory colorChoice = FactoryProducer.getFactory("COLOR");
        Color color1 = colorChoice.getColor("RED");
        color1.fill();
    }
}
