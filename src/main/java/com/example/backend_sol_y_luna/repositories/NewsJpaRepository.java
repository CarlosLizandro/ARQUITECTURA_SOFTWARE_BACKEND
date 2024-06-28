package com.example.backend_sol_y_luna.repositories;

import com.example.backend_sol_y_luna.domain.entities.News;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NewsJpaRepository extends JpaRepository<News, Integer> {
}
