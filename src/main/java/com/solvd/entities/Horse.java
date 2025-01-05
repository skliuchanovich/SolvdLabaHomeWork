package com.solvd.entities;

import com.solvd.exceptions.InvalidAgeException;
import com.solvd.exceptions.InvalidColorException;
import com.solvd.exceptions.InvalidNameException;
import com.solvd.interfaces.IHorseBehavior;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Horse extends Animal implements IHorseBehavior {
    public final static Logger LOGGER = LogManager.getLogger(Horse.class);
    private double speed;
    private Map<String, Double> routes;

    public Horse() {
    }


    public Horse(String animalName, String animalColor, int age, double speed, Diet diet, Health health) throws InvalidNameException, InvalidAgeException, InvalidColorException {
        if (animalColor == "") {
            throw new InvalidColorException("Color cannot be empty");
        }

        if (age <= 0) {
            throw new InvalidAgeException("Age must be greater than 0");
        }
        if (animalName == "") {
            throw new InvalidNameException("Name cannot be empty");
        }
        this.routes = new HashMap<>();
        this.animalName = animalName;
        this.animalColor = animalColor;
        this.age = age;
        this.speed = speed;
        this.diet = diet;
        this.health = health;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    @Override
    public void sayHi() {
        LOGGER.info("Hi, I'm a Horse!");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Horse horse = (Horse) o;
        return Double.compare(horse.getSpeed(), getSpeed()) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getSpeed());
    }

    @Override
    public String toString() {
        return "Horse{" + "speed=" + speed + ", routes=" + routes + ", animalName='" + animalName + '\'' + ", animalColor='" + animalColor + '\'' + ", age=" + age + ", diet=" + diet + ", health=" + health + '}';
    }

    @Override
    public void sleep() {
        LOGGER.info("Horse is sleeping!");
    }

    @Override
    public void eat() {
        LOGGER.info("Horse is eating!");
    }

    @Override
    public void play() {
        LOGGER.info("Horse is playing!");
    }

    @Override
    public void gallop() {
        LOGGER.info("The racehorse is galloping fast!");
    }

    public void addRoute(String routeName, double distance) {
        routes.put(routeName, distance);

    }

    public Map<String, Double> getRoutes() {
        return routes;
    }
}
