package com.nice.lab1;


import java.util.List;

/**
 * Created by Evegeny on 07/02/2017.
 */
public class DuplicateCalcService {
    public <T> int calcDuplicates(T t, List<T> list) {
        int counter = 0;
        for (T t1 : list) {
            if (t1.equals(t)) {
                counter++;
            }
        }
        return counter;
    }

    public <T> int calcDuplicates(T t, List<T> list, Equalator<T> equalator) {
        int counter = 0;
        for (T t1 : list) {
            if (equalator.equals(t,t1)) {
                counter++;
            }
        }
        return counter;
    }

}
