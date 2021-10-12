package com.pruebaBdB.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "person")
public class Person {
	
	@Column(name = "full_name")
	private String fullname;
	
	@Column
	private Date birth;
	
	@Id
	@Column
	private String identification;
	
	@Column(name="dad_identification")
	private String dadIdentification;
	
	@Column(name="mom_identification")
	private String momIdentification;

	public Person() {
		
	}

	public String getFullname() {
		return fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	public Date getBirth() {
		return birth;
	}

	public void setBirth(Date birth) {
		this.birth = birth;
	}

	public String getIdentification() {
		return identification;
	}

	public void setIdentification(String identification) {
		this.identification = identification;
	}

	public String getDadIdentification() {
		return dadIdentification;
	}

	public void setDadIdentification(String dadIdentification) {
		this.dadIdentification = dadIdentification;
	}

	public String getMomIdentification() {
		return momIdentification;
	}

	public void setMomIdentification(String momIdentification) {
		this.momIdentification = momIdentification;
	}
	
}
