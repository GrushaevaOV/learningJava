package prototype;

public class PrototypeTest {
    public static void main(String[] args) {
        CompicatedObject prototype = new CompicatedObject("Tobbik", "dog");
        System.out.println(prototype.toString());
        CompicatedObject clone= prototype.copy();
        System.out.println(clone.toString());
    }
}
