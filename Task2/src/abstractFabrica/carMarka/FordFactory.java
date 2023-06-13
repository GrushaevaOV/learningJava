package abstractFabrica.carMarka;

import abstractFabrica.carType.Coupe;
import abstractFabrica.carType.FordCoupe;
import abstractFabrica.carType.FordSedan;
import abstractFabrica.carType.Sedan;

public class FordFactory implements CarFactory {
    @Override
    public Sedan creatSedan() {
        return new FordSedan();
    }

    @Override
    public Coupe createCoupe() {
        return new FordCoupe();
    }
}
