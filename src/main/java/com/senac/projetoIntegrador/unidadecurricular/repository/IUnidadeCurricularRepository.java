package com.senac.projetoIntegrador.unidadecurricular.repository;

import java.util.List;

import com.senac.projetoIntegrador.unidadecurricular.dto.UnidadeCurricularDto;

public interface IUnidadeCurricularRepository {
 public List<UnidadeCurricularDto> getUnidadesCurricularesPorUsuario(String usuarioId);
}