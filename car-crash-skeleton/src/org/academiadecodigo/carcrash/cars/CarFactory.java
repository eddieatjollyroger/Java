package org.academiadecodigo.carcrash.cars;

public class CarFactory {
    private CarFactory carFactory;

    public static Car getNewCar() {
        int randomNumber = (int) (Math.random() * (101));
        if (randomNumber < 50) {

            Roadster roadster = new Roadster("Roadster");
            return roadster;
        }
        else if(randomNumber > 49 && randomNumber < 85) {
            NissanPuke nissan = new NissanPuke("Nissan");
            return nissan;
        }
        else
        {

            Tank tank = new Tank("Tank");
            return tank;
        }
    }
}
