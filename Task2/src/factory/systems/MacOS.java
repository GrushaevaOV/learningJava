package factory.systems;

import factory.OS;

public class MacOS implements OS {
    @Override
    public void getOS() {
        System.out.println("Mac");
    }
}
