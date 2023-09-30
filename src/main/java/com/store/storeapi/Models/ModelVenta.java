package com.store.storeapi.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "venta")
public class ModelVenta {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;
  private int idCliente;
  private int idUsuario;
  private double ivaVenta;
  private double totalVenta;
  private double valorVenta;

  public ModelVenta(int idCliente, int idUsuario, double ivaVenta, double totalVenta, double valorVenta) {
    this.idCliente = idCliente;
    this.idUsuario = idUsuario;
    this.ivaVenta = ivaVenta;
    this.totalVenta = totalVenta;
    this.valorVenta = valorVenta;
  }

  public int getIdCliente() {
    return idCliente;
  }

  public void setIdCliente(int idCliente) {
    this.idCliente = idCliente;
  }

  public int getIdUsuario() {
    return idUsuario;
  }

  public void setIdUsuario(int idUsuario) {
    this.idUsuario = idUsuario;
  }

  public double getIvaVenta() {
    return ivaVenta;
  }

  public void setIvaVenta(double ivaVenta) {
    this.ivaVenta = ivaVenta;
  }

  public double getTotalVenta() {
    return totalVenta;
  }

  public void setTotalVenta(double totalVenta) {
    this.totalVenta = totalVenta;
  }

  public double getValorVenta() {
    return valorVenta;
  }

  public void setValorVenta(double valorVenta) {
    this.valorVenta = valorVenta;
  }

}
