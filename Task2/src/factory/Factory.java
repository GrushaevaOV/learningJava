package factory;

import factory.systems.LinuxOS;
import factory.systems.MacOS;
import factory.systems.WindowsOS;

public class Factory {
    public OS getCurrentOS(String inputos) {
        return switch (inputos) {
            case "windows" -> new WindowsOS();
            case "linux" -> new LinuxOS();
            case "mac" -> new MacOS();
            default -> null;
        };
    }
}
