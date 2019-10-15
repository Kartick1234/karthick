package com.custapp.model.persistance;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "customer_table_hib1")
public class Customer {
	@Id
	@GeneratedValue
	private int id;
	@NotEmpty(message="name cant left blank")
	private String name;
	
	@NotEmpty(message="title cant left blank")
	private String title;
	
	@NotEmpty(message="marital_status cant left blank")
	private String marital_status;
	
	
	@Email
	@NotEmpty(message="email cant left blank")
	private String email;
	
	private int phone;

	public Customer() {
		super();
		
	}

	public Customer(String name, String title, String marital_status, String email, int phone) {
		super();
		this.name = name;
		this.title = title;
		this.marital_status = marital_status;
		this.email = email;
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", title=" + title + ", marital_status=" + marital_status
				+ ", email=" + email + ", phone=" + phone + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getMarital_status() {
		return marital_status;
	}

	public void setMarital_status(String marital_status) {
		this.marital_status = marital_status;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getPhone() {
		return phone;
	}

	public void setPhone(int phone) {
		this.phone = phone;
	}
	
}


	
	
	
	
