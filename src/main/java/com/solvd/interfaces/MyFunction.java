package com.solvd.interfaces;

@FunctionalInterface
public interface MyFunction <T,R> {
    R apply(T t);
}
