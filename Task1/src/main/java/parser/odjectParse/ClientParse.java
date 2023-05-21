package parser.odjectParse;

import object.Addres;
import object.Client;
import utils.AddresAndClientBase;

import javax.xml.stream.XMLStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ClientParse extends ParseXML {
    public ClientParse() {
    }
    @Override
    Client parseStr(String line) {
        Map addressMap = convertFromListInMap(AddresAndClientBase.listAdress);
        int indexJava = line.indexOf("client");
        if (indexJava != (-1)) {
            List<Integer> indexRazd = new ArrayList<>();
            char ch = '"';
            int index = line.indexOf(ch);
            while (index != -1) {
                indexRazd.add(index);
                index = line.indexOf(ch, index + 1);
            }
            Client client = new Client();
            client.setId(Integer.parseInt(line.substring(indexRazd.get(0) + 1, indexRazd.get(1))));
            client.setName(line.substring(indexRazd.get(2) + 1, indexRazd.get(3)));
            client.setPersonnelNumber(line.substring(indexRazd.get(4) + 1, indexRazd.get(5)));
            client.setAddress((Addres) addressMap.get(Integer.parseInt(line.substring(indexRazd.get(6) + 1, indexRazd.get(7)))));
            AddresAndClientBase.listClient.add(client);
            return client;
        }
        return null;



        /*if (parser.getLocalName().equals("client")) {
            Client human = new Client();
            human.setId(Integer.parseInt(parser.getAttributeValue(0)));
            human.setName(parser.getAttributeValue(1));
            human.setPersonnelNumber(parser.getAttributeValue(2));
            human.setAddress((Addres) addressMap.get(Integer.parseInt(parser.getAttributeValue(3))));
            AddresAndClientBase.listClient.add(human);
            return human;
        }
        return null;*/
    }
}
