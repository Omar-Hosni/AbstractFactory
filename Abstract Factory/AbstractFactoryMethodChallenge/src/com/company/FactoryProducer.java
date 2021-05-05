package com.company;

public class FactoryProducer {
    public static AbstractFactory getFactory(String choice){

        if(choice.equalsIgnoreCase("TYPE")){
            return new TypeFactory();
        }else if(choice.equalsIgnoreCase("GENRE")){
            return new GenreFactory();
        }
        return null;
    }
}
