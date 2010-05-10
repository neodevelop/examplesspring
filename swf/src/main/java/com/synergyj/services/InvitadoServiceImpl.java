package com.synergyj.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.synergyj.model.Invitado;

@Service("invitadoService")
public class InvitadoServiceImpl implements InvitadoService {
	
	static List<Invitado> invitados;

	public Invitado agregaInvitado(Invitado invitado) {
		if(invitados == null){
			limpia();
		}
		invitados.add(invitado);
		System.out.println("Se ha agregado un invitado...");
		System.out.println("El tama–o de la lista es: "+invitados.size());
		return new Invitado();
	}

	public List<Invitado> getInvitados() {
		return invitados;
	}

	public void limpia() {
		invitados = new ArrayList<Invitado>();
	}

}
