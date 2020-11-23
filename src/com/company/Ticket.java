package com.company;

public class Ticket {
    String pnr ;
    String from;
    String t0 ;
    Flight flight;
    String departureDateTime;
    String arrivalDateTime ;
    Passenger passenger ;
    String seatNo ;

    public Ticket(String pnr, String from, String t0, Flight flight, String departureDateTime,
                  String arrivalDateTime, Passenger passenger, String seatNo, float price, boolean cancelled) {
        this.pnr = pnr;
        this.from = from;
        this.t0 = t0;
        this.flight = flight;
        this.departureDateTime = departureDateTime;
        this.arrivalDateTime = arrivalDateTime;
        this.passenger = passenger;
        this.seatNo = seatNo;
        this.price = price;
        this.cancelled = cancelled;
    }

    float price ;
    boolean cancelled ;

    public void cancel(){

    }
    public int getFlightDuration(){
        return 0;
    }
    public String checkStatus(){
        return null;
    }

}
