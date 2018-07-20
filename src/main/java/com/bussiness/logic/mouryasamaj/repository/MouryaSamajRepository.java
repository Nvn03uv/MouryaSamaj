package com.bussiness.logic.mouryasamaj.repository;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Repository;

@Repository
@Entity
@Table(name = "mourya_samaj_hello")
public class MouryaSamajRepository {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;

	private String message;

	public Integer getId() {
		return id;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "MouryaSamajRepository [id=" + id + ", message=" + message + "]";
	}

}
