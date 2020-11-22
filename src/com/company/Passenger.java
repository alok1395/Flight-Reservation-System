package com.company;

public class Passenger {
    int id;
    Address address;
    Contact contact;

    Passenger(int id, Address address, Contact contact){
        this.id=id;
        this.address=address;
        this.contact=contact;
    }

    public Contact getContact(){
        return contact;
    }
    public  Address getaddress(){
        return address;
    }


}
