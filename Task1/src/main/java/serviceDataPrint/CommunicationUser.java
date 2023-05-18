package serviceDataPrint;

import utils.AddresAndClientBase;

import java.util.Scanner;

public class CommunicationUser extends DataPrint {
    public CommunicationUser() {
    }

    public void communicate() {
        String message = "Good day! What are you doing? Print 1 (ALL Clients database); Print 2 (dataBase Address); Print 3 (Poick client po Name, PersonalNumber, Addres) ";
        StringBuilder messageUser = new StringBuilder(message);
        System.out.println(messageUser);
        Scanner in = new Scanner(System.in);
        String answerUser = in.nextLine();
        switch (answerUser) {
            case "1" -> AddresAndClientBase.printListClientBook();
            case "2" -> AddresAndClientBase.printListAddresBook();
            case "3" -> {
                System.out.println("Print clients name or PersonalNumber or addres");
                String answerUserCity = in.nextLine();
                printClient(answerUserCity);
            }
            default -> System.out.println("Check your choice");
        }
    }
}

