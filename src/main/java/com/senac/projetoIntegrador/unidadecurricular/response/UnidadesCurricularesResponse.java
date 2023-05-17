package com.senac.projetoIntegrador.unidadecurricular.response;

public class UnidadesCurricularesResponse {
 private int listaModulo;
 private String listaNome;
 private int listaCargaHoraria;
 private Boolean listaConcluida;
 private Boolean listaCursando;
 private Boolean listaPendente;
 private Boolean listaTrancada;

 UnidadesCurricularesResponse(int listaModulo, String listaNome, int listaCargaHoraria, Boolean listaConcluida,
   Boolean listaCursando, Boolean listaPendente, Boolean listaTrancada) {
  super();
  this.listaModulo = listaModulo;
  this.listaNome = listaNome;
  this.listaCargaHoraria = listaCargaHoraria;
  this.listaConcluida = listaConcluida;
  this.listaCursando = listaCursando;
  this.listaPendente = listaPendente;
  this.listaTrancada = listaTrancada;
 }

 public int getListaModulo() {
  return listaModulo;
 }

 public void setListaModulo(int listaModulo) {
  this.listaModulo = listaModulo;
 }

 public String getListaNome() {
  return listaNome;
 }

 public void setListaNome(String listaNome) {
  this.listaNome = listaNome;
 }

 public int getListaCargaHoraria() {
  return listaCargaHoraria;
 }

 public void setListaCargaHoraria(int listaCargaHoraria) {
  this.listaCargaHoraria = listaCargaHoraria;
 }

 public Boolean isListaConcluida() {
  return listaConcluida;
 }

 public void setListaConcluida(Boolean listaConcluida) {
  this.listaConcluida = listaConcluida;
 }

 public Boolean isListaCursando() {
  return listaCursando;
 }

 public void setListaCursando(Boolean listaCursando) {
  this.listaCursando = listaCursando;
 }

 public Boolean isListaPendente() {
  return listaPendente;
 }

 public void setListaPendente(Boolean listaPendente) {
  this.listaPendente = listaPendente;
 }

 public Boolean isListaTrancada() {
  return listaTrancada;
 }

 public void setListaTrancada(Boolean listaTrancada) {
  this.listaTrancada = listaTrancada;
 }

}
