package Task2;

import java.util.Date;

//Class representing a Ticket
class Ticket {
 private String source;
 private String destination;
 private Date dateOfJourney;
 private String time;
 private String busNo;
 private String seatNo;

 public Ticket(String source, String destination, Date dateOfJourney, String time, String busNo, String seatNo) {
     this.source = source;
     this.destination = destination;
     this.dateOfJourney = dateOfJourney;
     this.time = time;
     this.busNo = busNo;
     this.seatNo = seatNo;
 }

 @Override
 public String toString() {
     return "Ticket{" +
             "source='" + source + '\'' +
             ", destination='" + destination + '\'' +
             ", dateOfJourney=" + dateOfJourney +
             ", time='" + time + '\'' +
             ", busNo='" + busNo + '\'' +
             ", seatNo='" + seatNo + '\'' +
             '}';
 }
}