package org.tnsif.tableperclassinheritance;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="Person")
public class person {
	private String name;
	private long contactno;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getContactno() {
		return contactno;
	}
	public void setContactno(long contactno) {
		this.contactno = contactno;
	}

}
