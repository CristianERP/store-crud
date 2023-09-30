package com.store.storeapi.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.store.storeapi.Models.ModelUsuario;

@Repository
public interface RepositoryUsuario extends JpaRepository<ModelUsuario, Integer> {

}
