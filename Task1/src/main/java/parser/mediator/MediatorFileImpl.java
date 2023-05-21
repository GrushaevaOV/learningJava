/*
package parser.mediator;

import parser.odjectParse.AddressParse;
import parser.odjectParse.ClientParse;
import parser.Parser;

import javax.xml.stream.XMLStreamException;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
import java.util.zip.ZipEntry;

public class MediatorFileImpl implements MediatorFile {

    static final Queue<BufferedReader> queueFiles = new LinkedList<>();
    static final Queue<ZipEntry> queueNameFiles = new LinkedList<>();
    static final HashMap<String, Parser> filesName = new HashMap<>();

    static {
        filesName.put("address.xml", new AddressParse());
        filesName.put("client.xml", new ClientParse());
    }

    public static void addFile(BufferedReader bufferedReader,ZipEntry entry) {
        queueFiles.offer(bufferedReader);
        queueNameFiles.offer(entry);
    }

    @Override
    public void sendFile() throws XMLStreamException, FileNotFoundException {
        while ((queueNameFiles.peek()) != null) {
            Parser parse = filesName.get(queueNameFiles.peek().getName());
            System.out.println(parse);
            parse.parse(queueFiles.poll(),queueNameFiles.poll());
        }
    }

}
*/
