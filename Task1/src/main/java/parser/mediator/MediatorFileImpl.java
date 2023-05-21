package parser.mediator;

import parser.odjectParse.AddressParse;
import parser.odjectParse.ClientParse;
import parser.Parser;

import javax.xml.stream.XMLStreamException;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;
import java.util.zip.ZipEntry;

public abstract class MediatorFileImpl implements MediatorFile {

    static final Deque<BufferedReader> files = new LinkedList<>();
    static final Deque<ZipEntry> nameFiles = new LinkedList<>();
    static final HashMap<String, Parser> filesName = new HashMap<>();

    static {
        filesName.put("address.xml", new AddressParse());
        filesName.put("client.xml", new ClientParse());
    }

    public void addFile(BufferedReader bufferedReader, ZipEntry zipEntry) {
        files.push(bufferedReader);
        nameFiles.push(zipEntry);
    }

    @Override
    public void sendFile() throws XMLStreamException, FileNotFoundException {

       while ((nameFiles.peek()) != null) {
            Parser parse = filesName.get(nameFiles.peek().getName());
            nameFiles.poll();
            try {
                parse.parse(files.poll());
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

