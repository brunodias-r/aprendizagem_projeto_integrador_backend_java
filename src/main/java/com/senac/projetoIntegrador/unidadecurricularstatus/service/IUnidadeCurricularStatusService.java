package com.senac.projetoIntegrador.unidadecurricularstatus.service;

import java.util.List;

import com.senac.projetoIntegrador.unidadecurricularstatus.dto.UnidadeCurricularStatusDto;

public interface IUnidadeCurricularStatusService {
 public List<UnidadeCurricularStatusDto> getUnidadesCuricularesPorUsuario(String usuarioId);
}
