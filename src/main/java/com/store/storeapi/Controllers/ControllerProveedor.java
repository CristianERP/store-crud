package com.store.storeapi.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.store.storeapi.Models.ModelProveedor;
import com.store.storeapi.Services.ServiceProveedor;

@RestController
@RequestMapping("/api/proveedores")
public class ControllerProveedor {

  @Autowired
  private ServiceProveedor serviceProveedor;

  @GetMapping
  public List<ModelProveedor> getAll() {
    return serviceProveedor.getProveedors();
  }

  @GetMapping("/{id}")
  public ModelProveedor getCliente(@PathVariable Integer id) {
    return serviceProveedor.getProveedor(id);
  }

  @PostMapping
  public ModelProveedor saveCliente(@RequestBody ModelProveedor producto) {
    return serviceProveedor.saveProveedor(producto);
  }

  @PutMapping("/{id}")
  public ModelProveedor updateProveedor(@PathVariable Integer id, @RequestBody ModelProveedor proveedor) {
    return serviceProveedor.updateProveedor(id, proveedor);
  }

  @DeleteMapping("/{id}")
  public void deleteCliente(@PathVariable Integer id) {
    serviceProveedor.deleteProveedor(id);
  }
}
