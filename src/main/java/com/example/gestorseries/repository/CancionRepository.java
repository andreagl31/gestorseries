package com.example.gestorseries.repository;

import com.example.gestorseries.model.Cancion;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CancionRepository extends JpaRepository <Cancion,Long> {


}
