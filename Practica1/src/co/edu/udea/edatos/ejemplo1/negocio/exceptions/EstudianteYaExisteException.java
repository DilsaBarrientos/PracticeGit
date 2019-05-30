package co.edu.udea.edatos.ejemplo1.negocio.exceptions;

public class EstudianteYaExisteException extends Exception {

    @Override
    public String getMessage() {
        return "El estudiante ya se encuentra almacenado";
    }
}
