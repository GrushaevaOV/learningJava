package parser;

import object.Addres;
import parser.Parser;

import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public abstract class ParseXML implements Parser {

    public Map convertFromListInMap(List<Addres> list) {
        return list.stream()
                .collect(Collectors.toMap(Addres::getId, address -> address));
    }

    public abstract  Object parseStr(XMLStreamReader parser);

    public void parse(InputStream file) {
        XMLInputFactory factory = XMLInputFactory.newInstance();
        XMLStreamReader parser = null;
        try {
            parser = factory.createXMLStreamReader(file);
        } catch (XMLStreamException e) {
            System.out.println(e.getMessage());
        }
        try {
            while (true) {
                assert parser != null;
                if (!parser.hasNext()) break;
                int event = parser.next();
                if (event == XMLStreamConstants.START_ELEMENT) {
                    parseStr(parser);
                }
            }
        } catch (XMLStreamException e) {
            System.out.println(e.getMessage());
        }

    }

}