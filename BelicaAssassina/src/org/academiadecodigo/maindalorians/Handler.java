package org.academiadecodigo.maindalorians;

import org.academiadecodigo.simplegraphics.graphics.Line;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;
import org.academiadecodigo.simplegraphics.pictures.Picture;
import org.academiadecodigo.simplegraphics.mouse.Mouse;
import org.academiadecodigo.simplegraphics.mouse.MouseEvent;
import org.academiadecodigo.simplegraphics.mouse.MouseHandler;

public class Handler implements KeyboardHandler, MouseHandler {
    private Line mijo;
    private Picture picture;
    private Line mouse;

    public Handler(){
        picture = new Picture(-65, -65, "resources/pila.png");
    }
    @Override
    public void keyPressed(KeyboardEvent event){
        if (event.getKey() == KeyboardEvent.KEY_SPACE){
            picture.draw();
        }
    }

    @Override
    public void keyReleased(KeyboardEvent event){
        if (event.getKey() == KeyboardEvent.KEY_SPACE){
            picture.delete();
        }
    }

    @Override
    public void mouseClicked(MouseEvent mouseEvent) {
        mouse = new Line(150, 85, mouseEvent.getX(), mouseEvent.getY());
        mouse.draw();
    }

    @Override
    public void mouseMoved(MouseEvent mouseEvent) {

    }
}
