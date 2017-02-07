package supplier;

import java.util.function.Supplier;

/**
 * Created by Jeka on 08/08/2015.
 */
public class TaxService {
    public double afterMaam(double price, Supplier<Double> maamSuplier) {
        return maamSuplier.get() * price + price;
    }
}
