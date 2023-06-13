package prototype;

public class CompicatedObject implements Copyable{
    private String nameOdject;
    private String typeObject;

    public CompicatedObject(String nameOdject, String typeObject) {
        this.nameOdject = nameOdject;
        this.typeObject = typeObject;
    }

    @Override
    public String toString() {
        return   "nameOdject='" + nameOdject + '\'' +
                ", typeObject='" + typeObject + '\'';
    }

    public CompicatedObject copy (){
        CompicatedObject copy = new CompicatedObject( nameOdject, typeObject);
        return copy;
    }

}
