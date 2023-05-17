import parser.odjectParse.FileParseService;
import utils.AddresAndClientBase;

import javax.xml.stream.XMLStreamException;
import java.io.File;
import java.io.FileNotFoundException;


public class IDEMain {

    public static void main(String[] args) throws XMLStreamException, FileNotFoundException {
        FileParseService xmlParser = new FileParseService();
        xmlParser.dispatch(new File("address.xml"), new File("client.xml"));
        AddresAndClientBase.printListClientBook();
    }
}

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

