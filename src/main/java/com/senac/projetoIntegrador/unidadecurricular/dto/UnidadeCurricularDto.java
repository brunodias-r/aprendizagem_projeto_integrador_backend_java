package com.senac.projetoIntegrador.unidadecurricular.dto;

public class UnidadeCurricularDto {
 private Long id;
 private int modulo;
 private String nome;
 private int cargaHoraria;
 private Boolean concluida;
 private Boolean trancada;
 private Boolean cursando;
 private Boolean pendente;

 public Long getId() {
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

 public String getNome() {
  return nome;
 }

 public void setNome(String nome) {
  this.nome = nome;
 }

 public int getCargaHoraria() {
  return cargaHoraria;
 }

 public void setCargaHoraria(int cargaHoraria) {
  this.cargaHoraria = cargaHoraria;
 }

 public Boolean isConcluida() {
  return concluida;
 }

 public void setConcluida(Boolean concluida) {
  this.concluida = concluida;
 }

 public Boolean isTrancada() {
  return trancada;
 }

 public void setTrancada(Boolean trancada) {
  this.trancada = trancada;
 }

 public Boolean isCursando() {
  return cursando;
 }

 public void setCursando(Boolean cursando) {
  this.cursando = cursando;
 }

 public Boolean isPendente() {
  return pendente;
 }

 public void setPendente(Boolean pendente) {
  this.pendente = pendente;
 }

}
