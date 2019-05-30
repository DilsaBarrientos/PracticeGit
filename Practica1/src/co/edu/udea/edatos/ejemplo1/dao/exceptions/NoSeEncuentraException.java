/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.udea.edatos.ejemplo1.dao.exceptions;

/**
 *
 * @author Garces Usma
 */
public class NoSeEncuentraException extends Exception{
     @Override
    public String getMessage() {
        return "No se ha encontrado.";
    }
}
