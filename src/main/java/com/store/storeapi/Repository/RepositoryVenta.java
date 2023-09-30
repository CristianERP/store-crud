package com.store.storeapi.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.store.storeapi.Models.ModelVenta;

@Repository
public interface RepositoryVenta extends JpaRepository<ModelVenta, Integer> {

}
