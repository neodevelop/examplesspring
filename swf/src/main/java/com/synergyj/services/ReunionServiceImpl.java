package com.synergyj.services;

import java.util.Date;
import java.util.List;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.springframework.stereotype.Service;

import com.synergyj.model.Invitado;
import com.synergyj.model.Reunion;

@Service("reunionService")
public class ReunionServiceImpl implements ReunionService {

	public void doAccion(Reunion reunion) {
		reunion.setFechaRealizacion(new Date());
		System.out.println(ToStringBuilder.reflectionToString(reunion));
	}

	public Reunion creaReunion(Reunion reunion,List<Invitado> invitados) {
		reunion.setInvitados(invitados);
		System.out.println(ToStringBuilder.reflectionToString(reunion));
		return reunion;
	}

}
