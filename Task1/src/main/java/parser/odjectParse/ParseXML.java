package parser.odjectParse;

import object.Addres;
import object.Client;
import parser.Parser;
import utils.AddresAndClientBase;

import javax.xml.stream.XMLStreamException;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipInputStream;

public abstract class ParseXML implements Parser {


    Map convertFromListInMap(List<Addres> list) {
        return list.stream()
                .collect(Collectors.toMap(Addres::getId, address -> address));
    }

    abstract Object parseStr(String line);



    @Override
    public void parse(BufferedReader bufferedReader) throws IOException {
        String line;
        List<Object> objects = new ArrayList<>();
        while ((line = bufferedReader.readLine()) != null) {
            Object object = parseStr(line);
            objects.add(object);
        }

    }


}
