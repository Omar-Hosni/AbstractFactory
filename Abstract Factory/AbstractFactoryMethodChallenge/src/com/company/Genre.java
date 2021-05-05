package com.company;

interface Genre{

    void description();
}

class Comedy implements Genre{

    @Override
    public void description(){

        System.out.println("Displaying a comedy movie");

    }
}

class Action implements Genre{

    @Override
    public void description(){

        System.out.println("Displaying an action movie");
    }
}