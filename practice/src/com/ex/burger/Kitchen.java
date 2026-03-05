package com.ex.burger;

public class Kitchen<T extends Burger> {

    private T BuyBurger;

    public Kitchen() {}

    public Kitchen(T buyBurger) {
        BuyBurger = buyBurger;
    }

    public T getBuyBurger() {
        return BuyBurger;
    }

    public void setBuyBurger(T buyBurger) {
        BuyBurger = buyBurger;
    }
}
