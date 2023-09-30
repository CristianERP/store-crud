package com.store.storeapi.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

import com.store.storeapi.Models.ModelCliente;
import com.store.storeapi.Repository.RepositoryCliente;

@Service
public class ServiceCliente {

  @Autowired
  private RepositoryCliente repositoryCliente;

  public List<ModelCliente> getClientes() {
    return repositoryCliente.findAll();
  }

  public ModelCliente getCliente(Integer id) {
    return repositoryCliente.findById(id).orElse(null);
  }

  public ModelCliente saveCliente(ModelCliente cliente) {
    return repositoryCliente.save(cliente);
  }

  public void deleteCliente(Integer id) {
    repositoryCliente.deleteById(id);
  }
}
