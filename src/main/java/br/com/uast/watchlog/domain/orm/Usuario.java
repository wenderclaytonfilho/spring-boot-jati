package br.com.uast.watchlog.domain.orm;

import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Usuario{

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    @Column(length = 100,nullable = false)
    private String nome;
    @Column(length = 100,nullable = false)
    private String login;
    @Column(length = 100,nullable = false)
    private String senha;
    @Column(length = 100,nullable = false)
    private String email;
}