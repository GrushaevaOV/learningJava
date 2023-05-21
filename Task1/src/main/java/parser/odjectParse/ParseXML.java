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

public class ParseXML implements Parser {


    Map convertFromListInMap(List<Addres> list) {
        return list.stream()
                .collect(Collectors.toMap(Addres::getId, address -> address));
    }

    //abstract Object parseStr(XMLStreamReader parser);
    public void dispatch(ZipFile file) throws IOException {
        List<BufferedReader> fff = new ArrayList<>();
        List<ZipEntry> ze = new ArrayList<>();
        try (ZipInputStream zin = new ZipInputStream(new FileInputStream(file.getName()))) {
            ZipEntry entry;
            while ((entry = zin.getNextEntry()) != null) {
                BufferedReader filesFromZip = new BufferedReader(new InputStreamReader((file.getInputStream(entry))));
                fff.add(filesFromZip);
                ze.add(entry);
            }
            zin.closeEntry();
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
        parse(fff, ze);
    }

    @Override
    public void parse(List<BufferedReader> bufferedReaders, List<ZipEntry> entrys) throws IOException {
        if (entrys.get(0).getName().equals("address.xml")) {
            parseAddres(bufferedReaders.get(0));
        } else  {
            parseAddres(bufferedReaders.get(1));
        }
        if (entrys.get(0).getName().equals("client.xml")) {
            parseClient(bufferedReaders.get(0));
        } else  {
            parseClient(bufferedReaders.get(1));
        }

    }

    public void parseAddres(BufferedReader bufferedReader) throws IOException {
        String line;
        while ((line = bufferedReader.readLine()) != null) {
            int indexJava = line.indexOf("address");
            if (indexJava != (-1)) {
                List<Integer> indexRazd = new ArrayList<>();
                char ch = '"';
                int index = line.indexOf(ch);
                while (index != -1) {
                    indexRazd.add(index);
                    index = line.indexOf(ch, index + 1);
                }
                Addres addres = new Addres();
                addres.setId(Integer.parseInt(line.substring(indexRazd.get(0) + 1, indexRazd.get(1))));
                addres.setCity(line.substring(indexRazd.get(2) + 1, indexRazd.get(3)));
                addres.setStreet(line.substring(indexRazd.get(4) + 1, indexRazd.get(5)));
                addres.setFloor(Integer.parseInt(line.substring(indexRazd.get(6) + 1, indexRazd.get(7))));
                addres.setFlatNumber(Integer.parseInt(line.substring(indexRazd.get(8) + 1, indexRazd.get(9))));
                AddresAndClientBase.listAdress.add(addres);
            }
        }

    }


    public void parseClient(BufferedReader bufferedReader) throws IOException {
        String line;
        Map addressMap = convertFromListInMap(AddresAndClientBase.listAdress);

        while ((line = bufferedReader.readLine()) != null) {
            int indexJava = line.indexOf("client");
            if (indexJava != (-1)) {
                List<Integer> indexRazd = new ArrayList<>();
                char ch = '"';
                int index = line.indexOf(ch);
                while (index != -1) {
                    indexRazd.add(index);
                    index = line.indexOf(ch, index + 1);
                }
                Client client = new Client();
                client.setId(Integer.parseInt(line.substring(indexRazd.get(0) + 1, indexRazd.get(1))));
                client.setName(line.substring(indexRazd.get(2) + 1, indexRazd.get(3)));
                client.setPersonnelNumber(line.substring(indexRazd.get(4) + 1, indexRazd.get(5)));
                client.setAddress((Addres) addressMap.get(Integer.parseInt(line.substring(indexRazd.get(6) + 1, indexRazd.get(7)))));
                AddresAndClientBase.listClient.add(client);
            }
        }

        AddresAndClientBase.printListClientBook();

    }


}
