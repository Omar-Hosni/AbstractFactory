package com.company;

public abstract class AbstractFactory{
    abstract Genre getGenre(String g);
    abstract Type getType(String t);
}

class TypeFactory extends AbstractFactory{

    @Override
    public Type getType(String t){
        if(t == null){
            return null;
        }

        if(t.equalsIgnoreCase("HOLLYWOOD")){
            return new Hollywood();
        }else if(t.equalsIgnoreCase("BOLLYWOOD")){
            return new Bollywood();
        }
        return null;
    }
    @Override
    Genre getGenre(String g){
        return null;
    }
}



class GenreFactory extends AbstractFactory{

    @Override
    public Genre getGenre(String g){
        if(g == null){
            return null;
        }

        if(g.equalsIgnoreCase("COMEDY")){
            return new Comedy();
        }else if(g.equalsIgnoreCase("ACTION")){
            return new Action();
        }
        return null;
    }
    @Override
    Type getType(String t){
        return null;
    }
}
