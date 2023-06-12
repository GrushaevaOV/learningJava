package factory.systems;

import factory.OS;

public class LinuxOS implements OS {
    @Override
    public void getOS() {
        System.out.println("Linux");
    }
}
