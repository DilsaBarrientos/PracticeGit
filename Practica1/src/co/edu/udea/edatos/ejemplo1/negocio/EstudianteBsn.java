package co.edu.udea.edatos.ejemplo1.negocio;

import co.edu.udea.edatos.ejemplo1.modelo.Estudiante;
import co.edu.udea.edatos.ejemplo1.negocio.exceptions.EstudianteYaExisteException;
import co.edu.udea.edatos.ejemplo1.negocio.exceptions.PromedioFueraDeRangoException;

import java.util.List;

//Clase de negocio
public interface EstudianteBsn {

    public void almacenarEstudiante(Estudiante estudiante) throws EstudianteYaExisteException, PromedioFueraDeRangoException;

    public List<Estudiante> listarEstudiantes();


}
