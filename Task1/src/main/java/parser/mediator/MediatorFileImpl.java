package parser.mediator;

import parser.Parser;
import parser.odjectParse.AddressParse;
import parser.odjectParse.ClientParse;

import javax.xml.stream.XMLStreamException;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.HashMap;

public class MediatorFileImpl implements MediatorFile {

    static final HashMap<String, Parser> filesName = new HashMap<>();

    static {
        filesName.put("address.xml", new AddressParse());
        filesName.put("client.xml", new ClientParse());
    }

    @Override
    public void sendFile(InputStream inputStream, String fileName) throws XMLStreamException, FileNotFoundException {
        Parser parse = filesName.get(fileName);
        parse.parse(inputStream);
    }
}