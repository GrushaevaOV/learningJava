package abstractFabrica.carMarka;

import abstractFabrica.carType.Coupe;
import abstractFabrica.carType.Sedan;

public interface CarFactory {
    Sedan creatSedan();
    Coupe createCoupe();

}
