package finalprograms;

class father {
    int a = 90;

    final void display() {
        System.out.println("welcome to java");
    }
}

public class Finalmethod extends father {

    // Cannot override final method, so add a new method
    void show() {
        System.out.println("welcome to python");
    }

    public static void main(String[] args) {
        Finalmethod f = new Finalmethod();
        f.display(); // calls father's final method
        f.show();    // calls child's method
    }
}