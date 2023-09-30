package com.store.storeapi.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "proveedor")
public class ModelProveedor {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;
  private String ciudad;
  private String direccion;
  private String nombre;
  private String telefono;
  private String nit;

  public ModelProveedor() {
  }

  public ModelProveedor(int id, String ciudad, String direccion, String nombre, String telefono, String nit) {
    this.id = id;
    this.ciudad = ciudad;
    this.direccion = direccion;
    this.nombre = nombre;
    this.telefono = telefono;
    this.nit = nit;
  }

  public String getCiudad() {
    return ciudad;
  }

  public void setCiudad(String ciudad) {
    this.ciudad = ciudad;
  }

  public String getDireccion() {
    return direccion;
  }

  public void setDireccion(String direccion) {
    this.direccion = direccion;
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

  public String getNit() {
    return nit;
  }

  public void setNit(String nit) {
    this.nit = nit;
  }

}
