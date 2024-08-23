package br.com.igrejas.recepcao.presenca.dominio.datatransfer;

import java.time.LocalDateTime;
import java.util.List;

public record PresencaRequest(Long id, Long usuarioId,LocalDateTime dataPresenca, List<Long> filhos)
{
	
	
}
	

