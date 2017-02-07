package supplier;

import java.util.function.Supplier;

/**
 * Created by Jeka on 08/08/2015.
 */
public class Main {
    public static void main(String[] args) {
        TaxService taxService = new TaxService();
        double afterMaam = taxService.afterMaam(100, () -> {
            double maam=0;
            //some code which calculates maame
            return maam;
        });
        System.out.println("afterMaam = " + afterMaam);

    }
}
