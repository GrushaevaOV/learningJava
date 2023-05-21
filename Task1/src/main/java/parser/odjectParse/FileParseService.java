/*

package parser.odjectParse;

import object.Addres;
import parser.Parser;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipInputStream;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class FileParseService extends ParseXML*/
/*extends MediatorFileImpl*//*
 {

    Map convertFromListInMap(List<Addres> list) {
        return list.stream()
                .collect(Collectors.toMap(Addres::getId, address -> address));
    }

    public void dispatch(ZipFile file) throws IOException {
        List<BufferedReader> fff= new ArrayList<>();
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
        parse(fff,ze);
    }
    // sendFile();
}


*/
