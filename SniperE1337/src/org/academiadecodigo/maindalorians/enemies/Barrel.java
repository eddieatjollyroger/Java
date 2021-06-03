package org.academiadecodigo.maindalorians.enemies;

import org.academiadecodigo.maindalorians.*;

public class Barrel extends GameObject implements Destroyable {
    private BarrelType barrelType;
    private int currentDamage;
    private boolean destroyed;

    public Barrel() {
        int random = (int) (Math.random() * 100);
        if (random < 30) {
            this.barrelType = BarrelType.PLASTIC;
            currentDamage = barrelType.getMaxDamage();
        } else if (random > 29 && random < 80) {
            this.barrelType = BarrelType.WOOD;
            currentDamage = barrelType.getMaxDamage();
        } else {
            this.barrelType = BarrelType.METAL;
            currentDamage = barrelType.getMaxDamage();
        }
    }

    @Override
    public void hit(int damage) {
        if (damage < currentDamage) {
            currentDamage -= damage;
            System.out.println("hit " + barrelType.name() + " barrel for " + damage + " remaining health is " + currentDamage);
        } else {
            currentDamage = 0;
            destroyed = true;
            System.out.println("Destroyed " + barrelType.name() + " barrel with " + damage);
        }
    }

    @Override
    public boolean isDestroyed() {
        return destroyed;
    }

    @Override
    public String getMessage() {
        return "boas I barrel gái";
    }
}
