package comm.netcracker.homework2.ch2;

public class Car {
    private final double fuelConsumption;
    private double distance;
    private double fuelLevel;

    public Car(int fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
        distance = 0;
        fuelLevel = 0;
    }

    public void addFuel(double fuel) {
        fuelLevel += fuel;
    }
    public double getDistance () {
        return distance;
    }
    public double getFuelLevel () {
        return fuelLevel;
    }

    public void move(double distance) {
        double curConsumption = distance * fuelConsumption;
        if (fuelLevel >= curConsumption) {
            this.distance += distance;
            fuelLevel -= curConsumption;
            System.out.println("Машина добралась до указанной точки. Текущий запас топлива: " + fuelLevel);
        }
        else {
            this.distance += fuelLevel / curConsumption;
            System.out.println("Машина не добралась до указанной точки. Чтобы доехать до нужной точки необходимо долить: ".concat(Double.toString(curConsumption - fuelLevel)));
            fuelLevel = 0;
        }
    }
}