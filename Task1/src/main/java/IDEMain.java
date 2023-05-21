import parser.odjectParse.ParseXML;

import javax.xml.stream.XMLStreamException;
import java.io.IOException;
import java.util.zip.ZipFile;


public class IDEMain {

    public static void main(String[] args) throws XMLStreamException, IOException {
        ParseXML parseXML=new ParseXML();
        parseXML.dispatch(new ZipFile("Task1/dataBaseClient.zip"));


        /*FileParseService xmlParser = new FileParseService();
        xmlParser.dispatch(new ZipFile("Task1/dataBaseClient.zip"));*/
        /*CommunicationUser communicationUser = new CommunicationUser();
        communicationUser.communicate();*/

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