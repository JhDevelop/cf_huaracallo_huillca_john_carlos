package edu.pe.cibertec.cf_huaracallo_huillca_john_carlos.services;

import edu.pe.cibertec.cf_huaracallo_huillca_john_carlos.models.Departamento;

import java.util.List;

public interface IDepartamentoService {
    public List<Departamento> findAll();
    public Departamento findById(Long id);
    public Departamento save(Departamento departamento);
    public void deleteById(Long id);
    public Departamento update(Departamento departamento);
}
