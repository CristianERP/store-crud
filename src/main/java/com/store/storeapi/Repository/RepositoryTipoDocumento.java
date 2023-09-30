package com.store.storeapi.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.store.storeapi.Models.ModelTipoDocumento;

@Repository
public interface RepositoryTipoDocumento extends JpaRepository<ModelTipoDocumento, Integer> {

}
