package com.tnsif.encapsulationprogram;
public class Encapsulationprogram {

    private int id;
    private String name;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        Encapsulationprogram e1=new Encapsulationprogram();
        e1.setId(103);
        e1.setName("hamsa");
        System.out.println(e1.getId());
        System.out.println(e1.getName());
    }
}