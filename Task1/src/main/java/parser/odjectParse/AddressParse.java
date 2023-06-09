package parser.odjectParse;

import object.Addres;
import parser.ParseXML;
import utils.AddresAndClientBase;

import javax.xml.stream.XMLStreamReader;

public class AddressParse extends ParseXML {
    public AddressParse() {
    }

    @Override
    public Object parseStr(XMLStreamReader parser) {

        if (parser.getLocalName().equals("address")) {
            Addres add = new Addres();
            add.setId(Integer.parseInt(parser.getAttributeValue(0)));
            add.setCity(parser.getAttributeValue(1));
            add.setStreet(parser.getAttributeValue(2));
            add.setHouse(Integer.parseInt(parser.getAttributeValue(3)));
            add.setFloor(Integer.parseInt(parser.getAttributeValue(4)));
            AddresAndClientBase.listAdress.add(add);
            return add;
        }

        return null;
    }
}