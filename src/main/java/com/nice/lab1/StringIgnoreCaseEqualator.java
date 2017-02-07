package com.nice.lab1;

/**
 * Created by Evegeny on 07/02/2017.
 */
public class StringIgnoreCaseEqualator implements Equalator<String> {
    @Override
    public boolean equals(String t1, String t2) {
        return t1.equalsIgnoreCase(t2);
    }
}
