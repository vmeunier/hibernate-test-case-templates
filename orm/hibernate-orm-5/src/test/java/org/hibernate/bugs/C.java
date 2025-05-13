package org.hibernate.bugs;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "C")
public class C {

    @Id
    @Column(name = "ID")
    private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

    
}
