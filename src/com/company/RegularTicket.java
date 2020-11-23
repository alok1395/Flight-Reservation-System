package com.company;

public class RegularTicket extends  Ticket{

    private  String specialServices;

    public String getSpecialServices() {
        return specialServices;
    }

    public void setSpecialServices(String specialServices) {
        this.specialServices = specialServices;
    }

    public RegularTicket(String pnr, String from, String t0, Flight flight, String departureDateTime, String arrivalDateTime, Passenger passenger, String seatNo, float price, boolean cancelled) {
        super(pnr, from, t0, flight, departureDateTime, arrivalDateTime, passenger, seatNo, price, cancelled);
    }

    public RegularTicket() {
        super();
    }

    public String getSpecialServicesByFlight(){
        return " ";
    }
    public  void updateSpecialServices(String specialServices){

    }
}
