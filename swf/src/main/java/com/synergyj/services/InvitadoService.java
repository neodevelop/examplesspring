package com.synergyj.services;

import java.util.List;

import com.synergyj.model.Invitado;

public interface InvitadoService {
	Invitado agregaInvitado(Invitado invitado);
	List<Invitado> getInvitados();
	void limpia();
}
