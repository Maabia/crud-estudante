package dev.cadastroestudante.tecnologia.infra;

import dev.cadastroestudante.tecnologia.application.repository.StudentRepository;
import dev.cadastroestudante.tecnologia.domain.Student;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Repository
public class StudentRepositoryImpl implements StudentRepository {

    private final StudentMongoDBRepository studentMongoDBRepository;

    @Override
    public List<Student> findAll() {

        return studentMongoDBRepository.findAll();
    }

    @Override
    public Optional<Student> findById(String id) {
        return studentMongoDBRepository.findById(id);
    }
}
