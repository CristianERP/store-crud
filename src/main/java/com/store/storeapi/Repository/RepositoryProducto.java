package com.store.storeapi.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.store.storeapi.Models.ModelProducto;

@Repository
public interface RepositoryProducto extends JpaRepository<ModelProducto, Integer> {

}
