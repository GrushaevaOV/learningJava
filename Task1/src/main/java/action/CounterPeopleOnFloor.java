package action;

package action;

import object.Client;

import static utils.AddresAndClientBase.listClient;
import static utils.AddresAndClientBase.number;

public class CounterPeopleOnFloor{

    public CounterPeopleOnFloor() {
    }

    public  void numberPeopleOnFloor() {
        for (Client human : listClient) {
            if (!number.containsKey(human.address.getFloor())) {
                number.put(human.address.getFloor(), 1);
            } else {
                number.put(human.address.getFloor(), number.get(human.address.getFloor()) + 1);
            }
        }
        System.out.println(number);
    }

}