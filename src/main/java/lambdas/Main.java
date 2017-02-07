package lambdas;

import java.io.IOException;
import java.io.NotSerializableException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by Jeka on 27/05/2015.
 */
public class Main {
    public static void main(String[] args) {





    }

    public Collection<Person> applyNames(Collection<String> names) {
        Function<String, Person> toPerson =  s -> new Person(s, 100);
        List<Person> persons = new ArrayList<>(names.size());
        names.forEach(s -> { persons.add(toPerson.apply(s)); });
        return persons;
    }
}
