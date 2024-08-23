package br.com.igrejas.recepcao.presenca.dominio.port.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.igrejas.recepcao.presenca.dominio.datatransfer.PresencaRequest;
import br.com.igrejas.recepcao.presenca.dominio.datatransfer.PresencaResponse;
import br.com.igrejas.recepcao.presenca.dominio.port.repository.PresencaRepository;
import jakarta.transaction.Transactional;
import jakarta.transaction.Transactional.TxType;

@Service
public class PresencaServiceImpl implements PresencaService {

	@Autowired
	private PresencaRepository repositoy;
	
	@Override
	@Transactional(value = TxType.REQUIRED)
	public void marcarPresenca(PresencaRequest presencaDTO) {
		presencaDTO.filhos().stream().forEach(id ->{
			repositoy.marcarPresenca(PresencaResponse.toEntity(null, presencaDTO.usuarioId(), presencaDTO.dataPresenca(),id));
		});	
	}

}	