package com.senac.projetoIntegrador.unidadecurricular.repository.impl;

import java.sql.ResultSet;
import java.sql.SQLClientInfoException;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.senac.projetoIntegrador.unidadecurricular.dto.UnidadeCurricularDto;
import com.senac.projetoIntegrador.unidadecurricular.repository.IUnidadeCurricularRepository;

@Repository
public class UnidadeCurricularRepository implements IUnidadeCurricularRepository {
 private JdbcTemplate dbConnection;

 @Autowired
 QueriesUnidadeCurricular queries;

 private class UnidadeCurricularMapper implements RowMapper<UnidadeCurricularDto> {
  @Override
  public UnidadeCurricularDto mapRow(ResultSet rs, int rowNum) throws SQLException {
   UnidadeCurricularDto unidadeCurricularDto = new UnidadeCurricularDto();
   unidadeCurricularDto.getId(rs.getLong("unidade_curricular_id"));
   unidadeCurricularDto.getNome(rs.getString("unidade_curricular_nome"));
   unidadeCurricularDto.getCargaHoraria(rs.getString("unidade_curricular_carga_horaria"));
   unidadeCurricularDto.isConcluida(rs.getBoolean("unidade_curricular_concluida"));
   unidadeCurricularDto.isCursando(rs.getBoolean("unidade_curricular_cursando"));
   unidadeCurricularDto.isPendente(rs.getBoolean("unidade_curricular_pendente"));
   unidadeCurricularDto.isTrancada(rs.getBoolean("unidade_curricular_trancada"));
   return unidadeCurricularDto;
  }
 }

 @Override
 public List<UnidadeCurricularDto> getUnidadesCurricularesPorUsuario(String usuarioId) {
  // TODO Auto-generated method stub
  throw new UnsupportedOperationException("Unimplemented method 'getUnidadesCurricularesPorUsuario'");
 }

 public List<UnidadeCurricularDto> listaUnidadesCurricularesPorUsuario(String usuarioId) throws SQLException {
  return dbConnection.query(queries.getUnidadesCurricularesByUsuarioId(), new UnidadeCurricularMapper(),
    new Object[] { usuarioId });
 }

 @Autowired
 private void dbConnection(@Qualifier("dbConnection") DataSource dbConn) {
  this.dbConnection = new JdbcTemplate(dbConn);
 }

}
