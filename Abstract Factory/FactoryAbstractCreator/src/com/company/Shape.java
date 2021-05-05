package com.company;

interface Shape {
    void draw();
}

class Rectangle implements Shape{
    @Override
    public void draw(){
        System.out.println("Im a rectangle");
    }
}

class Square implements Shape {
    @Override
    public void draw(){
        System.out.println("Ima a square");
    }
}

class Circle implements Shape{
    @Override
    public void draw(){
        System.out.println("Im a circle");
    }
}
