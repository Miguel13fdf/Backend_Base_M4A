package com.tec.azuay.models.entity.services;

import java.util.List;

import com.tec.azuay.models.entity.Historial;

public interface IHistorialService {

	public List<Historial> ListAll();
	
	public Historial saveHistorial(Historial historial);
	
	public Historial findHistorialById(Long id_his);
	
	public void DeleteHistorialById(Long id_his);
	
}
