package action;

import object.Client;

import static utils.AddresAndClientBase.listClient;
import static utils.AddresAndClientBase.listPeopleOnFlatnumber;

public class PeopleOnFlatnumber {

    public PeopleOnFlatnumber() {
    }

    public void listPeopleOnFlatnumber() {
        for (int i = 0; i < listClient.size(); i++) {
            for (int j = i + 1; j < listClient.size(); j++) {
                Client person = listClient.get(i);
                Client human = listClient.get(j);
                if (person.address == human.address) {
                    System.out.println(person.toString());
                    System.out.println(human.toString());
                    System.out.println();
                    listPeopleOnFlatnumber.add(person);
                    listPeopleOnFlatnumber.add(human);
                }
            }
        }

    }

}