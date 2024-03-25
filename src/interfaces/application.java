package interfaces;


import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class application {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner =  new Scanner(System.in);

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        System.out.println("Entre com os dados do Aluguel: ");
        System.out.println("Modelo do Carro: ");
        String carModel = scanner.nextLine();
        System.out.println("Retirada (dd/MM/yyyy hh:mm): ");
        LocalDateTime startLocalDateTime = LocalDateTime.parse(scanner.nextLine(), dateTimeFormatter);
        System.out.println("Devolucao (dd/MM/yyyy hh:mm): ");
        LocalDateTime returnLocalDateTime = LocalDateTime.parse(scanner.nextLine(), dateTimeFormatter);

        CarRental carRental = new CarRental(startLocalDateTime, returnLocalDateTime, new Vehicle(carModel));

        System.out.println("Entre com o preço por Hora: ");
        double pricePerHour = scanner.nextDouble();
        System.out.println("Entre com o preço por Dia: ");
        double pricePerDay = scanner.nextDouble();

        RentalServices rentalServices = new RentalServices(pricePerHour, pricePerDay,new BrazilTaxService());
        rentalServices.processInvoice(carRental);
        System.out.println("Fatura :");
        System.out.println("Pagamento Basico: " +carRental.getInvoice().getBasicPayment());
        System.out.println("Imposto: " + carRental.getInvoice().getTax());
        System.out.println("Pagamento Total: " + carRental.getInvoice().getTotalPayment());

        scanner.close();
    }
}
