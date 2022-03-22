package dev.cadastroestudante.tecnologia.application.service;

import dev.cadastroestudante.tecnologia.application.dto.StudentResponse;
import dev.cadastroestudante.tecnologia.application.repository.StudentRepository;
import dev.cadastroestudante.tecnologia.config.mapper.StudentModelMapper;
import dev.cadastroestudante.tecnologia.domain.Student;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class StudentServiceImpl implements StudentService{

    private final StudentRepository studentRepository;
    private final StudentModelMapper studentMapper;

    @Override
    public List<StudentResponse> listaEstudante() {
        List<Student> students = studentRepository.findAll();
        return studentMapper.toResponseList(students);
    }
}
