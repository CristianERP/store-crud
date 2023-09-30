package com.store.storeapi.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.store.storeapi.Models.ModelProveedor;
import com.store.storeapi.Repository.RepositoryProveedor;

@Service
public class ServiceProveedor {

  @Autowired
  private RepositoryProveedor repositoryProveedor;

  public List<ModelProveedor> getProveedors() {
    return repositoryProveedor.findAll();
  }

  public ModelProveedor getProveedor(Integer id) {
    return repositoryProveedor.findById(id).orElse(null);
  }

  public ModelProveedor saveProveedor(ModelProveedor cliente) {
    return repositoryProveedor.save(cliente);
  }

  public ModelProveedor updateProveedor(Integer id, ModelProveedor proveedor) {
    ModelProveedor proveedorExistente = repositoryProveedor.findById(id).orElse(null);

    if (proveedorExistente != null) {
      proveedorExistente.setCiudad(proveedor.getCiudad());
      proveedorExistente.setDireccion(proveedor.getDireccion());
      proveedorExistente.setNombre(proveedor.getNombre());
      proveedorExistente.setTelefono(proveedor.getTelefono());
      proveedorExistente.setNit(proveedor.getNit());

      return repositoryProveedor.save(proveedorExistente);
    }

    return null;
  }

  public void deleteProveedor(Integer id) {
    repositoryProveedor.deleteById(id);
  }
}
