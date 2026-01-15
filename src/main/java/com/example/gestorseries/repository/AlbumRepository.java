package com.example.gestorseries.repository;

import com.example.gestorseries.model.Album;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlbumRepository extends JpaRepository <Album,Long> {
}
