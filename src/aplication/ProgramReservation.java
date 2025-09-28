package aplication;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

import entity.model.reservation;
import exceptions.DomainException;

public class ProgramReservation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        try{
            reservation r  = new reservation(23, sdf.parse("12/09/2025"), sdf.parse("20/09/2025"));

            System.out.println(r);

            System.out.println("Enter data to update the reservation:");
            r.updateDates(sdf.parse("30/09/2025"), sdf.parse("25/09/2025"));
            System.out.println(r);
        } 
        
        catch (ParseException e) {
            System.out.println("Invalid date format");
        } 
        
        catch(DomainException e){
            System.out.println("Error in reservation: "+e.getMessage());
        }

        catch(RuntimeException e){
            System.out.println("Unexpected error");
        }

        finally {
            sc.close();
        }


    }
}
