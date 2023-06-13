package factory;

import factory.systems.OS;

import java.util.Scanner;

public class FactoryTest {
    public static void main(String[] args) {
        System.out.println("choise your system: windows, linux or mac");
        Scanner in = new Scanner(System.in);
        String string = in.nextLine();
        Factory factory = new Factory();
        OS os = factory.getCurrentOS(string);
        os.getOS();
    }
}
