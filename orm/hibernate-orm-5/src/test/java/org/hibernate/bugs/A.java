package org.hibernate.bugs;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.LazyToOne;
import org.hibernate.annotations.LazyToOneOption;

@Entity
@Table(name = "A")
public class A {

    @Id
    @Column(name = "ID")
    private int id;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID")
    @LazyToOne(LazyToOneOption.NO_PROXY)
    private B b;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID")
    @LazyToOne(LazyToOneOption.NO_PROXY)
    private C c;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID")
    @LazyToOne(LazyToOneOption.NO_PROXY)
    private D d;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public B getB() {
		return b;
	}

	public void setB(B b) {
		this.b = b;
	}

	public C getC() {
		return c;
	}

	public void setC(C c) {
		this.c = c;
	}

	public D getD() {
		return d;
	}

	public void setD(D d) {
		this.d = d;
	}
    
    

}
