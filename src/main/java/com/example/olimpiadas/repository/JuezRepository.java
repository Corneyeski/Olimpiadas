package com.example.olimpiadas.repository;


import com.example.olimpiadas.entities.Juez;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JuezRepository extends JpaRepository<Juez, Long> {

}
