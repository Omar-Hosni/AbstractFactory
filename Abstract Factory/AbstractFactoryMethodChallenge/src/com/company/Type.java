package com.company;

interface Type{
    void show();
}

class Hollywood implements Type{

    @Override
    public void show(){
        System.out.println("displaying a hollywood movie");
    }

}

class Bollywood implements Type{

    @Override
    public void show(){
        System.out.println("displaying a bollywood movie");
    }
}