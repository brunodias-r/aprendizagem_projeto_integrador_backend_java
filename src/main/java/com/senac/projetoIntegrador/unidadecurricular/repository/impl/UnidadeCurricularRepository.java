package com.senac.projetoIntegrador.unidadecurricular.repository.impl;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.senac.projetoIntegrador.unidadecurricular.dto.UnidadeCurricularDto;
import com.senac.projetoIntegrador.unidadecurricular.repository.IUnidadeCurricularRepository;

@Repository
public class UnidadeCurricularRepository implements IUnidadeCurricularRepository {
 private JdbcTemplate dbConnection;

 @Override
 public List<UnidadeCurricularDto> getUnidadesCurricularesPorUsuario(String usuarioId) {
  // TODO Auto-generated method stub
  throw new UnsupportedOperationException("Unimplemented method 'getUnidadesCurricularesPorUsuario'");
 }

}
