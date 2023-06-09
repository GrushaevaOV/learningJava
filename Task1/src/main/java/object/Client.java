package object;

public class Client {
    public int id;              // идентификатор
    public String name;            // ФИО
    public String personnelNumber; // персональный номер
    public Addres address;         // адрес проживания


    public Client(int id, String name, String personnelNumber, Addres address) {
        this.id = id;
        this.name = name;
        this.personnelNumber = personnelNumber;
        this.address = address;
    }

    public Client() {
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPersonnelNumber(String personnelNumber) {
        this.personnelNumber = personnelNumber;
    }

    public void setAddress(Addres address) {
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPersonnelNumber() {
        return personnelNumber;
    }

    public Addres getAddress() {
        return address;
    }

    public String toString() {
        String string = id + " " + name + " " + personnelNumber + " " + address.getCity() + " " + address.getStreet() + " " + address.getHouse() + " " + address.getFloor() + " " + address.getFlatNumber();

        return string;
    }

}
