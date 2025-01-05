package com.solvd.entities;

import com.solvd.exceptions.InvalidAgeException;
import com.solvd.exceptions.InvalidColorException;
import com.solvd.exceptions.InvalidNameException;
import com.solvd.interfaces.IRabbitBehavior;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Objects;

public class Rabbit extends Animal implements IRabbitBehavior {
    public final static Logger LOGGER = LogManager.getLogger(Rabbit.class);
    private double earLength;

    public Rabbit() {
    }

    public Rabbit(String animalName, String animalColor, int age, double earLength, Diet diet, Health health) throws InvalidNameException, InvalidAgeException, InvalidColorException {
        if (animalColor == ""){
            throw new InvalidColorException("Color cannot be empty");
        }

        if (age <= 0) {
            throw new InvalidAgeException("Age must be greater than 0");
        }
        if (animalName == ""){
            throw new InvalidNameException("Name cannot be empty");
        }
        this.animalName = animalName;
        this.animalColor = animalColor;
        this.age = age;
        this.earLength = earLength;
        this.diet = diet;
        this.health = health;
    }


    @Override
    public void sayHi() {
        LOGGER.info("Hi, I'm a Rabbit!");
    }

    public double getEarLength() {
        return earLength;
    }

    public void setEarLength(double earLength) {
        this.earLength = earLength;
    }

    @Override
    public String toString() {
        return "Rabbit{" +
                "earLength=" + earLength +
                ", animalName='" + animalName + '\'' +
                ", animalColor='" + animalColor + '\'' +
                ", age=" + age +
                ", diet=" + diet +
                ", health=" + health +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Rabbit rabbit = (Rabbit) o;
        return Double.compare(rabbit.getEarLength(), getEarLength()) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getEarLength());
    }

    @Override
    public void sleep() {
        LOGGER.info("Rabbit is sleeping!");
    }

    @Override
    public void eat() {
        LOGGER.info("Rabbit is eating!");
    }

    @Override
    public void play() {
        LOGGER.info("Rabbit is playing!");
    }

    @Override
    public void eating(String food) {
        LOGGER.info("The rabbit is eating: " + food);
    }
}
