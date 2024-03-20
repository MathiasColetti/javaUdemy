package Excessoes.exercicio;

import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Reservation {
    private Integer roomNumber;
    private Date checkin;
    private Date checkout;

    public Integer getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(Integer roomNumber) {
        this.roomNumber = roomNumber;
    }

    public Date getCheckin() {
        return checkin;
    }



    public Date getCheckout() {
        return checkout;
    }


    private Reservation(){

    }

    public Reservation(Integer roomNumber, Date checkin, Date checkout) {
        this.roomNumber = roomNumber;
        this.checkin = checkin;
        this.checkout = checkout;
    }
    public long duration(){
        long diff = checkout.getTime() - checkin.getTime();
         return TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
    }
    public  void updateDate(Date newCheckin, Date newCheckout){

    }

    @Override
    public String toString() {
        return "Reservation{" +
                "roomNumber=" + roomNumber +
                ", checkin=" + checkin +
                ", checkout=" + checkout +
                '}';
    }
}
