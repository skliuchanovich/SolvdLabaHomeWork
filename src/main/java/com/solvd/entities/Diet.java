package com.solvd.entities;

import java.util.Objects;

public class Diet {
    private String dietType;

    public Diet() {
    }

    public Diet(String dietType) {
        this.dietType = dietType;
    }

    public String getDietType() {
        return dietType;
    }

    public void setDietType(String dietType) {
        this.dietType = dietType;
    }

    @Override
    public String toString() {
        return "Diet{" +
                "dietType='" + dietType + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Diet diet = (Diet) o;
        return getDietType().equals(diet.getDietType());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getDietType());
    }
}
