package com.ex.burger;

public class WildcardBurger {
    public void anyType(Kitchen<?> king) {
        king.getBuyBurger().order();
    }

    public void extendsType(Kitchen<? extends CheeseBurger> king) {
        king.getBuyBurger().order();
    }

    public void superType(Kitchen<? super CheeseBurger> king) {
        king.getBuyBurger().order();
    }
}
