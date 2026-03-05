package com.ex.burger;

import java.awt.image.Kernel;

public class Application {
    public static void main(String[] args) {
        WildcardBurger wb = new WildcardBurger();

        wb.anyType(new Kitchen<Burger>(new Burger()));
        wb.anyType(new Kitchen<CheeseBurger>(new CheeseBurger()));
        wb.anyType(new Kitchen<DroppedCheeseBurger>(new DroppedCheeseBurger()));

//        wb.extendsType(new Kitchen<Burger>(new Burger()));
        wb.extendsType(new Kitchen<CheeseBurger>(new CheeseBurger()));
        wb.extendsType(new Kitchen<DroppedCheeseBurger>(new DroppedCheeseBurger()));

        wb.superType(new Kitchen<Burger>(new Burger()));
        wb.superType(new Kitchen<CheeseBurger>(new CheeseBurger()));
//        wb.superType(new Kitchen<DroppedCheeseBurger>(new DroppedCheeseBurger()));
    }
}
