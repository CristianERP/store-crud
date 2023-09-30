package com.store.storeapi.Models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "detalleventa")
public class ModelDetalleVenta {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;
  @Column(name = "idproducto")
  private int idProducto;
  @Column(name = "idventa")
  private int idVenta;
  @Column(name = "cantidadproducto")
  private int cantidadProducto;
  @Column(name = "valortotal")
  private double valorTotal;
  @Column(name = "valorventa")
  private double valorVenta;
  @Column(name = "valoriva")
  private double valorIva;

  public ModelDetalleVenta(int idProducto, int idVenta, int cantidadProducto, double valorTotal, double valorVenta,
      double valorIva) {
    this.idProducto = idProducto;
    this.idVenta = idVenta;
    this.cantidadProducto = cantidadProducto;
    this.valorTotal = valorTotal;
    this.valorVenta = valorVenta;
    this.valorIva = valorIva;
  }

  public int getIdProducto() {
    return idProducto;
  }

  public void setIdProducto(int idProducto) {
    this.idProducto = idProducto;
  }

  public int getIdVenta() {
    return idVenta;
  }

  public void setIdVenta(int idVenta) {
    this.idVenta = idVenta;
  }

  public int getCantidadProducto() {
    return cantidadProducto;
  }

  public void setCantidadProducto(int cantidadProducto) {
    this.cantidadProducto = cantidadProducto;
  }

  public double getValorTotal() {
    return valorTotal;
  }

  public void setValorTotal(double valorTotal) {
    this.valorTotal = valorTotal;
  }

  public double getValorVenta() {
    return valorVenta;
  }

  public void setValorVenta(double valorVenta) {
    this.valorVenta = valorVenta;
  }

  public double getValorIva() {
    return valorIva;
  }

  public void setValorIva(double valorIva) {
    this.valorIva = valorIva;
  }

}
