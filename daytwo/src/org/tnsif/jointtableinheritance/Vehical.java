package org.tnsif.jointtableinheritance;
//parent class
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table(name="vehical")
@Inheritance(strategy=InheritanceType.JOINED)
public class Vehical {
	@Id
	private int vehicleno;
	private int speed;
	private String type;
	private int price;
	
	
	public int getVehicleno() {
		return vehicleno;
	}
	public void setVehicleno(int vehicleno) {
		this.vehicleno = vehicleno;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	

}
