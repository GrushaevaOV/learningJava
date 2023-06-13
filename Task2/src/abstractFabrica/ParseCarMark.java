package abstractFabrica;

import abstractFabrica.carMarka.CarFactory;
import abstractFabrica.carMarka.FordFactory;
import abstractFabrica.carMarka.ToyotaFactory;

public class ParseCarMark {
    public CarFactory parse (String carMark) {
        return switch (carMark){
            case "toyota" -> new ToyotaFactory();
            case  "ford" -> new FordFactory();
            default -> null;
        };
    }
}
