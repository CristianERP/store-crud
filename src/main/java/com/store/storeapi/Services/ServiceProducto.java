package com.store.storeapi.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.store.storeapi.Models.ModelProducto;
import com.store.storeapi.Repository.RepositoryProducto;

@Service
public class ServiceProducto {

  @Autowired
  private RepositoryProducto repositoryProducto;

  public List<ModelProducto> getProductos() {
    return repositoryProducto.findAll();
  }

  public ModelProducto getProducto(Integer id) {
    return repositoryProducto.findById(id).orElse(null);
  }

  public ModelProducto saveProducto(ModelProducto producto) {
    return repositoryProducto.save(producto);
  }

  public void deleteProducto(Integer id) {
    repositoryProducto.deleteById(id);
  }
}
