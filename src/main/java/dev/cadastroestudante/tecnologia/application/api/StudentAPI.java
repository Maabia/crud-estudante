package dev.cadastroestudante.tecnologia.application.api;

import dev.cadastroestudante.tecnologia.application.dto.StudentResponse;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping ("/v1/students")
public interface StudentAPI {

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    List<StudentResponse> listaEstudante ();

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    StudentResponse busca(@PathVariable String id);
}
