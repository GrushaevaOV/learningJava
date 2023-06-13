package factory.systems;

public class LinuxOS implements OS {
    @Override
    public void getOS() {
        System.out.println("Linux");
    }
}
