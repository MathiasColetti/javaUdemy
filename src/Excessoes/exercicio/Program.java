package Excessoes.exercicio;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("Room number");
        int number = scanner.nextInt();
        System.out.println("Check in Date (dd/MM/yyyy)");
        Date checkIn = simpleDateFormat.parse(scanner.next());
        System.out.println("Check in Date (dd/MM/yyyy)");
        Date checkOut = simpleDateFormat.parse(scanner.next());

        if (!checkOut.after(checkIn)) {
            System.out.println("Error  in reservation Check=out date must be after check-in");
        } else {
            Reservation reservation = new Reservation(number, checkIn, checkOut);
            System.out.println("Reservation " + reservation);
        }
    }
}
