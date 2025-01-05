package com.solvd.enums;

public enum TransportType {
    CAR("Car", 120),
    TRUCK("Truck", 80),
    BICYCLE("Bicycle", 25),
    MOTORCYCLE("Motorcycle", 150),
    AIRPLANE("Airplane", 900);

    private final String name;
    private final int averageSpeed;


    TransportType(String name, int averageSpeed) {
        this.name = name;
        this.averageSpeed = averageSpeed;
    }


    public int getAverageSpeed() {
        return averageSpeed;
    }


    public boolean isFast() {
        return averageSpeed > 100;
    }

    @Override
    public String toString() {
        return "TransportType{" +
                "name='" + name + '\'' +
                ", averageSpeed=" + averageSpeed +
                '}';
    }
}
