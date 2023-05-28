package parser.odjectParse;

import object.Addres;
import object.Client;
import parser.ParseXML;
import utils.AddresAndClientBase;

import javax.xml.stream.XMLStreamReader;
import java.util.List;
import java.util.Map;

public class ClientParse extends ParseXML {

    public ClientParse() {
    }

    public void noDubleLine(List<Client> list) {
        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                Client person = list.get(i);
                Client human = list.get(j);
                if (person.personnelNumber.equals(human.personnelNumber)) {
                    list.remove(human);
                }
            }
        }

    }

    @Override
    public Client parseStr(XMLStreamReader parser) {
        Map addressMap = convertFromListInMap(AddresAndClientBase.listAdress);
         if (parser.getLocalName().equals("client")) {
            Client human = new Client();
            human.setId(Integer.parseInt(parser.getAttributeValue(0)));
            human.setName(parser.getAttributeValue(1));
            human.setPersonnelNumber(parser.getAttributeValue(2));
            human.setAddress((Addres) addressMap.get(Integer.parseInt(parser.getAttributeValue(3))));
            AddresAndClientBase.listClient.add(human);
            return human;
        }
        noDubleLine(AddresAndClientBase.listClient);
        return null;
    }
}