package dev.cadastroestudante.tecnologia.application.service;

import dev.cadastroestudante.tecnologia.application.dto.StudentResponse;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface StudentService {
    List<StudentResponse> listaEstudante();
}
