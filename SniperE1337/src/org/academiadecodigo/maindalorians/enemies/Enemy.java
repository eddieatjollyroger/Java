package org.academiadecodigo.maindalorians.enemies;

import org.academiadecodigo.maindalorians.Game;
import org.academiadecodigo.maindalorians.SniperE1337;


public abstract class Enemy extends GameObject implements Destroyable {
    private int health = 100;
    private boolean isDead = false;

    public boolean isDead() {
        return isDead;
    }

    public void hit(int damage) {
        if (health > damage) {
            health -= damage;
            System.out.println("hit enemy for " + damage + " " + "remaining health is " + health);
        } else {
            System.out.println("killed enemy with " + damage + " damage");
            isDead = true;
            System.out.println(getMessage());
        }
    }

    @Override
    public boolean isDestroyed() {
        return isDead;
    }

    public String getMessage() {
        return "Fak I ded";
    }
}
