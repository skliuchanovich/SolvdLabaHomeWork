package com.solvd;

import com.solvd.entities.*;
import com.solvd.exceptions.InvalidAgeException;
import com.solvd.exceptions.InvalidColorException;
import com.solvd.exceptions.InvalidNameException;
import com.solvd.threads.MyRunnable;
import com.solvd.threads.MyThread;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.lang.reflect.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;


public class Main {
    public static final Logger LOGGER = LogManager.getLogger(Main.class);


    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {

       /* List<Animal> animals = new ArrayList<>();
        Animal dog = null;
        Animal cat = null;
        Animal horse = null;
        Animal rat = null;
        try {
            dog = new Dog("Sharik", "Black", 5, "Beagle", new Diet("Meat"), new Health(true));
            cat = new Cat("Barsik", "Orange", 5, true, new Diet("Mouse"), new Health(true));
            horse = new Horse("Dobrynia", "White", 12, 12.5, new Diet("Grass"), new Health(false));
            rat = new Rat("Krysa", "Black", 7, false, new Diet("Cheese"), new Health(false));

        } catch (InvalidAgeException | InvalidColorException | InvalidNameException e) {
            LOGGER.info(e.getMessage());
        }
        if (dog != null && cat != null && horse != null && rat != null) {
            animals.add(dog);
            animals.add(cat);
            animals.add(horse);
            animals.add(rat);
        }
        animals.stream().filter(animal -> animal.getAge() > 1).forEach(animal -> LOGGER.info(animal));
        animals.stream().map(animal -> animal.getAnimalName().length()).forEach(animal -> LOGGER.info(animal));
        animals.stream().filter(animal -> animal.getAnimalName().startsWith("B")).forEach(animal -> LOGGER.info(animal));
        animals.stream().filter(animal -> animal.getAnimalColor().startsWith("W")).forEach(animal -> LOGGER.info(animal));
        animals.stream().sorted(Comparator.comparingInt(animal -> animal.getAge())).map(animal -> animal.getAnimalName()).forEach(animal -> LOGGER.info(animal));
        animals.stream().sorted(Comparator.comparing(animal -> animal.getAnimalName())).map(animal -> animal.getAnimalName()).forEach(animal -> LOGGER.info(animal));
        long healthyAnimalsCount = animals.stream().filter(animal -> animal.getHealth().IsHealthy()).count();
        LOGGER.info("Number of healthy animals:" + " " + healthyAnimalsCount);

        Class dogClass = Class.forName("com.solvd.entities.Dog");
        Constructor<Dog> dogClassConstructor = dogClass.getDeclaredConstructor(String.class, String.class, int.class, String.class, Diet.class, Health.class);
        Animal dog2 = dogClassConstructor.newInstance("animal", "white", 3, "ovcharka", new Diet("Vegetables"), new Health(true));
        Method methodOfClassDog = dogClass.getMethod("sayHi");
        methodOfClassDog.invoke(dog2);
        Field[] fieldsOfClassDog = dogClass.getDeclaredFields();
        Arrays.stream(fieldsOfClassDog).forEach(field -> {
            String modifiersOfDogClassAsString = Modifier.toString(field.getModifiers());
            LOGGER.info("Field: " + field.getName() + " " + "Type: " + " " + field.getType().getSimpleName() + "" + "Modifiers: " + " " + modifiersOfDogClassAsString);
        });
        Constructor[] dogClassConstructors = dogClass.getDeclaredConstructors();
        Arrays.stream(dogClassConstructors).forEach(constructor -> {
            String modifiersOfDogClassAsString = Modifier.toString(constructor.getModifiers());
            String params = Arrays.toString(constructor.getParameterTypes());
            LOGGER.info("Constructor: " + constructor.getName() + ", Modifiers: " + modifiersOfDogClassAsString + ", Parameters: " + params);
        });
        Method[] methodsOfClassDog = dogClass.getDeclaredMethods();
        Arrays.stream(methodsOfClassDog).forEach(method -> {
            String modifiersOfDogClassAsString = Modifier.toString(method.getModifiers());
            String returnType = method.getReturnType().getSimpleName();
            String methodName = method.getName();
            String params = Arrays.toString(method.getParameterTypes());
            LOGGER.info("Method: " + methodName + ", Return Type: " + returnType + ", Modifiers: " + modifiersOfDogClassAsString + ", Parameters: " + params);
        });*/

        for (int i=0; i<10; i++){
            new Thread(new MyRunnable()).start();
            new MyThread().start();
        }
    }
}

