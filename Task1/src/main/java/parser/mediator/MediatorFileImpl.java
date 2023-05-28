package parser.mediator;

import parser.odjectParse.AddressParse;
import parser.odjectParse.ClientParse;
import parser.Parser;

import javax.xml.stream.XMLStreamException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.*;

public class MediatorFileImpl implements MediatorFile {
    static List <InputStream> files = new ArrayList<>();
    static  List <String> names = new ArrayList<>();

    static final HashMap<String, Parser> filesName = new HashMap<>();

    static {
        filesName.put("address.xml", new AddressParse());
        filesName.put("client.xml", new ClientParse());
    }

    public void addFile (InputStream inputStream, String fileName) {
        files.add(inputStream);
        names.add(fileName);
    }

    @Override
    public void sendFile() throws XMLStreamException, FileNotFoundException {
        for (int i=0;i<files.size();i++) {
        Parser parser = filesName.get(names.get(i));
        parser.parse(files.get(i));
        }
        /*Parser parse = filesName.get(fileName);
        parse.parse(inputStream);*/
    }
}
