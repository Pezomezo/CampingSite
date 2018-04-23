package domain;

import java.util.Date;

public class Events {
    private String EventID;
    private String eventDescrip;
    private Date date;
    private double ticketPrice;

    public Events(String eventID, String eventDescrip, Date date, double ticketPrice) {
        EventID = eventID;
        this.eventDescrip = eventDescrip;
        this.date = date;
        this.ticketPrice = ticketPrice;
    }
}
