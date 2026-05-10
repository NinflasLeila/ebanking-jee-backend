package net.nineflas.ebanking_jee_project_backend.dtos;


import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class CustomerDTO {


    private Long id;
    private String name;
    private String email;
}