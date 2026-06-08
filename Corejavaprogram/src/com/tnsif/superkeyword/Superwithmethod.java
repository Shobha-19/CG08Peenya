package com.tnsif.superkeyword;

class Payment1 {
    void process() {
        System.out.println("processing payment using standard gateway..");
    }
}

class Gpay extends Payment1 {
    void process() {
        System.out.println("processing payment using standard gpay..");
    }

    void completetransation() {
        super.process();
        process();
    }
}

public class Superwithmethod {
    public static void main(String[] args) {
        Gpay g = new Gpay();
        g.completetransation();
    }
}