package org.academiadecodigo.carcrash.cars;

public class NissanPuke extends Car {
    public NissanPuke(String name){
this.name = name;
    }

    @Override
    public void moveCars(int speed) {
        if (super.getPos().getRow() == 0 &&
                super.getPos().getCol() == 99 ||
                super.getPos().getCol() == 99 &&
                        super.getPos().getRow() == 24) {

            super.getPos().setCol(0);

        }
        if (super.getPos().getRow() == 0) {
            super.getPos().setCol(super.getPos().getCol() + speed);
            super.setGoingUp(0);
        } else if (super.getPos().getRow() >= 24) {
            super.getPos().setCol(super.getPos().getCol() + speed);
            super.setGoingUp(1);
        }
        if (super.getGoingUp() == 0) {
            int numberRow = super.getPos().getRow() + speed;
            super.getPos().setRow(numberRow);
        } else if (super.getGoingUp() == 1) {
            int numberRow = super.getPos().getRow() - speed;
            super.getPos().setRow(numberRow);
        }
    }

    @Override
    public String toString() {
        return "N";
    }
}
