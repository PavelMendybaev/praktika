package com.example.demo.repository;

import com.example.demo.model.MainData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MainDataRepository extends JpaRepository<MainData , Long> {
}
