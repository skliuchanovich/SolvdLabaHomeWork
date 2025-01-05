package com.solvd.entities;

import com.solvd.exceptions.InvalidAmountException;
import com.solvd.interfaces.IAnimalBehavior;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.LinkedList;
import java.util.Objects;
import java.util.Queue;

public abstract class Animal implements IAnimalBehavior {
    public final static Logger LOGGER = LogManager.getLogger(Animal.class);
    private static int animalsCreated;
    protected String animalName;
    protected String animalColor;
    protected int age;
    protected Diet diet;
    protected Health health;

    private Queue<String> events;

    static {
        animalsCreated = 0;
        LOGGER.info("Static block of class Animal loaded.");
    }

    public Animal() {
        animalsCreated++;
    }

    public Animal(String animalName, String animalColor, int age, Diet diet, Health health) {
        this.animalName = animalName;
        this.animalColor = animalColor;
        this.age = age;
        this.diet = diet;
        this.health = health;
        this.events = new LinkedList<>();
        animalsCreated++;
    }

    public static int getAnimalsCreated() {
        try {
            if (animalsCreated <= 0) {
                throw new InvalidAmountException("No animals created yet or amount of created animals cannot be less than 0");
            }
        } catch (InvalidAmountException e) {
            LOGGER.error(e.getMessage());
        }
        return animalsCreated;
    }

    public abstract void sayHi();

    public final void showAnimalAge() {
        LOGGER.info("My age is:" + " " + age);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return age == animal.age && animalName.equals(animal.animalName) && animalColor.equals(animal.animalColor) && diet.equals(animal.diet) && health.equals(animal.health);
    }

    @Override
    public int hashCode() {
        return Objects.hash(animalName, animalColor, age, diet, health);
    }

    public int getAge() {
        return age;
    }

    public void addEvent(String event) {
        events.add(event);
    }

    public String getNextEvent() {
        return events.poll();
    }

    public Queue<String> getEvents() {
        return events;
    }

    public String getAnimalName() {
        return animalName;
    }

    public String getAnimalColor() {
        return animalColor;
    }

    public Diet getDiet() {
        return diet;
    }

    public Health getHealth() {
        return health;
    }

    @Override
    public String toString() {
        return "Animal{" + "animalName='" + animalName + '\'' + ", animalColor='" + animalColor + '\'' + ", age=" + age + ", diet=" + diet + ", health=" + health + ", events=" + events + '}';
    }
}
