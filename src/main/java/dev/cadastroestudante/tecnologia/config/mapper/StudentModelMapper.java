package dev.cadastroestudante.tecnologia.config.mapper;

import dev.cadastroestudante.tecnologia.application.dto.StudentResponse;
import dev.cadastroestudante.tecnologia.domain.Student;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@AllArgsConstructor
@Component
public class StudentModelMapper {

    private ModelMapper mapper;

    public StudentResponse toResponseDTO (Student student){
        return mapper.map(student, StudentResponse.class);
    }

    public List<StudentResponse> toResponseList (List<Student> students){
        return students.stream().map(this:: toResponseDTO).collect(Collectors.toList());
    }

    public Student toEntity (StudentResponse studentResponse){
        return mapper.map(studentResponse, Student.class);
    }
}
