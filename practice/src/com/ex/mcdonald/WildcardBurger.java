package com.ex.mcdonald;

public class WildcardBurger {

    public void Cheese(Kitchen<?> king) {
        king.getOrderBurger().addCheese();
    }

    public void Patty(Kitchen<?> king) {
        king.getOrderBurger().addPatty();
    }

    public void Sauce(Kitchen<?> king) {
        king.getOrderBurger().addSauce();
    }
}
