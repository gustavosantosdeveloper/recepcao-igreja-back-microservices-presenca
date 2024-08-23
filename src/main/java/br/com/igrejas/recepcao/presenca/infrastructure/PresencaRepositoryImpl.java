package br.com.igrejas.recepcao.presenca.infrastructure;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.igrejas.recepcao.presenca.dominio.entity.PresencaEntity;
import br.com.igrejas.recepcao.presenca.dominio.port.repository.PresencaRepository;

@Service
public class PresencaRepositoryImpl implements PresencaRepository {

	@Autowired
	private PresencaRepositoryPostgresSql repository;
	
	@Override
	public void marcarPresenca(PresencaEntity entity) {
		repository.save(entity);
	}

}
