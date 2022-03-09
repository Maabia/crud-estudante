package dev.cadastroestudante.tecnologia.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.FieldType;
import org.springframework.data.mongodb.core.mapping.MongoId;

import javax.validation.constraints.NotEmpty;
import java.util.Date;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
@Document(collection = "Student")
public class Student {

    @MongoId(targetType = FieldType.STRING)
    private String id;
    @NotEmpty(message = "o nome não pode estar vazio")
    private String name;
    @NotEmpty(message = "o e-mail não pode estar vazio")
    private String email;
    private String  birthday;
    private Date createdAt;

}
