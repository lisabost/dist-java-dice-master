package edu.wctc.dice.impl;

import edu.wctc.dice.iface.DieRoller;

import java.util.Random;

public class D20 implements DieRoller {

    @Override
    public int rollDie() {
        Random random = new Random();
        return random.nextInt(20) + 1;
    }
}
