package org.tnsif.jointtableinheritance;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="car")
public class car extends Vehical{
	
	private String brandname;

	public String getBrandname() {
		return brandname;
	}

	public void setBrandname(String brandname) {
		this.brandname = brandname;
	}
	
	
}
