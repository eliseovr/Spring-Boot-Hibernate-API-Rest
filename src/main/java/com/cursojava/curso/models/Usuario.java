package com.cursojava.curso.models;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "usuarios")
@ToString
@EqualsAndHashCode
public class Usuario {
    @Id
    @Setter    @Getter
    @Column(name = "id")
    private Long id;
    @Setter @Getter @Column(name = "nombre")
    private String nombre;
    @Setter @Getter @Column(name = "apellido")
    private String apellido;
    @Setter @Getter @Column(name = "email")
    private String email;
    @Setter @Getter @Column(name = "telefono")
    private String telefono;
    @Setter @Getter @Column(name = "passwor")
    private String password;


}
