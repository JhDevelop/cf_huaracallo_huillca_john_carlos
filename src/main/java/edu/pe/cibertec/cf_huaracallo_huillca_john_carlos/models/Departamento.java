package edu.pe.cibertec.cf_huaracallo_huillca_john_carlos.models;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Table(name = "tbl_departamento")
@Entity
@Getter
@Setter
public class Departamento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idDepartamento")
    private Long idDepartamento;

    private String descripcion;
}
