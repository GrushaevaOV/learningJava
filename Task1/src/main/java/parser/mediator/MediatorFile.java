package parser.mediator;

import javax.xml.stream.XMLStreamException;
import java.io.FileNotFoundException;

public interface MediatorFile {
    void sendFile() throws XMLStreamException, FileNotFoundException;
}