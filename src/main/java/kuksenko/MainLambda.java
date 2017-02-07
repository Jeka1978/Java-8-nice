package kuksenko;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * Created by Jeka on 08/08/2015.
 */
public class MainLambda {
    public static void main(String[] args) {
//        new MainLambda().x();


        Comparator<Integer> comparator = (a, b) -> {
            if (a == b) {
                return 0;
            }
            if (a > b) {
                return 1;
            }
            return -1;
        };

        List<Integer> nums = new ArrayList<>();
        nums.add(new Integer(2));
        nums.add(new Integer(1));
        nums.add(1);
        nums.add(1);
        nums.sort(comparator);
        System.out.println(nums);


    }

    public void tapelTapel(int x, List<Integer> nums) {
        nums.forEach(num->num=x);
    }
}
