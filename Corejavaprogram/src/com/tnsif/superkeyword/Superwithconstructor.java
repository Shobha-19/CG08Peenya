package com.tnsif.superkeyword;

class User1 {
    User1() {
        System.out.println("user account created..");
    }
}

class AdminUser extends User1 {
    AdminUser() {
        super();
        System.out.println("admin granted");
    }
}

public class Superwithconstructor {
    public static void main(String[] args) {
        AdminUser a = new AdminUser();
    }
}