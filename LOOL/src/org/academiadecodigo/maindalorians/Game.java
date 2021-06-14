package org.academiadecodigo.maindalorians;

import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Line;
import org.academiadecodigo.simplegraphics.graphics.Text;
import org.academiadecodigo.simplegraphics.keyboard.Keyboard;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEventType;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;
import org.academiadecodigo.simplegraphics.pictures.Picture;
import java.awt.*;
import java.util.Arrays;

public class Game {
    private static Handler handler;
    private Rectangle square;
    private Line[] rowsY = new Line[20];
    private Line[] columnsX = new Line[20];
    private static final int GRID = 10;

    public void init(){
        square = new Rectangle(0,0, GRID, GRID);
        square.setColor(Color.GREEN);
        square.fill();
        handler = new Handler(this, square);
        Keyboard keyboard = new Keyboard(handler);

        KeyboardEvent spacePressed = new KeyboardEvent();
        KeyboardEvent upArrowPress = new KeyboardEvent();
        KeyboardEvent downArrowPress = new KeyboardEvent();
        KeyboardEvent leftArrowPress = new KeyboardEvent();
        KeyboardEvent rightArrowPress = new KeyboardEvent();
        KeyboardEvent enterPress = new KeyboardEvent();
        KeyboardEvent escPress = new KeyboardEvent();

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
        enterPress.setKey(KeyboardEvent.KEY_ENTER);
        enterPress.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        escPress.setKey(KeyboardEvent.KEY_ESC);
        escPress.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);

        keyboard.addEventListener(spacePressed);
        keyboard.addEventListener(upArrowPress);
        keyboard.addEventListener(downArrowPress);
        keyboard.addEventListener(leftArrowPress);
        keyboard.addEventListener(rightArrowPress);
        keyboard.addEventListener(enterPress);
        keyboard.addEventListener(escPress);

        drawLines();
    }

    public void drawLines(){
        int rowY = -GRID;
       for (int i = 0; i < rowsY.length; i++) {

            rowY += GRID;
           rowsY[i] = new Line( 0, rowY, 20 * 10, rowY);
           rowsY[i].draw();
           columnsX[i] = new Line(rowY, 0, rowY, 20 * 10);
           System.out.println(rowY);
           columnsX[i].draw();
       }
    }
}
