package com.senac.projetoIntegrador.unidadecurricular.dto;

public class UnidadeCurricularDto {
 private Long id;
 private int modulo;
 private String nome;
 private int cargaHoraria;
 private Boolean concluida;
 private Boolean cursando;
 private Boolean pendente;
 private Boolean trancada;

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

 public Boolean isConcluida(boolean b) {
  return concluida;
 }

 public void setConcluida(Boolean concluida) {
  this.concluida = concluida;
 }

 public Boolean isCursando(boolean b) {
  return cursando;
 }

 public void setCursando(Boolean cursando) {
  this.cursando = cursando;
 }

 public Boolean isPendente(boolean b) {
  return pendente;
 }

 public void setPendente(Boolean pendente) {
  this.pendente = pendente;
 }

 public Boolean isTrancada(boolean b) {
  return trancada;
 }

 public void setTrancada(Boolean trancada) {
  this.trancada = trancada;
 }

}
