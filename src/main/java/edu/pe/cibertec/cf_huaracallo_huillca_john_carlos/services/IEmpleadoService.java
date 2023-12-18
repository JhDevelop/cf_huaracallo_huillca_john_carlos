package edu.pe.cibertec.cf_huaracallo_huillca_john_carlos.services;


import edu.pe.cibertec.cf_huaracallo_huillca_john_carlos.models.Empleado;
import net.sf.jasperreports.engine.JasperPrint;

import java.util.List;

public interface IEmpleadoService {
    public List<Empleado> findAll();
    Empleado findById(Long id);
    Empleado save(Empleado empleado);
    void deleteById(Long id);
    Empleado update(Empleado empleado);
    public JasperPrint report();
}
