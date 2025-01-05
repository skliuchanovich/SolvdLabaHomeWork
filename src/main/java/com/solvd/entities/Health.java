package com.solvd.entities;

import java.util.Objects;

public class Health {
    private boolean isHealthy;

    public Health() {
    }

    public Health(boolean isHealthy) {
        this.isHealthy = isHealthy;
    }

    public boolean IsHealthy() {
        return isHealthy;
    }

    public void setIsHealthy(boolean healthy) {
        isHealthy = healthy;
    }

    @Override
    public String toString() {
        return "Health{" +
                "isHealthy=" + isHealthy +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Health health = (Health) o;
        return isHealthy == health.isHealthy;
    }

    @Override
    public int hashCode() {
        return Objects.hash(isHealthy);
    }
}
