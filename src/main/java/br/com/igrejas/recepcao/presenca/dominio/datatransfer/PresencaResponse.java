package br.com.igrejas.recepcao.presenca.dominio.datatransfer;

import java.time.LocalDateTime;

import br.com.igrejas.recepcao.presenca.dominio.entity.PresencaEntity;

public record PresencaResponse (Long id, Long usuarioId,LocalDateTime dataPresenca, Long filhoId)
{
	
	public static PresencaEntity toEntity(Long id, Long usuarioId,	 LocalDateTime dataPresenca, Long filhoId) {
		return new PresencaEntity(id,usuarioId,dataPresenca,filhoId);
	}
}
	

