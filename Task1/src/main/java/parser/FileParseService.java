package parser;

import exeption.ParserException;
import parser.mediator.MediatorFile;
import parser.mediator.MediatorFileImpl;

import javax.xml.stream.XMLStreamException;
import java.io.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipInputStream;

public class FileParseService {

    public FileParseService() {
    }

    MediatorFile mediatorFile = new MediatorFileImpl();

    public void dispatch(ZipFile file) throws XMLStreamException, ParserException {

        try (ZipInputStream zipFile = new ZipInputStream(new BufferedInputStream(new FileInputStream(file.getName())))) {
            ZipEntry entry;
            while ((entry = zipFile.getNextEntry()) != null) {
                String name = entry.getName(); // получим название файла
                int size = (int) entry.getSize();  // получим его размер в байтах
                System.out.printf(zipFile.getClass() + " File name: %s \t File size: %d \n", name, size);
                mediatorFile.sendFile(zipFile, entry.getName());

            }
        } catch (IOException e) {
            throw new ParserException("Check zip-file");
        }
    }
}