package org.tnsif.singletableinheritance;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("MNG")
//child class
public class Manager extends Employee {
	private String  depname;

	public String getDepname() {
		return depname;
	}

	public void setDepname(String depname) {
		this.depname = depname;
	}
	
}
