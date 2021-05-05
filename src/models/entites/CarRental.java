package models.entites;

import java.util.Date;

public class CarRental {
	private Date start;
	private Date finish;
	
	private Vehicle veihicle;
	private Invoice invoice;
	
	public CarRental() {
		
	}

	public CarRental(Date start, Date finish, Vehicle veihicle) {
		this.start = start;
		this.finish = finish;
		this.veihicle = veihicle;
	}

	public Date getStart() {
		return start;
	}

	public void setStart(Date start) {
		this.start = start;
	}

	public Date getFinish() {
		return finish;
	}

	public void setFinish(Date finish) {
		this.finish = finish;
	}

	public Vehicle getVeihicle() {
		return veihicle;
	}

	public void setVeihicle(Vehicle veihicle) {
		this.veihicle = veihicle;
	}

	public Invoice getInvoice() {
		return invoice;
	}

	public void setInvoice(Invoice invoice) {
		this.invoice = invoice;
	}
	
	
	
}
