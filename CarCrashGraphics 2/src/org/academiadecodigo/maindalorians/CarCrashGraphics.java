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

import java.awt.*;

public class CarCrashGraphics {
    public static void main(String[] args) {


        Rectangle rect = new Rectangle(0, 0, 1200, 200);
        rect.setColor(Color.BLACK);
        rect.draw();
        rect.fill();

        Ellipse esquerdo = new Ellipse(30, 30, 50, 50);
        esquerdo.draw();
        esquerdo.setColor(Color.PINK);
        esquerdo.fill();
        Ellipse direito = new Ellipse(30, 90, 50, 50);
        direito.draw();
        direito.setColor(Color.PINK);
        direito.fill();
        Ellipse badalao = new Ellipse(60, 60, 100, 50);
        badalao.draw();
        badalao.setColor(Color.PINK);
        badalao.fill();
        Ellipse cabeca = new Ellipse(130, 72, 30, 25);
        cabeca.draw();
        cabeca.setColor(Color.MAGENTA);
        cabeca.fill();
        Line uretra = new Line(150, 85, 152, 85);
        uretra.setColor(Color.YELLOW);
        uretra.draw();
        Line cabelo = new Line (50, 50, 60, 20);
        cabelo.setColor(Color.GRAY);
        cabelo.draw();
        Line cabelo1 = new Line (50, 55, 60, 30);
        cabelo1.setColor(Color.GRAY);
        cabelo1.draw();
       // Line mijo = new Line(150, 85, 800, 85);


        Handler handler = new Handler();
        Mouse mouse = new Mouse(handler);

        MouseEvent click = new MouseEvent(50, 50);
        double x = click.getX();
        double y = click.getY();

        Keyboard keyboard = new Keyboard(handler);

       KeyboardEvent spacePressed = new KeyboardEvent();
        KeyboardEvent spaceDepressed = new KeyboardEvent();

        spacePressed.setKey(KeyboardEvent.KEY_SPACE);
        spacePressed.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);

        spaceDepressed.setKey(KeyboardEvent.KEY_SPACE);
        spaceDepressed.setKeyboardEventType(KeyboardEventType.KEY_RELEASED);

        keyboard.addEventListener(spacePressed);
        keyboard.addEventListener(spaceDepressed);

    }
}
