package fr.model;

import java.text.DateFormat;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Performance {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@Column(name = "service", length = 50, nullable = false, unique = true)
	private String service;
	@Column(name = "date", length = 100, nullable = false)
	private DateFormat date;
	@Column(name = "temps", length = 50, nullable = false)
	private Double tempsExecution;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getService() {
		return service;
	}

	public void setService(String service) {
		this.service = service;
	}

	public DateFormat getDate() {
		return date;
	}

	public void setDate(DateFormat date) {
		this.date = date;
	}

	public Double getTempsExecution() {
		return tempsExecution;
	}

	public void setTempsExecution(Double tempsExecution) {
		this.tempsExecution = tempsExecution;
	}

}
