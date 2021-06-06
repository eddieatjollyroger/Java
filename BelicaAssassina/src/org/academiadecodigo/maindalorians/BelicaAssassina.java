package org.academiadecodigo.maindalorians;

import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Ellipse;
import org.academiadecodigo.simplegraphics.graphics.Line;
import org.academiadecodigo.simplegraphics.keyboard.Keyboard;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEventType;
import org.academiadecodigo.simplegraphics.mouse.Mouse;
import org.academiadecodigo.simplegraphics.mouse.MouseEvent;
import org.academiadecodigo.simplegraphics.mouse.MouseHandler;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class BelicaAssassina {
    private Picture ship;
    private Picture shot;
    private Picture[] shots;
    private static Handler handler;

    public static void main(String[] args) {


        handler = new Handler();

        Keyboard keyboard = new Keyboard(handler);

        KeyboardEvent spacePressed = new KeyboardEvent();

        KeyboardEvent upArrowPress = new KeyboardEvent();

        KeyboardEvent downArrowPress = new KeyboardEvent();

        KeyboardEvent leftArrowPress = new KeyboardEvent();

        KeyboardEvent rightArrowPress = new KeyboardEvent();

        spacePressed.setKey(KeyboardEvent.KEY_SPACE);
        spacePressed.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);


        upArrowPress.setKey(KeyboardEvent.KEY_UP);
        upArrowPress.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);

        downArrowPress.setKey(KeyboardEvent.KEY_DOWN);
        downArrowPress.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);

        leftArrowPress.setKey(KeyboardEvent.KEY_LEFT);
        leftArrowPress.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);

        rightArrowPress.setKey(KeyboardEvent.KEY_RIGHT);
        rightArrowPress.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);

        keyboard.addEventListener(spacePressed);
        keyboard.addEventListener(upArrowPress);
        keyboard.addEventListener(downArrowPress);
        keyboard.addEventListener(leftArrowPress);
        keyboard.addEventListener(rightArrowPress);

        start();
    }

    public static void start() {
        while (!handler.gameOver) {
               for (int i = 0; i < handler.shots.length; i++) {
                   if (handler.shots[i] != null && handler.shots[i].getMaxX() < handler.rect.getWidth()) {
                       handler.moveShot(i);
                   }
               }

            try {
                Thread.sleep(70);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
