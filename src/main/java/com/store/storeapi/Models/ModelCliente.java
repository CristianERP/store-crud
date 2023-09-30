package com.store.storeapi.Models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "cliente")
public class ModelCliente {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;
  @Column(name = "idtipodocumento")
  private int idTipoDocumento;
  @Column(name = "numerodocumento")
  private String numeroDocumento;
  private String direccion;
  private String email;
  private String nombre;
  private String telefono;

  public ModelCliente() {
  }

  public ModelCliente(int id, int idTipoDocumento, String numeroDocumento, String direccion, String email,
      String nombre, String telefono) {
    this.id = id;
    this.idTipoDocumento = idTipoDocumento;
    this.numeroDocumento = numeroDocumento;
    this.direccion = direccion;
    this.email = email;
    this.nombre = nombre;
    this.telefono = telefono;
  }

  public int getidTipoDocumento() {
    return idTipoDocumento;
  }

  public void setidTipoDocumento(int idTipoDocumento) {
    this.idTipoDocumento = idTipoDocumento;
  }

  public String getnumeroDocumento() {
    return numeroDocumento;
  }

  public void setnumeroDocumento(String numeroDocumento) {
    this.numeroDocumento = numeroDocumento;
  }

  public String getDireccion() {
    return direccion;
  }

  public void setDireccion(String direccion) {
    this.direccion = direccion;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public String getTelefono() {
    return telefono;
  }

  public void setTelefono(String telefono) {
    this.telefono = telefono;
  }

}
