package br.com.igrejas.recepcao.presenca.dominio.port.service;

import br.com.igrejas.recepcao.presenca.dominio.datatransfer.PresencaRequest;

public interface PresencaService {

	public void marcarPresenca(PresencaRequest dto);
	
}
