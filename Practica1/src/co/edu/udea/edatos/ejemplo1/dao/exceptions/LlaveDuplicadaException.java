package co.edu.udea.edatos.ejemplo1.dao.exceptions;

public class LlaveDuplicadaException extends Exception {

    @Override
    public String getMessage() {
        return "Ha ocurrido un error con la llave primaria";
    }
}
