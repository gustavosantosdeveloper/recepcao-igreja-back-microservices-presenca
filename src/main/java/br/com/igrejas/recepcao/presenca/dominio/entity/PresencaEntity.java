package br.com.igrejas.recepcao.presenca.dominio.entity;

import java.time.LocalDateTime;

import br.com.igrejas.recepcao.presenca.dominio.datatransfer.PresencaResponse;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name="usuario_filhos_presenca")
@AllArgsConstructor
@NoArgsConstructor
public class PresencaEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private Long usuarioId;
	private LocalDateTime dataPresenca;
	private Long filhoId;

	public PresencaResponse toDto(Long id,Long usuarioId,LocalDateTime dataPresenca,Long filhoId) {
		return new PresencaResponse(id,usuarioId,dataPresenca,filhoId);
	}
	
}
