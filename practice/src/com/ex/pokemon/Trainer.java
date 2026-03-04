package com.ex.pokemon;

import com.ex.coffee.Machine;

public class Trainer {
    private Skill no1 = new Skill();
    private Skill no2 = new Skill();
    private Skill no3 = new Skill();

    public void grass() {
        no1.goGreen();
    }

    public void water() {
        no2.goblue();
    }

    public void fire() {
        no3.gored();
    }
}
