package org.academiadecodigo.maindalorians;

import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Line;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;
import org.academiadecodigo.simplegraphics.pictures.Picture;
import org.academiadecodigo.simplegraphics.mouse.Mouse;
import org.academiadecodigo.simplegraphics.mouse.MouseEvent;
import org.academiadecodigo.simplegraphics.mouse.MouseHandler;

public class Handler implements KeyboardHandler {

    private Picture shot;
    private Picture ship;
    private Line mouse;
    private Rectangle rectangle;

    public Handler() {
        Rectangle rect = new Rectangle(0, 0, 1200, 750);
        rect.setColor(Color.BLACK);
        rect.draw();
        rect.fill();
        ship = new Picture(0, 0, "resources/blica1.png");
        ship.draw();
    }

    @Override
    public void keyPressed(KeyboardEvent event) {
        if (event.getKey() == KeyboardEvent.KEY_SPACE) {
            fireShot();
        }
        if (ship.getY() < 750) {
        if (event.getKey() == KeyboardEvent.KEY_DOWN){
            ship.translate(0, 20);
        }}
        if (ship.getY() > 0){
        if (event.getKey() == KeyboardEvent.KEY_UP){
            ship.translate(0 , -20);
        }
        }
        if (ship.getMaxX() < 1150) {
        if (event.getKey() == KeyboardEvent.KEY_RIGHT){
            ship.translate(20 , 0);
        }}
        if (ship.getX() > 0) {
            if (event.getKey() == KeyboardEvent.KEY_LEFT) {
                ship.translate(-20, 0);
            }
        }
    }
    public void fireShot(){
        shot = new Picture(ship.getMaxX(), ship.getMaxY(), "resources/pewpew.png");
        shot.draw();
        moveShot();
    }
    public void moveShot(){
        shot.translate(20, 0);
        if (shot.getMaxX() > 1150){
            shot.delete();
        }
    }

    @Override
    public void keyReleased(KeyboardEvent event) {
        if (event.getKey() == KeyboardEvent.KEY_SPACE) {
        }
    }
}

