package org.academiadecodigo.maindalorians;

import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Line;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEventType;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;
import org.academiadecodigo.simplegraphics.pictures.Picture;
import org.academiadecodigo.simplegraphics.mouse.Mouse;
import org.academiadecodigo.simplegraphics.mouse.MouseEvent;
import org.academiadecodigo.simplegraphics.mouse.MouseHandler;

public class Handler implements KeyboardHandler {

    private Picture shot;
    private Picture ship;
    private Line mouse;

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
        switch (event.getKey()) {
            case KeyboardEvent.KEY_DOWN:
                if (ship.getMaxY() < 730) {
                    ship.translate(0, 20);
                }
                break;
            case KeyboardEvent.KEY_UP:
                if (ship.getY() > 0) {
                    ship.translate(0, -20);
                }
                break;
            case KeyboardEvent.KEY_RIGHT:
                if (ship.getMaxX() < 1175) {
                    ship.translate(20, 0);
                }
                break;
            case KeyboardEvent.KEY_LEFT:
                if (ship.getX() > 0) {
                    ship.translate(-20, 0);
                }
                break;
        }

    }

    public void fireShot() {
        shot = new Picture(ship.getMaxX(), (ship.getY()+(int)((ship.getMaxY()-ship.getY())/2))-2, "resources/fireshot.png");
        shot.draw();
//        System.out.println("x:" + ship.getX());
//        System.out.println("y:" + ship.getY());
//        System.out.println("maxx:" + ship.getMaxX());
//        System.out.println("maxy:" + ship.getMaxY());
//        System.out.println("espermx:" + shot.getX());
//        System.out.println("spermy:" + shot.getY());
//        System.out.println("spermmaxx:" + shot.getMaxX());
//        System.out.println("spermmaxy:" + shot.getMaxY());

        //moveShot();
    }

    public void moveShot() {
        shot.translate(0, 0);
        if (shot.getMaxX() > 1150) {
            shot.delete();

        }

    }

    @Override
    public void keyReleased(KeyboardEvent event) {
        if (event.getKey() == KeyboardEvent.KEY_SPACE) {
        }
    }
}

