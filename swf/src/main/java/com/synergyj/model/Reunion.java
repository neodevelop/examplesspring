package com.synergyj.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class Reunion implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String nombreDelEvento;
	private Boolean isActive;
	private Boolean isFull;
	private Date fechaRealizacion;
	private List<Invitado> invitados;
	public List<Invitado> getInvitados() {
		return invitados;
	}
	public void setInvitados(List<Invitado> invitados) {
		this.invitados = invitados;
	}
	public String getNombreDelEvento() {
		return nombreDelEvento;
	}
	public void setNombreDelEvento(String nombreDelEvento) {
		this.nombreDelEvento = nombreDelEvento;
	}
	public Boolean getIsActive() {
		return isActive;
	}
	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}
	public Boolean getIsFull() {
		return isFull;
	}
	public void setIsFull(Boolean isFull) {
		this.isFull = isFull;
	}
	public Date getFechaRealizacion() {
		return fechaRealizacion;
	}
	public void setFechaRealizacion(Date fechaRealizacion) {
		this.fechaRealizacion = fechaRealizacion;
	}
	
	
}
