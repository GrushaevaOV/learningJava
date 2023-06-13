package abstractFabrica;

import abstractFabrica.carMarka.CarFactory;
import abstractFabrica.carMarka.ToyotaFactory;
import abstractFabrica.carType.ToyotaCoupe;
import abstractFabrica.carType.ToyotaSedan;

public class ParseToyotaType {
    public Object parseType (String carType){
        return switch (carType) {
          case "coupe" -> new ToyotaCoupe();
          case "sedan" -> new ToyotaSedan();
          default -> null;
        };
    }
}
