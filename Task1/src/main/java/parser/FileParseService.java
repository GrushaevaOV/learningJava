package parser;

import parser.mediator.MediatorFile;
import parser.mediator.MediatorFileImpl;

import javax.xml.stream.XMLStreamException;
import java.io.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipInputStream;

public class FileParseService extends MediatorFileImpl {


    public FileParseService() {
    }

    public void dispatch(ZipFile file) throws XMLStreamException, FileNotFoundException {

        try (ZipInputStream zipFile = new ZipInputStream(new FileInputStream(file.getName()))) {
            ZipEntry entry;
            while ((entry = zipFile.getNextEntry()) != null) {
                String name = entry.getName(); // получим название файла
                int size = (int) entry.getSize();  // получим его размер в байтах
                System.out.printf("File name: %s \t File size: %d \n", name, size);
                addFile(zipFile, entry.getName());

            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    sendFile();
    }
}




/*  byte[] buffer = new byte[2048];

        // open the zip file stream
        ZipInputStream stream = new ZipInputStream(new BufferedReader(new FileInputStream(String.valueOf(file))));

*/



       /* try (ZipInputStream zipFile =new ZipInputStream(new BufferedReader(new FileInputStream((file.getName())),4096))) {
            ZipEntry entry;
            while ((entry = zipFile.getNextEntry())!=null) {
                System.out.println(entry.getName());

            }
            zipFile.closeEntry();
        } catch (IOException e) {

            throw new RuntimeException(e);
        }*/