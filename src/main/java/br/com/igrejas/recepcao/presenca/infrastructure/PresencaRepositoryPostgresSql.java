package br.com.igrejas.recepcao.presenca.infrastructure;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.igrejas.recepcao.presenca.dominio.entity.PresencaEntity;

@Repository
public interface PresencaRepositoryPostgresSql extends CrudRepository<PresencaEntity, Long> {
	
}
