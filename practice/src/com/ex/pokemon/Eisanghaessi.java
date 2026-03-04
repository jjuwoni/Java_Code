package com.ex.pokemon;

public class Eisanghaessi extends Pokemons {

    @Override
    public void tackle() {
        System.out.println("@@@@@@@@@@이상해씨!! 몸통박치기!!!");
    }

    @Override
    public void staring() {
        System.out.println("@@@@@@@@@@이상해씨!! 째려보기!!!");
    }

    @Override
    public void coming() {
        super.coming();
    }

    public void rootAttack() {
        System.out.println("@@@@@@@@@@이상해씨!! 덩쿨채찍!!!");
    }
}
