package com.example.olimpiadas.repository;

import com.example.olimpiadas.entities.Periodista;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PeriodistaRepository extends JpaRepository<Periodista, Long> {

}
