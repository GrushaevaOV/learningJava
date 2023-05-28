package parser;

import javax.xml.stream.XMLStreamException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public interface Parser {

    void parse(InputStream inputStream) throws FileNotFoundException, XMLStreamException;


}

