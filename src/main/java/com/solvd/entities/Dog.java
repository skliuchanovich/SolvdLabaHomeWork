package com.solvd.entities;

import com.solvd.exceptions.InvalidAgeException;
import com.solvd.exceptions.InvalidColorException;
import com.solvd.exceptions.InvalidNameException;
import com.solvd.interfaces.IDogBehavior;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Dog extends Animal implements IDogBehavior {
    public final static Logger LOGGER = LogManager.getLogger(Dog.class);

    private String breed;
    private List<String> favoriteToys;

    public Dog() {
    }

    public Dog(String animalName, String animalColor, int age, String breed, Diet diet, Health health) throws InvalidAgeException, InvalidNameException, InvalidColorException {
        if (animalColor == "") {
            throw new InvalidColorException("Color cannot be empty");
        }

        if (age <= 0) {
            throw new InvalidAgeException("Age must be greater than 0");
        }
        if (animalName == "") {
            throw new InvalidNameException("Name cannot be empty");
        }
        this.favoriteToys = new ArrayList<>();
        this.animalName = animalName;
        this.animalColor = animalColor;
        this.age = age;
        this.breed = breed;
        this.diet = diet;
        this.health = health;

    }

    @Override
    public void sayHi() {
        LOGGER.info("Hi, I'm a Dog!");
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }


    @Override
    public String toString() {
        return "Dog{" +
                "breed='" + breed + '\'' +
                ", favoriteToys=" + favoriteToys +
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
        Dog dog = (Dog) o;
        return getBreed().equals(dog.getBreed());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getBreed());
    }

    @Override
    public void sleep() {
        LOGGER.info("Dog is sleeping!");
    }

    @Override
    public void eat() {
        LOGGER.info("Dog is eating!");
    }

    @Override
    public void play() {
        LOGGER.info("Dog is playing!");
    }


    @Override
    public boolean isReadyToPlay(boolean readyOrNot) {
        return readyOrNot;
    }

    public void addFavoriteToy(String toy) {
        favoriteToys.add(toy);
    }

    public List<String> getFavoriteToys() {
        return favoriteToys;
    }
}
