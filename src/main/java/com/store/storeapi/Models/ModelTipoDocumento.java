package com.store.storeapi.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tipodocumento")
public class ModelTipoDocumento {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;
  private String tipo;

  public ModelTipoDocumento(String tipo) {
    this.tipo = tipo;
  }

  public String getTipo() {
    return tipo;
  }

  public void setTipo(String tipo) {
    this.tipo = tipo;
  }

}
