package com.camilorava.reactive.repository;

import com.camilorava.reactive.model.Department;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import reactor.core.publisher.Mono;

public interface DepartmentRepository extends ReactiveCrudRepository<Department,Integer> {
    Mono<Department> findByUserId(Integer userId);
}