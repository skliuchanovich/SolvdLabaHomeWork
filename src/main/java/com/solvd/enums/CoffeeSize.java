package com.solvd.enums;

public enum CoffeeSize {
    SMALL(200, "Small cup"),
    MEDIUM(300, "Medium cup"),
    LARGE(400, "Large cup");

    private final int volume;
    private final String description;


    CoffeeSize(int volume, String description) {
        this.volume = volume;
        this.description = description;
    }


    public int getVolume() {
        return volume;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "CoffeeSize{" +
                "volume=" + volume +
                ", description='" + description + '\'' +
                '}';
    }
}
