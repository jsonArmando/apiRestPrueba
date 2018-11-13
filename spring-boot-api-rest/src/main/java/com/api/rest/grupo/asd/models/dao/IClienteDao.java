package com.api.rest.grupo.asd.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.api.rest.grupo.asd.models.entity.Cliente;

/**
 * @author json
 * Interface IClienteDao
 */
public interface IClienteDao extends CrudRepository<Cliente, Long>{

}
