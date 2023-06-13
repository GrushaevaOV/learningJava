package singliton;

public class Sigliton {
    public static void main(String[] args) {
        DataBase dataBase = DataBase.getInstanse();
        DataBase dataBase1 = DataBase.getInstanse();
        System.out.println(dataBase1.equals(dataBase));

    }

}
