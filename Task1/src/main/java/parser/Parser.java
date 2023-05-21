package parser;

import javax.xml.stream.XMLStreamException;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.zip.ZipEntry;

public interface Parser {
    void parse(List<BufferedReader> bufferedReaders, List<ZipEntry> entrys ) throws IOException;


}

