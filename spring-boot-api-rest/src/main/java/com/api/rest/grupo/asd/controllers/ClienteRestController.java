package com.api.rest.grupo.asd.controllers;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.api.rest.grupo.asd.models.entity.Cliente;
import com.api.rest.grupo.asd.models.services.IClienteService;

/**
 * @author json
 * Controlador principal donde se encuentra los métodos de guardar, actualizar, buscar
 * y listar los resultados
 */
@CrossOrigin(origins = { "http://localhost:4200" })
@RestController
@RequestMapping("/api")


public class ClienteRestController {

	@Autowired
	private IClienteService clienteService;
	
	/**
	 * Método que permite listar los registros que se han realizado en la API REST
	 */

	@GetMapping("/clientes")
	public List<Cliente> index() {
		return clienteService.findAll();
	}
	
	/**
	 * Método que permite listar los registros que se han realizado en la API REST,
	 * realiza dicho procedimiento con la variable ID
	 */

	@GetMapping("/clientes/{id}")
	@ResponseStatus(HttpStatus.OK)
	public Cliente show(@PathVariable Long id) {
		return clienteService.findbyId(id);
	}
	
	/**
	 * Método que crea un nuevo Activo Fijo de la Api Rest 
	 */

	@PostMapping("/clientes")
	@ResponseStatus(HttpStatus.CREATED)
	public Cliente create(@RequestBody Cliente cliente) {
		cliente.setFecCom(new Date());
		this.clienteService.save(cliente);
		return cliente;
	}

	
/*	@PostMapping("/clientes")
	
	public ResponseEntity<Void> create(){
		Cliente clienteActual = new Cliente();
		clienteActual.setDesNom(clienteActual.getDesNom());
		clienteActual.setDescrip(clienteActual.getDescrip());
		clienteActual.setTipo(clienteActual.getTipo());
		clienteActual.setSerial(clienteActual.getSerial());
		clienteActual.setNumInt(clienteActual.getNumInt());
		clienteActual.setPeso(clienteActual.getPeso());
		clienteActual.setLargo(clienteActual.getLargo());
		clienteActual.setAncho(clienteActual.getAncho());
		clienteActual.setValCom(clienteActual.getValCom());
		clienteActual.setFecBaj(clienteActual.getFecBaj());
		clienteActual.setFecCom(cliente.getFecCom());
		clienteActual.setEstAct(clienteActual.getEstAct());
		clienteActual.setColor(clienteActual.getColor());
		clienteActual.setAsigna(clienteActual.getAsigna());
		clienteService.save(clienteActual);
		return new ResponseEntity<>(HttpStatus.CREATED);
	}
	*/
	
	/**
	 *Método que realiza la actualización de un Activo Fijo creado 
	 */
	@PutMapping("/clientes/{id}")
	@ResponseStatus(HttpStatus.CREATED)
	public Cliente update(@RequestBody Cliente cliente, @PathVariable Long id) {
		Cliente clienteActual = this.clienteService.findbyId(id);
		clienteActual.setDesNom(cliente.getDesNom());
		clienteActual.setDescrip(cliente.getDescrip());
		clienteActual.setTipo(cliente.getTipo());
		clienteActual.setSerial(cliente.getSerial());
		clienteActual.setNumInt(cliente.getNumInt());
		clienteActual.setPeso(cliente.getPeso());
		clienteActual.setLargo(cliente.getLargo());
		clienteActual.setAncho(cliente.getAncho());
		clienteActual.setValCom(cliente.getValCom());
		clienteActual.setFecBaj(cliente.getFecBaj());
		/*		clienteActual.setFecCom(cliente.getFecCom());*/
		clienteActual.setEstAct(cliente.getEstAct());
		clienteActual.setColor(cliente.getColor());
		clienteActual.setAsigna(cliente.getAsigna());
		this.clienteService.save(clienteActual);
		return clienteActual;
	}
	
	/**
	 *Método que permite la eliminación de un registro en la Api Rest 
	 */

	@DeleteMapping("/clientes/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Long id) {
		clienteService.delete(id);
	}

}
