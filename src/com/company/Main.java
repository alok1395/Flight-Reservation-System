package com.company;

public class Main {

    public static void main(String[] args) {


        Passenger passenger= new Passenger(01,"alok","8787255971",
                "alokyadav95@gmail.com","Chaman Vihar","Dehradun","Uttarakhand");
        Flight flight= new Flight("687","Air India",160,01);
        System.out.println(passenger.getContactDetails());
        System.out.println(passenger.getAddressDetails());
        System.out.println(flight.getFlightDetails());

    }
}
