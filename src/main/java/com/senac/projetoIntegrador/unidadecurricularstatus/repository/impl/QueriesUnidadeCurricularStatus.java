package com.senac.projetoIntegrador.unidadecurricularstatus.repository.impl;

import org.springframework.context.annotation.Configuration;

@Configuration
public class QueriesUnidadeCurricularStatus {
   private String getUnidadesCurricularesPorModulo = """
         SELECT
         unidade_curricular_nome,
         unidade_curricular_cargaHoraria,
         unidade_curricular_status,
         FROM unidade_curricular uc
         JOIN participante p ON ac.participante_id = p.participante_id
         JOIN estudante e ON p.estudante_id = e.estudante_id
         WHERE e.usuario_id = ?
         ORDER BY uc.unidade_curricular_modulo
         """;

   public String getUnidadesCurricularesByUsuarioId() {
      return getUnidadesCurricularesPorModulo;
   }
}
