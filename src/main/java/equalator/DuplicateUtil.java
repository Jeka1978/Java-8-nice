package equalator;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Jeka on 06/09/2015.
 */
public class DuplicateUtil {

    @Autowired
    private MyService service;

    public static <T> int  countDuplicates(T t, List<T> list, Equalator<T> equalator) {
        int counter=0;
        for (T o : list) {
            if (equalator.equals(o, t)) {
                counter++;
            }
        }
        return counter;

    }

    public  void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();
        countDuplicates("java", strings, (t1, t2) -> {
            return t1.length() - t2.length()>0;
        });
    }
















}
