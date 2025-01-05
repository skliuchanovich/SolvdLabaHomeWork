package com.solvd.enums;

public enum GameDifficulty {
    EASY(1, "For beginners"),
    MEDIUM(2, "Intermediate"),
    HARD(3, "Challenging"),
    EXPERT(4, "For pros only");

    private final int level;
    private final String description;


    GameDifficulty(int level, String description) {
        this.level = level;
        this.description = description;
    }


    public boolean isHarderThan(GameDifficulty other) {
        return this.level > other.level;
    }

    @Override
    public String toString() {
        return "GameDifficulty{" +
                "level=" + level +
                ", description='" + description + '\'' +
                '}';
    }
}
