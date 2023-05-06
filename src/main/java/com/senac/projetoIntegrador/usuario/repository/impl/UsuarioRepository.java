package com.senac.projetoIntegrador.usuario.repository.impl;

import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.senac.projetoIntegrador.usuario.dto.UsuarioDto;
import com.senac.projetoIntegrador.usuario.repository.IUsuarioRepository;

@Repository
public class UsuarioRepository implements IUsuarioRepository{
	
	private JdbcTemplate dbConnection;
	
	@Autowired
	QueriesUsuario queries;
	
	private class UsuarioMapper implements RowMapper<UsuarioDto> {
		@Override
		public UsuarioDto mapRow(ResultSet rs, int rowNum) throws SQLException {
			UsuarioDto usuarioDto = new UsuarioDto();
			usuarioDto.setId(rs.getString("Id"));
			usuarioDto.setCpf(rs.getString("usuario_cpf"));
			usuarioDto.setNome(rs.getString("usuario_nome_completo"));
			usuarioDto.setApelido(rs.getString("usuario_apelido"));
			usuarioDto.setEmail(rs.getString("usuario_email"));
			usuarioDto.setDataNascimento(rs.getTimestamp("usuario_data_nascimento"));
			usuarioDto.setTelefone(rs.getString("usuario_telefone"));
			usuarioDto.setDataCadastro(rs.getTimestamp("usuario_data_cadastro"));
			//usuarioDto.setFoto(rs.getBlob("usuario_foto"));
			usuarioDto.setStatus(rs.getInt("usuario_status"));
			return usuarioDto;
		}
	}
	
	@Autowired
	private void dbConnection(@Qualifier("dbConnection") DataSource dbConn) {
		this.dbConnection = new JdbcTemplate(dbConn);
	}
	
	public UsuarioDto getUsuarioById(String id) {
		return dbConnection.queryForObject(queries.getGetUsuarioById(), new UsuarioMapper(), new Object[] {id});
	}
}
