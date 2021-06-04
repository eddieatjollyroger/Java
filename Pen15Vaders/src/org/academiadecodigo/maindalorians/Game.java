package org.academiadecodigo.maindalorians;
//import org.academiadecodigo.simplegraphics.*;
import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.graphics.Text;

public class Game {

    public Game(){
        Rectangle rect = new Rectangle(0, 0, 1000, 800);
        rect.draw();
        rect.fill();
    }
public void init(){
    Text text = new Text(500, 200, "Pen15");
    text.draw();
    text.grow(200, 200);
    text.setColor(Color.GREEN);
    Text text2 = new Text(500, 500, "Vaders");
    text2.draw();
    text2.grow(200, 200);
    text2.setColor(Color.CYAN);
}
public void invade(){

}
}
