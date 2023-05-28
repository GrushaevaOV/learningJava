package serviceDataPrint;

import action.CounterPeopleOnFloor;
import action.PeopleOnFlatnumber;
import utils.AddresAndClientBase;

import java.util.Scanner;

public class CommunicationUser extends DataPrint {

    public CommunicationUser() {
    }

    public void bazaFraza() {
        System.out.println();
        String message1 = " What are you doing? Print 1 (ALL Clients database); Print 2 (dataBase Address); Print 3 (Poick client po Name, PersonalNumber, Addres)";
        StringBuilder messageUser1 = new StringBuilder(message1);
        String message2 = " Print 4 - (print count people on floor); Print 5 - ( People lives 1 address); Print 6 - exit";
        StringBuilder messageUser2 = new StringBuilder(message2);
        System.out.println(messageUser1);
        System.out.println(messageUser2);
    }

    public void communicate() {
        bazaFraza();
        Scanner in = new Scanner(System.in);
        String answerUser = in.nextLine();
        while (!answerUser.equals("6")) {
            switch (answerUser) {
                case "1" -> AddresAndClientBase.printListClientBook();
                case "2" -> AddresAndClientBase.printListAddresBook();
                case "3" -> {
                    System.out.println("Print clients name or PersonalNumber or addres");
                    String answerUserCity = in.nextLine();
                    printClient(answerUserCity);
                }
                case "4" -> {
                    CounterPeopleOnFloor counterPeopleOnFloor = new CounterPeopleOnFloor();
                    counterPeopleOnFloor.numberPeopleOnFloor();
                }
                case "5" -> {
                    PeopleOnFlatnumber peopleOnFlatnumber = new PeopleOnFlatnumber();
                    peopleOnFlatnumber.listPeopleOnFlatnumber();
                }
                default -> System.out.println("Check your choice");
            }
            bazaFraza();
            answerUser = in.nextLine();
        }

    }
}

