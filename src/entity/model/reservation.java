package entity.model;

 import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.concurrent.TimeUnit;

public class reservation {
    private Integer roomNumber;
    private Date checkIn;
    private Date checkOut;

    private static SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");

    public reservation(Integer roomNumber, Date checkIn, Date checkOut) {
       if(!checkOut.after(checkIn)){
           throw new exceptions.DomainException("Check-out date must be after check-in date");}

        this.roomNumber = roomNumber;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }

    public Integer getRoomNumber() {
        return roomNumber;
    }

    
    public Date getCheckIn() {
        return checkIn;
    }

    public Date getCheckOut() {
        return checkOut;
    }

    public long duration(){
        long diff=checkOut.getTime()-checkIn.getTime();
        return TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
    }

    public void updateDates(Date checkIn, Date checkOut) {
        Date now=new Date();
        if(checkIn.before(now) || checkOut.before(now)){
            throw new exceptions.DomainException("Reservation dates for update must be future dates");
        }
        if(!checkOut.after(checkIn)){
            throw new exceptions.DomainException("Check-out date must be after check-in date");
        }
        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }

    @Override
    public String toString() {
        return "Reservation{" +
                "roomNumber=" + roomNumber +
                ", checkIn=" + sdf.format(checkIn)+
                ", checkOut=" + sdf.format(checkOut) +
                ", duration=" + duration() +
                '}';
    }
}
