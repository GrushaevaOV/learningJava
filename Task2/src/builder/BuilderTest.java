package builder;

public class BuilderTest {
    public static void main(String[] args) {
        Cat cat1 = Cat.newBuilder()
                .setNameCat("pushok")
                .setYear(5)
                .setColor("white").build();
        Cat cat2 = Cat.newBuilder()
                .setNameCat("barsik")
                .setColor("black").build();
        System.out.println(cat1.toString());
        System.out.println(cat2.toString());

    }
}
