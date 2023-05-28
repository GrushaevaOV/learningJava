import parser.FileParseService;
import serviceDataPrint.CommunicationUser;

import javax.xml.stream.XMLStreamException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.zip.ZipFile;


public class IDEMain {

    public static void main(String[] args) throws IOException, XMLStreamException {
        FileParseService xmlParser = new FileParseService();

        xmlParser.dispatch(new ZipFile("Task1\\database.zip"));
        CommunicationUser communicationUser = new CommunicationUser();
        communicationUser.communicate();

       /* CounterPeopleOnFloor counterPeopleOnFloor = new CounterPeopleOnFloor();
        PeopleOnFlatnumber peopleOnFlatnumber = new PeopleOnFlatnumber();
        Thread processConterPeopleOnFloor = new Thread(counterPeopleOnFloor);
        Thread processPeopleOnFlatnumber = new Thread(peopleOnFlatnumber);
        processConterPeopleOnFloor.start();
        processPeopleOnFlatnumber.start();
        processConterPeopleOnFloor.join();

       for (Client client : listPeopleOnFlatnumber) {
            System.out.println(client.address.floor);
            System.out.println(client.toString());

        }
        System.out.println(" ");
        processPeopleOnFlatnumber.join();
        System.out.println(number);*/
    }
}