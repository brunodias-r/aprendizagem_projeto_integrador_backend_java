package com.senac.projetoIntegrador.unidadecurricular.repository.impl;

import org.springframework.context.annotation.Configuration;

@Configuration
public class QueriesUnidadeCurricular {
   private String getUnidadesCurricularesPorModulo = """
         SELECT
         unidade_curricular_nome,
         unidade_curricular_cargaHoraria,
         unidade_curricular_concluida,
         unidade_curricular_trancada,
         unidade_curricular_cursando,
         unidade_curricular_pendente,
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
