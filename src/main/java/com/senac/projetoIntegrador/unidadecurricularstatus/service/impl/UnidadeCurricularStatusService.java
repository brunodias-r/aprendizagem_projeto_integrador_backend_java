package com.senac.projetoIntegrador.unidadecurricularstatus.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.senac.projetoIntegrador.unidadecurricularstatus.dto.UnidadeCurricularStatusDto;
import com.senac.projetoIntegrador.unidadecurricularstatus.repository.IUnidadeCurricularStatusRepository;
import com.senac.projetoIntegrador.unidadecurricularstatus.service.IUnidadeCurricularStatusService;

@Service
public class UnidadeCurricularStatusService implements IUnidadeCurricularStatusService {

 @Autowired
 private IUnidadeCurricularStatusRepository iUnidadeCurricularRepository;

 public List<UnidadeCurricularStatusDto> getUnidadesCurriclaresPorUsuario(String usuarioId) {
  return iUnidadeCurricularRepository.getUnidadesCurricularesPorUsuario(usuarioId);
 }

 @Override
 public List<UnidadeCurricularStatusDto> getUnidadesCuricularesPorUsuario(String usuarioId) {
  // TODO Auto-generated method stub
  throw new UnsupportedOperationException("Unimplemented method 'getUnidadesCuricularesPorUsuario'");
 }

}
