package com.senac.projetoIntegrador.unidadecurricularstatus.dto;

import com.senac.projetoIntegrador.unidadecurricularstatus.dto.enums.StatusUnidadeCurricular;

public class UnidadeCurricularStatusDto {
 private Long id;
 private int modulo;
 private String nome;
 private int cargaHoraria;
 private StatusUnidadeCurricular status;

 public Long getId(long l) {
  return id;
 }

 public void setId(Long id) {
  this.id = id;
 }

 public int getModulo() {
  return modulo;
 }

 public void setModulo(int modulo) {
  this.modulo = modulo;
 }

 public String getNome(String string) {
  return nome;
 }

 public void setNome(String nome) {
  this.nome = nome;
 }

 public int getCargaHoraria(String string) {
  return cargaHoraria;
 }

 public void setCargaHoraria(int cargaHoraria) {
  this.cargaHoraria = cargaHoraria;
 }

 public StatusUnidadeCurricular getStatus(String string) {
  return status;
 }

 public void setStatus(StatusUnidadeCurricular status) {
  this.status = status;
 }

}
