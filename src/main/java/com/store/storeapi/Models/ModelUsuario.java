package com.store.storeapi.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "usuario")
public class ModelUsuario {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;
  private int idTipoDocumento;
  private String numeroDocumento;
  private String email;
  private String nombre;
  private String password;
  private String nombreUsuario;

  public ModelUsuario(int idTipoDocumento, String numeroDocumento, String email, String nombre, String password,
      String nombreUsuario) {
    this.idTipoDocumento = idTipoDocumento;
    this.numeroDocumento = numeroDocumento;
    this.email = email;
    this.nombre = nombre;
    this.password = password;
    this.nombreUsuario = nombreUsuario;
  }

  public int getIdTipoDocumento() {
    return idTipoDocumento;
  }

  public void setIdTipoDocumento(int idTipoDocumento) {
    this.idTipoDocumento = idTipoDocumento;
  }

  public String getNumeroDocumento() {
    return numeroDocumento;
  }

  public void setNumeroDocumento(String numeroDocumento) {
    this.numeroDocumento = numeroDocumento;
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

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public String getNombreUsuario() {
    return nombreUsuario;
  }

  public void setNombreUsuario(String nombreUsuario) {
    this.nombreUsuario = nombreUsuario;
  }

}
