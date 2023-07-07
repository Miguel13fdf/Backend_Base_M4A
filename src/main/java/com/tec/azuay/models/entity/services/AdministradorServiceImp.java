package com.tec.azuay.models.entity.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tec.azuay.models.dao.IAdministradorDao;
import com.tec.azuay.models.entity.Administrador;

@Service
public class AdministradorServiceImp implements IAdministradorService {

	@Autowired
	private IAdministradorDao adminDao;
	
	@Override
	public List<Administrador> ListAll() {
		return (List<Administrador>) adminDao.findAll();
	}

	@Override
	public Administrador saveAdministrador(Administrador administrador) {
		return adminDao.save(administrador);
	}

	@Override
	public Administrador findAdministradorById(Long id_adm) {
		return adminDao.findById(id_adm).orElse(new Administrador());
	}

	@Override
	public void DeleteAdministradorById(Long id_adm) {
		adminDao.deleteById(id_adm);
	}
	
}
