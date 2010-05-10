package com.synergyj.services;

import java.util.List;

import com.synergyj.model.Invitado;
import com.synergyj.model.Reunion;

public interface ReunionService {
	void doAccion(Reunion reunion);
	Reunion creaReunion(Reunion reunion,List<Invitado> invitados);
}
