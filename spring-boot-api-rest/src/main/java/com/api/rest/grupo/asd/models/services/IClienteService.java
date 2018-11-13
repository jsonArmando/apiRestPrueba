package com.api.rest.grupo.asd.models.services;

import java.util.List;

import com.api.rest.grupo.asd.models.entity.Cliente;

public interface IClienteService {
	public Cliente findbyId(Long id);
	public List<Cliente> findAll();
	public Cliente save(Cliente cliente);
	public void delete (long id);
	
}
