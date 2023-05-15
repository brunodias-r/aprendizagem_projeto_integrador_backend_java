package com.senac.projetoIntegrador.unidadecurricular.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.senac.projetoIntegrador.unidadecurricular.dto.UnidadeCurricularDto;
import com.senac.projetoIntegrador.unidadecurricular.repository.IUnidadeCurricularRepository;
import com.senac.projetoIntegrador.unidadecurricular.service.IUnidadeCurricularService;

@Service
public class UnidadeCurricularService implements IUnidadeCurricularService {

 @Autowired
 private IUnidadeCurricularRepository iUnidadeCurricularRepository;

 public List<UnidadeCurricularDto> getUnidadesCurriclaresPorUsuario(String usuarioId) {
  return iUnidadeCurricularRepository.getUnidadesCurricularesPorUsuario(usuarioId);
 }

 @Override
 public List<UnidadeCurricularDto> getUnidadesCuricularesPorUsuario(String usuarioId) {
  // TODO Auto-generated method stub
  throw new UnsupportedOperationException("Unimplemented method 'getUnidadesCuricularesPorUsuario'");
 }

}
