package com.company;

public class Main {

    public static void main(String[] args) {


        Passenger passenger= new Passenger(01,"alok","8787255971",
                "alokyadav95@gmail.com","Chaman Vihar","Dehradun","Uttarakhand");
        Flight flight= new Flight("687","Air India",160,01);
        System.out.println(passenger.getContactDetails());
        System.out.println(passenger.getAddressDetails());
        System.out.println(flight.getFlightDetails());
        Ticket ticket=new Ticket("AI-67854", "Delhi", "Mumbai", flight, "1100" ,
                "0200", passenger, "6B", 5678, false);
        printTicketDetails(ticket);

        TouristTicket touristTicket= new TouristTicket();
        printTicketDetails(touristTicket);

        RegularTicket regularTicket= new RegularTicket();
        printTicketDetails(regularTicket);


    }

    public static void printTicketDetails(Ticket ticket) {
        //Ticket newTicket = new Ticket();
        System.out.println(ticket.getPnr());
    }
}
