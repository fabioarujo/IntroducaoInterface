import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import models.entites.CarRental;
import models.entites.Vehicle;
import models.services.BrazilTaxServices;
import models.services.RentalServices;

public class Program {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:ss");
		
		System.out.println("Enter rentl data");
		System.out.println("Car model: ");
		String carModel = sc.nextLine();
		System.out.println("Pickup (dd/MM/yyyy hh:ss): ");
		Date start = sdf.parse(sc.nextLine());
		System.out.println("Return (dd/MM/yyyy hh:ss): ");
		Date finish = sdf.parse(sc.nextLine());
		
		
		CarRental cr = new CarRental(start, finish, new Vehicle(carModel));
		
		System.out.println("Enter price per hour: ");
		double pricePerHour = sc.nextDouble();
		System.out.println("Enter price per day");
		double pricePerDay = sc.nextDouble();
		
		RentalServices rentalService = new RentalServices(pricePerDay, pricePerHour, new BrazilTaxServices());
		
		rentalService.processInvoice(cr);
		
		System.out.println("INVOICE:");
		System.out.println("Basic payment: " + String.format("%.2F", cr.getInvoice().getBasicPayments()));
		System.out.println("Tax: " + String.format("%.2F", cr.getInvoice().getTax()));
		System.out.println("Total payment: " + String.format("%.2F", cr.getInvoice().getTotalPayment()));
		
		sc.close();

	}

}
