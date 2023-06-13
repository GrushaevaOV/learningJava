package abstractFabrica;

import abstractFabrica.carMarka.CarFactory;
import abstractFabrica.carMarka.FordFactory;
import abstractFabrica.carMarka.ToyotaFactory;

import java.util.Scanner;

public class AbstractFabricaTest {
    public static void main(String[] args) {
        CarFactory factory;
        System.out.println("What are you want?");
        System.out.println("toyota or ford?");
        Scanner in=new Scanner(System.in);
        String answerMarka = in.nextLine();
        switch (answerMarka) {
            case "toyota" -> {
                factory = new ToyotaFactory();
                System.out.println("Coupe or sedan");
                String answerType = in.nextLine();
                switch (answerType) {
                    case "sedan" -> factory.creatSedan();
                    case  "coupe" -> factory.createCoupe();
                    default -> System.out.println("Takogo net");
                }
            }
            case "ford" -> {
                factory = new FordFactory();
                System.out.println("Coupe or sedan");
                String answerType = in.nextLine();
                switch (answerType) {
                    case "sedan" -> factory.creatSedan();
                    case "coupe" -> factory.createCoupe();
                    default -> System.out.println("Takogo net");
                }
            }
            default -> System.out.println("takix net");
        }

    }
}
