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

public class BelicaAssassina {
    public static void main(String[] args) {



//        Ellipse esquerdo = new Ellipse(30, 30, 50, 50);
//        esquerdo.draw();
//        Ellipse direito = new Ellipse(30, 90, 50, 50);
//        direito.draw();
//        Ellipse badalao = new Ellipse(60, 60, 100, 50);
//        badalao.draw();
//        Ellipse cabeca = new Ellipse(130, 72, 30, 25);
//        cabeca.draw();
//        Line uretra = new Line(150, 85, 152, 85);
//        uretra.draw();
       // Line mijo = new Line(150, 85, 800, 85);


        Handler handler = new Handler();

        Keyboard keyboard = new Keyboard(handler);

       KeyboardEvent spacePressed = new KeyboardEvent();
        KeyboardEvent spaceDepressed = new KeyboardEvent();

        KeyboardEvent upArrowPress = new KeyboardEvent();
        KeyboardEvent upArrowDepress = new KeyboardEvent();

        KeyboardEvent downArrowPress = new KeyboardEvent();
        KeyboardEvent downArrowDepress = new KeyboardEvent();

        KeyboardEvent leftArrowPress = new KeyboardEvent();
        KeyboardEvent leftArrowDepress = new KeyboardEvent();

        KeyboardEvent rightArrowPress = new KeyboardEvent();
        KeyboardEvent rightArrowDepress = new KeyboardEvent();

        spacePressed.setKey(KeyboardEvent.KEY_SPACE);
        spacePressed.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        spaceDepressed.setKey(KeyboardEvent.KEY_SPACE);
        spaceDepressed.setKeyboardEventType(KeyboardEventType.KEY_RELEASED);

        upArrowPress.setKey(KeyboardEvent.KEY_UP);
        upArrowPress.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        upArrowDepress.setKey(KeyboardEvent.KEY_UP);
        upArrowDepress.setKeyboardEventType(KeyboardEventType.KEY_RELEASED);

        downArrowPress.setKey(KeyboardEvent.KEY_DOWN);
        downArrowPress.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        downArrowDepress.setKey(KeyboardEvent.KEY_DOWN);
        downArrowDepress.setKeyboardEventType(KeyboardEventType.KEY_RELEASED);

        leftArrowPress.setKey(KeyboardEvent.KEY_LEFT);
        leftArrowPress.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        leftArrowDepress.setKey(KeyboardEvent.KEY_LEFT);
        leftArrowDepress.setKeyboardEventType(KeyboardEventType.KEY_RELEASED);

        rightArrowPress.setKey(KeyboardEvent.KEY_RIGHT);
        rightArrowPress.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        rightArrowDepress.setKey(KeyboardEvent.KEY_RIGHT);
        rightArrowDepress.setKeyboardEventType(KeyboardEventType.KEY_RELEASED);

        keyboard.addEventListener(spacePressed);
        keyboard.addEventListener(spaceDepressed);

        keyboard.addEventListener(upArrowPress);
        keyboard.addEventListener(upArrowDepress);

        keyboard.addEventListener(downArrowPress);
        keyboard.addEventListener(downArrowDepress);

        keyboard.addEventListener(leftArrowPress);
        keyboard.addEventListener(leftArrowDepress);

        keyboard.addEventListener(rightArrowPress);
        keyboard.addEventListener(rightArrowDepress);
    }
}
