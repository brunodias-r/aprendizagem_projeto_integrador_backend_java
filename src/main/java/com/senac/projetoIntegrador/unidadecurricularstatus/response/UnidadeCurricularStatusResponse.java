package com.senac.projetoIntegrador.unidadecurricularstatus.response;

import com.senac.projetoIntegrador.unidadecurricularstatus.dto.enums.StatusUnidadeCurricular;

public class UnidadeCurricularStatusResponse {
  private int listaModulo;
  private String listaNome;
  private int listaCargaHoraria;
  private StatusUnidadeCurricular listaStatus;

  UnidadeCurricularStatusResponse(int listaModulo, String listaNome, int listaCargaHoraria,
      StatusUnidadeCurricular listaStatus) {
    super();
    this.listaModulo = listaModulo;
    this.listaNome = listaNome;
    this.listaCargaHoraria = listaCargaHoraria;
    this.listaStatus = listaStatus;
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

  public StatusUnidadeCurricular isListaStatus() {
    return listaStatus;
  }

  public void setListaStatus(StatusUnidadeCurricular listaStatus) {
    this.listaStatus = listaStatus;
  }

}
