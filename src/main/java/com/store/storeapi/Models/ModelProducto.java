package com.store.storeapi.Models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "producto")
public class ModelProducto {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;

  @Column(name = "idproveedor")
  private int idProveedor;

  @Column(name = "ivacompra")
  private double ivaCompra;

  private String nombre;

  @Column(name = "preciocompra")
  private double precioCompra;

  @Column(name = "precioventa")
  private double precioVenta;

  public ModelProducto() {
  }

  public ModelProducto(int id, int idProveedor, double ivaCompra, String nombre, double precioCompra,
      double precioVenta) {
    this.id = id;
    this.idProveedor = idProveedor;
    this.ivaCompra = ivaCompra;
    this.nombre = nombre;
    this.precioCompra = precioCompra;
    this.precioVenta = precioVenta;
  }

  public int getIdProveedor() {
    return idProveedor;
  }

  public void setIdProveedor(int idProveedor) {
    this.idProveedor = idProveedor;
  }

  public double getIvaCompra() {
    return ivaCompra;
  }

  public void setIvaCompra(double ivaCompra) {
    this.ivaCompra = ivaCompra;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public double getPrecioCompra() {
    return precioCompra;
  }

  public void setPrecioCompra(double precioCompra) {
    this.precioCompra = precioCompra;
  }

  public double getPrecioVenta() {
    return precioVenta;
  }

  public void setPrecioVenta(double precioVenta) {
    this.precioVenta = precioVenta;
  }

}
