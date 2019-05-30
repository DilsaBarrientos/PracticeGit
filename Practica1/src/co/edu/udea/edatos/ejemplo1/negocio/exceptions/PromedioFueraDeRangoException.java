package co.edu.udea.edatos.ejemplo1.negocio.exceptions;

public class PromedioFueraDeRangoException extends Exception {

    @Override
    public String getMessage() {
        return "El promedio está por fuera del rango permitido (0-5)";
    }
}
