package org.academiadecodigo.carcrash.cars;

import org.academiadecodigo.carcrash.field.Position;

abstract public class Car {

    protected String name;
    /** The position of the car on the grid */
    private Position pos;
    private boolean crashed = false;
    private int goingUp;
    private String direction;
    private int counter = 0;
    public abstract void summonMissile();

    public Car() {
        this.pos = new Position();
        this.goingUp = 0;
        this.direction = direction;
    }

    public void setDirection(String direction){
        this.direction = direction;
    }

    public String getDirection() {
        return direction;
    }

    public String getName() {
        return name;
    }

    public int getGoingUp() {
        return goingUp;
    }

    public void setGoingUp(int goingUp) {
        this.goingUp = goingUp;
    }

    public Position getPos() {
        return pos;
    }

    public boolean isCrashed() {
        return crashed;
    }

    public void setCrashed(boolean crashed) {
        this.crashed = crashed;
    }

    public void moveCars(int speed) {
        if (this.getPos().getCol() > (99 - speed)) {
            this.getPos().setCol(this.getPos().getCol() - speed);
            counter = 4;
        } else if (this.getPos().getCol() < speed) {
            this.getPos().setCol(this.getPos().getCol() + speed);
            counter = 4;
        } else if (this.getPos().getRow() < speed) {
            this.getPos().setRow(this.getPos().getRow() + speed);
            counter = 4;
        } else if (this.getPos().getRow() > (24 - speed)) {
            this.getPos().setRow(this.getPos().getRow() - speed);
            counter = 4;
        }
        if (counter < 4) {
            if (this.getDirection() == "up") {
                this.getPos().setRow(this.getPos().getRow() - speed);
                counter++;
            } else if (this.getDirection() == "down") {
                this.getPos().setRow(this.getPos().getRow() + speed);
                counter++;
            } else if (this.getDirection() == "left") {
                this.getPos().setCol(this.getPos().getCol() - speed);
                counter++;
            } else {
                this.getPos().setCol(this.getPos().getCol() + speed);
                counter++;
            }
        }
        if (counter == 4) {
            switch ((int) (Math.random() * (4))) {

                case 0: {                                               //  is up
                    this.getPos().setRow(this.getPos().getRow() - speed);
                    setDirection("up");
                    counter = 0;
                    break;
                }
                case 1: {
                    this.getPos().setRow(this.getPos().getRow() + speed);
                    setDirection("down");
                    counter = 0;
                    break;                                              // is down
                }
                case 2: {                                               // is left
                    this.getPos().setCol(this.getPos().getCol() - speed);
                    setDirection("left");
                    counter = 0;
                    break;
                }
                case 3: {                                               // is right
                    this.getPos().setCol(this.getPos().getCol() + speed);
                    setDirection("right");
                    counter = 0;
                    break;
                }
            }
        }
    }
    public void compareCars(Car[] cars){
            for (int j = 0; j < cars.length; j++) {
                for (int i = 0; i < cars.length; i++) {
                    if ((cars[i].getPos().getRow() == cars[j].getPos().getRow()) &&
                            (cars[i].getPos().getCol() == cars[j].getPos().getCol()) &&
                            (j != i) &&
                            cars[i].getName() != "Tank" &&
                            cars[j].getName() != "Tank") {
                        cars[i].setCrashed(true);
                        cars[j].setCrashed(true);
                    }
                }
            }
        }
    }

