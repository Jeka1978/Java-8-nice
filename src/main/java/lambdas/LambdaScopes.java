package lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/**
 * Created by Jeka on 26/05/2015.
 */
public class LambdaScopes {
    public String toString() { return "Hasamba!" ; }

        Runnable r1 = () -> {System.out.println(this);};
        Runnable r2 = () -> {System.out.println(toString());};
        Runnable r3 = () -> {System.out.println(this.toString());};

        Runnable r4 = new Runnable() {
            public void run() {System.out.println(this);}
        };
        Runnable r5 = new Runnable() {
            public void run() {System.out.println(toString());}
        };

    public static void main(String[] args) {
        List<String> list = Arrays.asList("a", "b");

        Consumer<String> toLowerCase = String::toLowerCase;
        list.forEach(toLowerCase);

        Abc c = String::toLowerCase;

        new LambdaScopes().r1.run();
        new LambdaScopes().r2.run();
        new LambdaScopes().r3.run();
        new LambdaScopes().r4.run();
        new LambdaScopes().r5.run();
    }
}

