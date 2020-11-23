package com.company;

public class Passenger {

    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    private static class Address {
        String street, city, state;

        public Address(String street, String city, String state) {
            this.street = street;
            this.city = city;
            this.state = state;
        }
    }
    private Address address;

    private static class Contact {
        String name, phone, email;

        public Contact(String name, String phone, String email) {
            this.name = name;
            this.phone = phone;
            this.email = email;
        }
    }
    private  Contact contact;

    private static int idCounter;

    Passenger(int id,String addressStreet, String addressCity, String addressState,String contactName,
              String contactPhone, String contactEmail){
        this.id=++idCounter;
        this.address = new Address(addressStreet, addressCity, addressState);
        this.contact = new Contact(contactName, contactPhone, contactEmail);
    }

    public static int getIdCounter() {
        return idCounter;
    }

    public static void setIdCounter(int idCounter) {
        Passenger.idCounter = idCounter;
    }

    public Contact getContact(){

        return contact;
    }
    public  Address getaddress(){
        return address;
    }

    public  int getPassengerCount(){
        return idCounter;
    }

    public  String getAddressDetails(){

        return address.street + ", " + address.city + ", " + address.state;
    }
    public static void updateAddressDetails(String addressDetails){

    }

    public  String getContactDetails(){

        return contact.name + ", " + contact.phone + ", " + contact.email;
    }
    public static void updateContactDetails(String contactDetails){

    }

}
