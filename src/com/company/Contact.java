package com.company;

public class Contact {
    String name;
    String phoneNo;
    String email;

    public Contact(String name, String phoneNo, String email) {
        this.name = name;
        this.phoneNo = phoneNo;
        this.email = email;
    }

    public  String getContactDetails(){

        return name + " " +phoneNo + " " + email;
    }
    public static void updateContactDetails(String contactDetails){

    }

}
