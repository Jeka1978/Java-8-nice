package com.nice.lab1;

/**
 * Created by Evegeny on 07/02/2017.
 */
@FunctionalInterface
public interface Equalator<T> {
    boolean equals(T t1, T t2) throws IllegalStateException;
}
