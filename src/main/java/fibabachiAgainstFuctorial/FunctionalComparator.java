package fibabachiAgainstFuctorial;

import java.io.Serializable;
import java.util.function.IntUnaryOperator;

/**
 * Created by Jeka on 06/09/2015.
 */
public class FunctionalComparator {

    public static int sinceWhatNumber(IntUnaryOperator operator1, IntUnaryOperator operator2, int depth) {
        for (int i = 1; i < depth; i++) {
            if (operator1.applyAsInt(i) < operator2.applyAsInt(i)) {
                return i;
            }
        }
        return 0;
    }

    public static IntUnaryOperator getFuctorialLambda() {
        return x->{
            if(x==1) return x;
            else {
                return x * getFuctorialLambda().applyAsInt(x - 1);
            }
        };
    }

    public static IntUnaryOperator getSumLambda() {
        return x->{
            if(x==1) return x;
            else {
                return x + getSumLambda().applyAsInt(x - 1);
            }
        };
    }

    public static void main(String[] args) {
        System.out.println(sinceWhatNumber((IntUnaryOperator & Serializable) getSumLambda(),getFuctorialLambda(), 100));
    }




}
