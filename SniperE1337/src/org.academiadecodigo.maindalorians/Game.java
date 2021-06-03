package org.academiadecodigo.maindalorians;

import org.academiadecodigo.maindalorians.enemies.*;


public class Game {
    public static final int GAME_OBJECTS = 15;
    private int shotsFired;
    private GameObject[] gameObjects;
    private SniperRifle sniperRifle;

    public void start() {
        createObjects(GAME_OBJECTS);
        for (int i = 0; i < gameObjects.length; i++) {
            if (gameObjects[i] instanceof Destroyable) {
                sniperRifle.shoot((Destroyable) gameObjects[i]);
            }
        }
    }


    public GameObject[] createObjects(int gameObject) {
        sniperRifle = new SniperRifle();
        gameObjects = new GameObject[GAME_OBJECTS];
        for (int i = 0; i < gameObjects.length; i++) {
            int random = (int) (Math.random() * 100);
            if (random < 15) {
                gameObjects[i] = new Tree();
            } else if (random > 14 && random < 40) {
                gameObjects[i] = new ArmouredEnemy();
            } else if (random > 39 && random < 60) {
                gameObjects[i] = new SoldierEnemy();
            } else {
                gameObjects[i] = new Barrel();
            }
        }
        return gameObjects;
    }
}

