package parser.mediator;

import javax.xml.stream.XMLStreamException;
import java.io.FileNotFoundException;
import java.io.InputStream;

public interface MediatorFile {
    void sendFile(InputStream inputStream, String fileName) throws XMLStreamException, FileNotFoundException;
}