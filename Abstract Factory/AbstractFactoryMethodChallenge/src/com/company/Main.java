package com.company;

public class Main {
    public static void main(String[] args){

        AbstractFactory movieType = FactoryProducer.getFactory("TYPE");
        Type t1 = movieType.getType("HOLLYWOOD");
        t1.show();

        Type t2 = movieType.getType("BOLLYWOOD");
        t2.show();



        AbstractFactory movieGenre = FactoryProducer.getFactory("GENRE");
        Genre g1 = movieGenre.getGenre("COMEDY");
        g1.description();

        Genre g2 = movieGenre.getGenre("ACTION");
        g2.description();

    }
}
