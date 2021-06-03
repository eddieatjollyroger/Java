package org.academiadecodigo.maindalorians.enemies;

import org.academiadecodigo.maindalorians.SniperRifle;

public class ArmouredEnemy extends Enemy {
    private int armour = 100;

    @Override
    public void hit(int damage) {
        if (armour != 0) {
            if (armour > damage) {
                armour -= damage;
                System.out.println("Hit armour for " + damage + " damage remaining armour is " + armour);
            } else if (armour < damage) {
                System.out.println("Broke armour with " + damage);
                super.hit(damage - armour);
                armour = 0;
            }
        } else {
            super.hit(damage);
        }
    }
}



