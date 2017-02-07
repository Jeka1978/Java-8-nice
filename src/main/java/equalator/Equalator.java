package equalator;

/**
 * Created by Jeka on 06/09/2015.
 */

@FunctionalInterface
public interface Equalator<T> {
    boolean equals(T t1, T t2);
    default void x() {
        System.out.println();
    }


}
