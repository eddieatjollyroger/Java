package org.academiadecodigo.maindalorians;

import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;

import java.io.*;
import java.util.Arrays;


public class Handler implements KeyboardHandler {
    private FileReader reader;
    private FileWriter writer;
    private BufferedReader bReader;
    private BufferedWriter bWriter;
    private Game game;
    private Rectangle square;
    private Rectangle[] drawing = new Rectangle[20 * 20];
    private boolean[] black = new boolean[20 * 20];

    public Handler(Game game, Rectangle square) {
        this.game = game;
        this.square = square;
        Arrays.fill(black, false);
    }


    @Override
    public void keyPressed(KeyboardEvent event) {
        if (event.getKey() == KeyboardEvent.KEY_SPACE) {
            for (int i = 0; i < drawing.length; i++) {
                if (       drawing[i] != null
                        && drawing[i].getX() == square.getX()
                        && drawing[i].getY() == square.getY()
                        && black[i]) {
                    System.out.println(i + " draw x" + drawing[i].getX() + " square x" + square.getX());
                    drawing[i].delete();
                    black[i] = false;
                    break;
                }
                    if (drawing[i] == null) {
                        drawing[i] = new Rectangle(square.getX(), square.getY(), 10, 10);
                        drawing[i].setColor(Color.BLACK);
                        drawing[i].fill();
                        black[i] = true;
                        break;
                    }
                }

            }
        if (event.getKey() == KeyboardEvent.KEY_ENTER) {
            try {
                reader = new FileReader("boas.txt");
                bReader = new BufferedReader(reader);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
            for (int i = 0; i < drawing.length; i++) {
                String line = "";

                try {
                    line = bReader.readLine();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                if (line == null) {
                    try {
                        bReader.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    break;
                }

                String[] words = line.split(" ");
                drawing[i] = new Rectangle(Integer.getInteger(words[0]), Integer.getInteger(words[1]), 10, 10);
                drawing[i].setColor(Color.BLACK);
                drawing[i].fill();
            }
        }


        if (event.getKey() == KeyboardEvent.KEY_ESC) {
            try {
                writer = new FileWriter("boas.txt");
                bWriter = new BufferedWriter(writer);

            } catch (IOException e) {
                e.printStackTrace();
            }
            for (int i = 0; i < drawing.length; i++) {
                try {
                    if (drawing[i] != null) {
                        String text = "";
                        text = "" + drawing[i].getX() + " " + drawing[i].getY() + " " + black[i]+ "\n";
                        bWriter.write(text);
                    }
                } catch(IOException e){
                    e.printStackTrace();
                }
            }
            try {
                bWriter.flush();
                bWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            for (int i = 0; i < drawing.length; i++) {
                if (drawing[i] != null) {
                    black[i]= false;
                    drawing[i].delete();

                }
            }
        }

        switch (event.getKey()) {
            case KeyboardEvent.KEY_DOWN:
                if (square.getY() < 190) {
                    square.translate(0, 10);
                }
                break;
            case KeyboardEvent.KEY_UP:
                 if (square.getY() > 0) {
                    square.translate(0, -10);
                }
                break;
            case KeyboardEvent.KEY_RIGHT:
                if (square.getX() < 190) {
                    square.translate(10, 0);
                }
                break;
            case KeyboardEvent.KEY_LEFT:
                if (square.getX() > 0) {
                    square.translate(-10, 0);
                }
                break;
        }

    }

    @Override
    public void keyReleased(KeyboardEvent keyboardEvent) {

    }
}
