package com.example.backend_sol_y_luna.repositories;

import com.example.backend_sol_y_luna.domain.entities.Event;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EventJpaRepository extends JpaRepository<Event, Integer> {
}
