package com.tnsif.accessmodifierprogram1;
//demo for public access modifier
	// private (with in class)
public class Publicdemo {

	    public int a=9;
	    private String b="shobha";
	    char w='i';
	    protected int s=7;
	    
	    public void display() {
	        System.out.println("welcome");
	    }
	    
	    public static void main(String[] args) {
	        Publicdemo p=new Publicdemo();
	        System.out.println(p.a);
	        System.out.println(p.b);
	        System.out.println(p.s);
	        System.out.println(p.w);
	    }
	}
