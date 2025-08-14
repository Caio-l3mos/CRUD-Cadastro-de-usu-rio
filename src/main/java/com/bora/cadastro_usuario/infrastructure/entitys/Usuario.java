package com.bora.cadastro_usuario.infrastructure.entitys;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CollectionId;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table (name = "usuario")
@Entity

public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "email", unique = true)
    private String email;

    @Column(name = "nome")
    private String nome;


}
