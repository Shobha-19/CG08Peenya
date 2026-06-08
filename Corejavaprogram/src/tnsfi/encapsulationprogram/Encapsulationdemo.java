package tnsfi.encapsulationprogram;
public class Encapsulationdemo {

    int serialnumber;
    String name;
    int age;

    void show() {
        System.out.println(serialnumber+" "+name+" "+age);
    }

    public static void main(String[] args) {
        Encapsulationdemo e=new Encapsulationdemo();
        e.serialnumber=9;
        e.name="Ramesh";
        e.age=56;
        e.show();
    }
}