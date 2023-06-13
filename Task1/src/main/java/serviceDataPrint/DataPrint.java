package serviceDataPrint;

import object.Client;
import utils.AddresAndClientBase;

public class DataPrint {
    public void printClient(String line) {
        int counter = 0;
        for (Client client : AddresAndClientBase.listClient) {
            if (line.equals(client.name) || line.equals(client.personnelNumber) || line.equals(client.address.toStringAddress())) {
                System.out.println(client.name + client.address.toStringAddress());
                counter++;
            }
        }
        if (counter == 0) System.out.println("Takih net!");
    }
}

