package br.com.igrejas.recepcao.presenca.dominio.port.repository;

import br.com.igrejas.recepcao.presenca.dominio.entity.PresencaEntity;

public interface PresencaRepository {

	public void marcarPresenca(PresencaEntity entiry);
}
