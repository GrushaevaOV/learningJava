package abstractFabrica.carMarka;

import abstractFabrica.carType.Coupe;
import abstractFabrica.carType.Sedan;
import abstractFabrica.carType.ToyotaCoupe;
import abstractFabrica.carType.ToyotaSedan;

public class ToyotaFactory implements CarFactory {
    @Override
    public Sedan creatSedan() {
        return new ToyotaSedan();
    }

    @Override
    public Coupe createCoupe() {
        return new ToyotaCoupe();
    }
}
