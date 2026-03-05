package com.ex.mcdonald;

public class Kitchen<T extends Burger> {

    private T OrderBurger;

    public Kitchen() {}

    public Kitchen(T orderBurger) {
        OrderBurger = orderBurger;
    }

    public T getOrderBurger() {
        return OrderBurger;
    }

    public void setOrderBurger(T orderBurger) {
        OrderBurger = orderBurger;
    }
}
