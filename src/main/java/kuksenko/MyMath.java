package kuksenko;

import org.junit.Assert;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.TreeSet;
import java.util.function.*;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by Jeka on 08/08/2015.
 */
public class MyMath {

    Predicate<String> matcher(String str) {
        return str::equalsIgnoreCase;
    }

    public void abc(){
       Comparator<Integer> comparator = Integer::compare;
    }

    public static IntUnaryOperator getFactorialFunc() {
        return x -> {
            if (x == 1) return x;
            else return x * getFactorialFunc().applyAsInt(x - 1);
        };
    }

    public static void printSQRT(double x) {
        System.out.println(Math.sqrt(x));
    }

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(2);
        numbers.add(9);
        numbers.add(2);
        numbers.sort(Integer::compareTo);

        TreeSet<Object> objects = new TreeSet<>();
        numbers.forEach(MyMath::printSQRT);

        Predicate<String> isTrue = "true"::equalsIgnoreCase;

        assertTrue(isTrue.test("TRUE"));
        assertTrue(isTrue.test("true"));
        assertTrue(isTrue.test("TrUe"));
        assertFalse(isTrue.test("bla"));
    }
}
