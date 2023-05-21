
package parser.odjectParse;

import object.Addres;
import utils.AddresAndClientBase;

import javax.xml.stream.XMLStreamReader;
import java.util.ArrayList;
import java.util.List;

public class AddressParse extends ParseXML {
    public AddressParse() {
    }

    @Override
    Object parseStr(String line) {
        int indexJava = line.indexOf("address");
        if (indexJava != (-1)) {
            List<Integer> indexRazd = new ArrayList<>();
            char ch = '"';
            int index = line.indexOf(ch);
            while (index != -1) {
                indexRazd.add(index);
                index = line.indexOf(ch, index + 1);
            }
            Addres addres = new Addres();
            addres.setId(Integer.parseInt(line.substring(indexRazd.get(0) + 1, indexRazd.get(1))));
            addres.setCity(line.substring(indexRazd.get(2) + 1, indexRazd.get(3)));
            addres.setStreet(line.substring(indexRazd.get(4) + 1, indexRazd.get(5)));
            addres.setFloor(Integer.parseInt(line.substring(indexRazd.get(6) + 1, indexRazd.get(7))));
            addres.setFlatNumber(Integer.parseInt(line.substring(indexRazd.get(8) + 1, indexRazd.get(9))));
            AddresAndClientBase.listAdress.add(addres);
            return addres;
        }
        return null;

      /*  if (parser.getLocalName().equals("address")) {
            Addres add = new Addres();
            add.setId(Integer.parseInt(parser.getAttributeValue(0)));
            add.setCity(parser.getAttributeValue(1));
            add.setStreet(parser.getAttributeValue(2));
            add.setHouse(Integer.parseInt(parser.getAttributeValue(3)));
            add.setFloor(Integer.parseInt(parser.getAttributeValue(4)));
            AddresAndClientBase.listAdress.add(add);
            return add;
        }

        return null;*/
    }
}

