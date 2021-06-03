package org.academiadecodigo.maindalorians;

import org.academiadecodigo.maindalorians.enemies.Destroyable;
import org.academiadecodigo.maindalorians.enemies.Enemy;

public class SniperRifle {
    private int bulletDamage;

    public void shoot(Destroyable destroyable) {
        int counter = 0;
        while (!destroyable.isDestroyed()) {
            bulletDamage = (int) ((Math.random() * 100) + 1);
            counter++;
            destroyable.hit(bulletDamage);

        }
        System.out.println("Killed enemy in " + counter + " shots");
        System.out.println("-----------------------------------------");
    }
}
