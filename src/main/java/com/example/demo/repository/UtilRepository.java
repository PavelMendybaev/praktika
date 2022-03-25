package com.example.demo.repository;

import com.example.demo.model.Util;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UtilRepository extends JpaRepository<Util , Long> {

}
