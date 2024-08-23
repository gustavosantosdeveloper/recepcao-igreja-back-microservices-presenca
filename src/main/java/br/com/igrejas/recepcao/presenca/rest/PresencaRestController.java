package br.com.igrejas.recepcao.presenca.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.igrejas.recepcao.presenca.dominio.datatransfer.PresencaRequest;
import br.com.igrejas.recepcao.presenca.dominio.port.service.PresencaService;

@RestController
@RequestMapping("/api/v1/usuario-presenca")
@CrossOrigin("*")
public class PresencaRestController {
	
	@Autowired
	private PresencaService service;
	
	@PostMapping
	public void marcarPresenca(@RequestBody PresencaRequest dto) {
		service.marcarPresenca(dto);
	}
	
}
