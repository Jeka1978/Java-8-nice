package multipleInharitance;

/**
 * Created by Jeka on 16/09/2015.
 */
public interface Abc {
    default void x(){
        System.out.println(123);
    }
}
