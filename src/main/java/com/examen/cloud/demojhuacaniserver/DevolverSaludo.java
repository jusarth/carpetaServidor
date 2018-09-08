package com.examen.cloud.demojhuacaniserver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/rest/saludo/server/{nombre}")
public class DevolverSaludo {
	
	
	@GetMapping
	public String usuario(@PathVariable("nombre") String nombre) {
		String saludo="Hola, como estas : " + nombre;
		
		return saludo;
	}
}
