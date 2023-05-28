import exeption.ParserException;
import parser.FileParseService;
import serviceDataPrint.CommunicationUser;

import javax.xml.stream.XMLStreamException;
import java.io.IOException;
import java.util.zip.ZipFile;

public class IDEMain {

    public static void main(String[] args) throws IOException, XMLStreamException, ParserException {
        FileParseService xmlParser = new FileParseService();
        xmlParser.dispatch(new ZipFile("Task1\\database.zip"));
        CommunicationUser communicationUser = new CommunicationUser();
        communicationUser.communicate();
    }
}