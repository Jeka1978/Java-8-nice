package boxed;

import javafx.scene.control.IndexRange;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Created by Jeka on 06/09/2015.
 */
public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        IntStream.range(1,10000).parallel().forEach(nums::add);
        System.out.println(nums.size());


        List<Integer> collect = IntStream.range(1, 100000).parallel().boxed().collect(Collectors.toList());
    }
}
