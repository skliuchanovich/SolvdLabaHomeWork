package com.solvd.interfaces;

@FunctionalInterface
public interface EvenChecker<T> {
    boolean check(T t);

}
