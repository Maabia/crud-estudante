package dev.cadastroestudante.tecnologia.application.repository;

import dev.cadastroestudante.tecnologia.domain.Student;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository {
    List<Student> findAll();
}
