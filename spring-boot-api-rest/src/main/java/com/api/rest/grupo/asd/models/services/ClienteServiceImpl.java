package com.api.rest.grupo.asd.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.api.rest.grupo.asd.models.dao.IClienteDao;
import com.api.rest.grupo.asd.models.entity.Cliente;

@Service
public class ClienteServiceImpl implements IClienteService{
	
	@Autowired
	public IClienteDao clienteDao;
	@Override
	@Transactional(readOnly=true)
	public List<Cliente> findAll() {
		// TODO Auto-generated method stub
		return (List<Cliente>) clienteDao.findAll();
	}
	@Override
	@Transactional(readOnly=true)
	public Cliente findbyId(Long id) {
		// TODO Auto-generated method stub
		return clienteDao.findById(id).orElse(null);
	}
	@Override
	@Transactional
	public Cliente save(Cliente cliente) {
		// TODO Auto-generated method stub
		return clienteDao.save(cliente);
	}
	@Override
	@Transactional
	public void delete(long id) {
		// TODO Auto-generated method stub
		clienteDao.deleteById(id);	
	}

}
