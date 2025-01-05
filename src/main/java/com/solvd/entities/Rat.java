package com.solvd.entities;

import com.solvd.exceptions.InvalidAgeException;
import com.solvd.exceptions.InvalidColorException;
import com.solvd.exceptions.InvalidLegsAmountException;
import com.solvd.exceptions.InvalidNameException;
import com.solvd.interfaces.IRatBehavior;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public final class Rat extends Animal implements IRatBehavior {
    public final static Logger LOGGER = LogManager.getLogger(Rat.class);
    private boolean isDomesticated;
    private final static int AMOUNT_OF_LEGS = 3;

    private List<String> stolenItems;


    public Rat() {
    }

    public Rat(String animalName, String animalColor, int age, boolean isDomesticated, Diet diet, Health health) throws InvalidNameException, InvalidAgeException, InvalidColorException {
        if (animalColor == "") {
            throw new InvalidColorException("Color cannot be empty");
        }
        if (age <= 0) {
            throw new InvalidAgeException("Age must be greater than 0");
        }
        if (animalName == "") {
            throw new InvalidNameException("Name cannot be empty");
        }
        this.stolenItems = new ArrayList<>();
        this.animalName = animalName;
        this.animalColor = animalColor;
        this.age = age;
        this.isDomesticated = isDomesticated;
        this.diet = diet;
        this.health = health;
    }

    @Override
    public void sayHi() {
        LOGGER.info("Hi, I'm a Rat!");
    }

    public static int getAmountofLegs() {
        try {
            if (AMOUNT_OF_LEGS < 4){
                throw new InvalidLegsAmountException("Rats ALWAYS have 4 legs. Incorrect Amount. Provided amount of Legs by you:" + "" +AMOUNT_OF_LEGS);
            }
        } catch(InvalidLegsAmountException e) {
            LOGGER.info(e.getMessage());
        } return AMOUNT_OF_LEGS;
    }

    public boolean isDomesticated() {
        return isDomesticated;
    }

    public void setDomesticated(boolean domesticated) {
        isDomesticated = domesticated;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Rat rat = (Rat) o;
        return isDomesticated() == rat.isDomesticated();
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), isDomesticated());
    }

    @Override
    public String toString() {
        return "Rat{" +
                "isDomesticated=" + isDomesticated +
                ", stolenItems=" + stolenItems +
                ", animalName='" + animalName + '\'' +
                ", animalColor='" + animalColor + '\'' +
                ", age=" + age +
                ", diet=" + diet +
                ", health=" + health +
                '}';
    }

    @Override
    public void sleep() {
        LOGGER.info("Rat is sleeping!");
    }

    @Override
    public void eat() {
        LOGGER.info("Rat is eating!");
    }

    @Override
    public void play() {
        LOGGER.info("Rat is playing!");
    }

    @Override
    public void tryingToSteal(String food) {
        LOGGER.info("The rat is trying to steal" + "" + food);
    }

    public void stealItem(String item) {
        stolenItems.add(item);
        LOGGER.info("The rat has stolen: " + item);
    }

    public List<String> getStolenItems() {
        return stolenItems;
    }
}

