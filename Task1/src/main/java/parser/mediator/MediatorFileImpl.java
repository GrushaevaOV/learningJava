package parser.mediator;

import parser.odjectParse.AddressParse;
import parser.odjectParse.ClientParse;
import parser.Parser;

import javax.xml.stream.XMLStreamException;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class MediatorFileImpl implements MediatorFile {

    static final Queue<File> queueFiles = new LinkedList<>();
    static final HashMap<String, Parser> filesName = new HashMap<>();

    static {
        filesName.put("address.xml", new AddressParse());
        filesName.put("client.xml", new ClientParse());
    }

    public static void addFile(File file) {
        queueFiles.offer(file);
    }

    @Override
    public void sendFile() throws XMLStreamException, FileNotFoundException {
        while ((queueFiles.peek()) != null) {
            Parser parse = filesName.get(queueFiles.peek().getName());
            parse.parse(queueFiles.poll());
        }
    }

}

