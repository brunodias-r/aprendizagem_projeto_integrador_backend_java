package com.senac.projetoIntegrador.unidadecurricular.service;

import java.util.List;

import com.senac.projetoIntegrador.unidadecurricular.dto.UnidadeCurricularDto;

public interface IUnidadeCurricularService {
 public List<UnidadeCurricularDto> getUnidadesCuricularesPorUsuario(String usuarioId);
}
