package dev.cadastroestudante.tecnologia.application.api;

import dev.cadastroestudante.tecnologia.application.dto.StudentResponse;
import dev.cadastroestudante.tecnologia.application.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class StudentRestController implements StudentAPI {

    private final StudentService studentService;

    @Override
    public List<StudentResponse> listaEstudante() {
        List<StudentResponse> students = studentService.listaEstudante();
        return students;
    }

    @Override
    public StudentResponse busca(String id) {
        StudentResponse student = studentService.buscaEstudante(id);
        return student;
    }
}
