package org.academiadecodigo.carcrash.cars;

public class Tank extends Car {
    private int counter = 0;
    private Missile missil;
    public Tank(String name) {
        this.name = name;
    }

    @Override
    public void summonMissile() {
        missil = new Missile();
    }

    @Override
    public void moveCars(int speed) {
        super.moveCars(speed);
    }

    @Override
    public void compareCars(Car[] cars) {

        for (int j = 0; j < cars.length; j++) {
            for (int i = 0; i < cars.length; i++) {
                if ((cars[i].getPos().getRow() == cars[j].getPos().getRow()) &&
                        (cars[i].getPos().getCol() == cars[j].getPos().getCol()) &&
                        (j != i) &&
                        cars[i].getName() == "Tank" &&
                        cars[j].getName() == "Tank") {
                    cars[i].setCrashed(true);
                    cars[j].setCrashed(true);
                } else if ((cars[i].getPos().getRow() == cars[j].getPos().getRow()) &&
                        (cars[i].getPos().getCol() == cars[j].getPos().getCol()) &&
                        (j != i) &&
                        cars[i].getName() != "Tank" &&
                        cars[j].getName() == "Tank") {
                    cars[i].setCrashed(true);
                } else if ((cars[i].getPos().getRow() == cars[j].getPos().getRow()) &&
                        (cars[i].getPos().getCol() == cars[j].getPos().getCol()) &&
                        (j != i) &&
                        cars[i].getName() == "Tank" &&
                        cars[j].getName() != "Tank") {
                    cars[j].setCrashed(true);
                }
            }
        }
    }
        // @Override
        // public void setCrashed(boolean crashed) {
        //}

        @Override
        public String toString () {
            return "T";
        }
    }

