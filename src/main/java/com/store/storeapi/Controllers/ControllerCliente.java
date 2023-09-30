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

import com.store.storeapi.Models.ModelCliente;
import com.store.storeapi.Services.ServiceCliente;

@RestController
@RequestMapping("/api")
public class ControllerCliente {

  @Autowired
  private ServiceCliente serviceCliente;

  @GetMapping("/clientes")
  public List<ModelCliente> getAll() {
    return serviceCliente.getClientes();
  }

  @GetMapping("/cliente/{id}")
  public ModelCliente getCliente(@PathVariable Integer id) {
    return serviceCliente.getCliente(id);
  }

  @PostMapping("/cliente")
  public ModelCliente saveCliente(@RequestBody ModelCliente cliente) {
    return serviceCliente.saveCliente(cliente);
  }

  @DeleteMapping("/cliente/{id}")
  public void deleteCliente(@PathVariable Integer id) {
    serviceCliente.deleteCliente(id);
  }

  // @PostMapping("/cliente")
  // public ResponseEntity<ModelCliente> save(@RequestBody ModelCliente cliente) {
  // try {
  // ModelCliente obj = serviceCliente.saveCliente(cliente);
  // return new ResponseEntity<>(obj, HttpStatus.OK);
  // } catch (Exception e) {
  // return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
  // }
  // }

}
