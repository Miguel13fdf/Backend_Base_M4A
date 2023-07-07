package com.tec.azuay.models.entity.services;

import java.util.List;

import com.tec.azuay.models.entity.Administrador;


public interface IAdministradorService {

	public List<Administrador> ListAll();
	
	public Administrador saveAdministrador(Administrador administrador);
	
	public Administrador findAdministradorById(Long id_adm);
	
	public void DeleteAdministradorById(Long id_adm);
	
}
