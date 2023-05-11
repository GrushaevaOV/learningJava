package parser.odjectParse;

import parser.mediator.MediatorFileImpl;

import javax.xml.stream.XMLStreamException;
import java.io.File;
import java.io.FileNotFoundException;

public class FileParseService extends MediatorFileImpl {
    public void dispatch(File... files) throws XMLStreamException, FileNotFoundException {
        for (File file : files) {
            addFile(file);
        }
        sendFile();
    }
}