package org.tnsif.unidirectional;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="customer")
public class customer {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int custid;
	private String name;
	
	@OneToOne(cascade=CascadeType.ALL)
	private Address address;

	public customer() {
		System.out.println("One to One -Unidirectional");
	}

	public customer(int custid, String name, Address address) {
		super();
		this.custid = custid;
		this.name = name;
		this.address = address;
	}

	public int getCustid() {
		return custid;
	}

	public void setCustid(int custid) {
		this.custid = custid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "customer [custid=" + custid + ", name=" + name + ", address=" + address + "]";
	}
	
	
	

}
