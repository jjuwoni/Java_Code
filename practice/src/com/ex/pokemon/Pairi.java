package com.ex.pokemon;

public class Pairi extends Pokemons{

    @Override
    public void tackle() {
        System.out.println("@@@@@@@@@@파이리!!! 몸통박치기!!!");
    }

    @Override
    public void staring() {
        System.out.println("@@@@@@@@@@파이리!!! 째려보기!!!");
    }

    @Override
    public void coming() {
        super.coming();
    }

    public void fireShot() {
        System.out.println("@@@@@@@@@@파이리!! 불꽃세레!!!!");
    }
}
