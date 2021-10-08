package com.escola.curso.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "curso")
@Entity
public class Curso {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nome;

    @ManyToMany
    @JoinTable(name = "curso_aluno",
            joinColumns = @JoinColumn( name = "curso_id"),
            inverseJoinColumns = @JoinColumn(name="aluno_id"))
    List<Aluno> alunos;
}
