package com.company;

public class TouristTicket extends  Ticket{

    String hotelAddress ;
    String[] selectedTouristLocation = new String[5];

    public TouristTicket(String pnr, String from, String t0, Flight flight, String departureDateTime,
                         String arrivalDateTime, Passenger passenger, String seatNo,
                         float price, boolean cancelled) {
        super(pnr, from, t0, flight, departureDateTime, arrivalDateTime, passenger, seatNo, price, cancelled);
    }
    public TouristTicket() {
        super();
    }


    public String getHotelAddress() {
        return hotelAddress;
    }
    public String[] getTouristLocation(){
        return selectedTouristLocation;
    }
    public void removeTouristLocation(String location) {

            }
    public void addTouristLocation(String location){

    }

}
