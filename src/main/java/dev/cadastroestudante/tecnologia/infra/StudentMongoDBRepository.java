package dev.cadastroestudante.tecnologia.infra;

import dev.cadastroestudante.tecnologia.domain.Student;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface StudentMongoDBRepository extends MongoRepository<Student, UUID> {

}
