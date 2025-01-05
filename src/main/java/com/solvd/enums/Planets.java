package com.solvd.enums;

public enum Planets {
    MERCURY(3.3e23, 2.4e6),
    VENUS(4.9e24, 6.1e6),
    EARTH(6.0e24, 6.4e6),
    MARS(6.4e23, 3.4e6);

    private final double mass;
    private final double radius;


    Planets(double mass, double radius) {
        this.mass = mass;
        this.radius = radius;
    }


    public double surfaceGravity() {
        double G = 6.67430e-11;
        return G * mass / (radius * radius);
    }

    @Override
    public String toString() {
        return "Planets{" +
                "mass=" + mass +
                ", radius=" + radius +
                '}';
    }
}

