package singliton;

public class DataBase {
    private static DataBase base;
    private DataBase (){
    }
    public static DataBase getInstanse(){
        if (base == null) {
            base = new DataBase();
            return base;
        }
        return base;
    }
}
