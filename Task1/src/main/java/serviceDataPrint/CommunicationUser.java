package serviceDataPrint;

import utils.AddresAndClientBase;

import java.util.Scanner;

public class CommunicationUser extends DataPrint {
    public CommunicationUser() {
    }

    public void communicate() {
        //StringBuilder
        System.out.println("Good day! What are you doing");
        System.out.println("Print 1 (ALL Clients database) ");
        System.out.println("Print 2 (dataBase Address) ");
        System.out.println("Print 3 (Poick client po Name, PersonalNumber, Addres)");
        //
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

