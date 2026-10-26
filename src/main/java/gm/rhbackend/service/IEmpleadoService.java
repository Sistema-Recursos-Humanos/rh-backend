package gm.rhbackend.service;

import gm.rhbackend.model.Empleado;

import java.util.List;

public interface IEmpleadoService {
    List<Empleado> listarEmpleados();

    Empleado buscarEmpleadoPorId(Integer idEmpleado);

    void guardarEmpleado(Empleado empleado);

    void eliminarEmpleado(Empleado empleado);
}
