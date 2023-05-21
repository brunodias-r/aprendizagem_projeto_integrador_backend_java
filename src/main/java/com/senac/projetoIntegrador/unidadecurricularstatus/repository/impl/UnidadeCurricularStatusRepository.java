package com.senac.projetoIntegrador.unidadecurricularstatus.repository.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.senac.projetoIntegrador.unidadecurricularstatus.dto.UnidadeCurricularStatusDto;
import com.senac.projetoIntegrador.unidadecurricularstatus.repository.IUnidadeCurricularStatusRepository;

@Repository
public class UnidadeCurricularStatusRepository implements IUnidadeCurricularStatusRepository {
  private JdbcTemplate dbConnection;

  @Autowired
  QueriesUnidadeCurricularStatus queries;

  private class UnidadeCurricularMapper implements RowMapper<UnidadeCurricularStatusDto> {
    @Override
    public UnidadeCurricularStatusDto mapRow(ResultSet rs, int rowNum) throws SQLException {
      UnidadeCurricularStatusDto unidadeCurricularDto = new UnidadeCurricularStatusDto();
      unidadeCurricularDto.getId(rs.getLong("unidade_curricular_id"));
      unidadeCurricularDto.getNome(rs.getString("unidade_curricular_nome"));
      unidadeCurricularDto.getCargaHoraria(rs.getString("unidade_curricular_carga_horaria"));
      unidadeCurricularDto.getStatus(rs.getString("unidade_curricular_status"));
      return unidadeCurricularDto;
    }
  }

  @Override
  public List<UnidadeCurricularStatusDto> getUnidadesCurricularesPorUsuario(String usuarioId) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'getUnidadesCurricularesPorUsuario'");
  }

  public List<UnidadeCurricularStatusDto> listaUnidadesCurricularesPorUsuario(String usuarioId) throws SQLException {
    return dbConnection.query(queries.getUnidadesCurricularesByUsuarioId(), new UnidadeCurricularMapper(),
        new Object[] { usuarioId });
  }

  @Autowired
  private void dbConnection(@Qualifier("dbConnection") DataSource dbConn) {
    this.dbConnection = new JdbcTemplate(dbConn);
  }

}
