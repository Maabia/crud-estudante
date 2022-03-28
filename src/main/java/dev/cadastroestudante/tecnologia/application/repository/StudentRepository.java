package dev.cadastroestudante.tecnologia.application.repository;

import dev.cadastroestudante.tecnologia.domain.Student;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface StudentRepository {
    List<Student> findAll();

    Optional<Student> findById(String id);
}
