package com.company;

public class Main {

    public static void main(String[] args) {

        Contact contact=new Contact("alok","8787255971", "alokyadav95@gmail.com");
        Address address=new Address("Chaman Vihar","Dehradun","Uttarakhand");
        Passenger passenger= new Passenger(01,address,contact);
        System.out.println(contact.getContactDetails());
        System.out.println(address.getAddressDetails());
    }
}
