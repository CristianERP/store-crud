package com.store.storeapi.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.store.storeapi.Models.ModelCliente;

@Repository
public interface RepositoryCliente extends JpaRepository<ModelCliente, Integer> {

}