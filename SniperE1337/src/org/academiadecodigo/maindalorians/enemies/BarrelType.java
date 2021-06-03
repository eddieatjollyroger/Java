package org.academiadecodigo.maindalorians.enemies;

public enum BarrelType {
    PLASTIC,
    WOOD,
    METAL;

    private int maxDamage;

    public int getMaxDamage() {
        if (equals(PLASTIC)) {
            maxDamage = 50;
            return maxDamage;
        } else if (equals(WOOD)) {
            maxDamage = 75;
            return maxDamage;
        } else {
            maxDamage = 100;
            return maxDamage;
        }
    }
}


