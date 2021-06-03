package org.academiadecodigo.carcrash.cars;


public class Roadster extends Car {
    private int counter = 0;

    public Roadster(String name){
    this.name = name;
    }


    @Override
    public void moveCars(int speed) {
        super.moveCars(speed);
    }

    // @Override
   // public void setCrashed(boolean crashed) {
   // }

    @Override
    public String toString() {
        return "R";
    }
}


