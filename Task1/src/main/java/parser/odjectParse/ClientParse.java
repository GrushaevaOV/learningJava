package parser.odjectParse;

import object.Addres;
import object.Client;
import utils.AddresAndClientBase;

import javax.xml.stream.XMLStreamReader;
import java.util.Map;

public class ClientParse extends ParseXML {
    public ClientParse() {
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
        return null;
    }
}