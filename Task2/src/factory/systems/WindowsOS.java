package factory.systems;

import factory.OS;

public class WindowsOS implements OS {

    @Override
    public void getOS() {
        System.out.println("windows");
    }
}
