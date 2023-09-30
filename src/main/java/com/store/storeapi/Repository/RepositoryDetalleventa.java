package com.store.storeapi.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.store.storeapi.Models.ModelDetalleVenta;

@Repository
public interface RepositoryDetalleventa extends JpaRepository<ModelDetalleVenta, Integer> {

}
