package com.store.storeapi.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.store.storeapi.Models.ModelProveedor;

@Repository
public interface RepositoryProveedor extends JpaRepository<ModelProveedor, Integer> {

}
