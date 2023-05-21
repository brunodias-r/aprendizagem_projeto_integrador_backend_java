package com.senac.projetoIntegrador.unidadecurricularstatus.repository;

import java.util.List;

import com.senac.projetoIntegrador.unidadecurricularstatus.dto.UnidadeCurricularStatusDto;

public interface IUnidadeCurricularStatusRepository {
 public List<UnidadeCurricularStatusDto> getUnidadesCurricularesPorUsuario(String usuarioId);
}