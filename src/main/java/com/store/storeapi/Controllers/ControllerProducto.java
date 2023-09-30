package com.store.storeapi.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.store.storeapi.Models.ModelProducto;
import com.store.storeapi.Services.ServiceProducto;

@RestController
@RequestMapping("/api/productos")
public class ControllerProducto {

  @Autowired
  private ServiceProducto serviceProducto;

  @GetMapping
  public List<ModelProducto> getAll() {
    return serviceProducto.getProductos();
  }

  @GetMapping("/{id}")
  public ModelProducto getCliente(@PathVariable Integer id) {
    return serviceProducto.getProducto(id);
  }

  @PostMapping
  public ModelProducto saveCliente(@RequestBody ModelProducto producto) {
    return serviceProducto.saveProducto(producto);
  }

  @DeleteMapping("/{id}")
  public void deleteCliente(@PathVariable Integer id) {
    serviceProducto.deleteProducto(id);
  }
}
