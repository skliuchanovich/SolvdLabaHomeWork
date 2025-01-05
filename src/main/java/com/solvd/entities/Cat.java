package com.solvd.entities;

import com.solvd.exceptions.InvalidAgeException;
import com.solvd.exceptions.InvalidColorException;
import com.solvd.exceptions.InvalidNameException;
import com.solvd.interfaces.ICatBehavior;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Cat extends Animal implements ICatBehavior {
    public final static Logger LOGGER = LogManager.getLogger(Cat.class);
    private boolean isIndoor;
    private Set<String> visitedPlaces;

    public Cat() {
    }

    public Cat(String animalName, String animalColor, int age, boolean isIndoor, Diet diet, Health health) throws InvalidNameException,InvalidAgeException, InvalidColorException {
        if (this.animalColor == ""){
            throw new InvalidColorException("Color cannot be empty");
        }
        if (age <= 0) {
            throw new InvalidAgeException("Age must be greater than 0");
        }
        if (animalName == ""){
            throw new InvalidNameException("Name cannot be empty");
        }
        this.visitedPlaces = new HashSet<>();
        this.animalName = animalName;
        this.animalColor = animalColor;
        this.age = age;
        this.isIndoor = isIndoor;
        this.diet = diet;
        this.health = health;


    }

    @Override
    public void sayHi() {
        LOGGER.info("Hi, I'm a Cat!");
    }

    public boolean isIndoor() {
        return isIndoor;
    }

    public void setIndoor(boolean indoor) {
        isIndoor = indoor;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "isIndoor=" + isIndoor +
                ", visitedPlaces=" + visitedPlaces +
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
        Cat cat = (Cat) o;
        return isIndoor() == cat.isIndoor();
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), isIndoor());
    }

    @Override
    public void sleep() {
        LOGGER.info("Cat is sleeping!");
    }

    @Override
    public void eat() {
        LOGGER.info("Cat is eating!");
    }

    @Override
    public void play() {
        LOGGER.info("Cat is playing!");
    }

    @Override
    public String playingWithToy(String toy) {
        return  "Cat playing with: " + " " + toy;
    }

    public void visitPlace(String place) {
        visitedPlaces.add(place);
    }

    public Set<String> getVisitedPlaces() {
        return visitedPlaces;
    }

}
