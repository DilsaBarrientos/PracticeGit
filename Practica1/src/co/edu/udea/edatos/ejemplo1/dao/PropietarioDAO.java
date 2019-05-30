/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.udea.edatos.ejemplo1.dao;

import co.edu.udea.edatos.ejemplo1.dao.exceptions.LlaveDuplicadaException;
import co.edu.udea.edatos.ejemplo1.modelo.Propietario;
import java.util.List;

/**
 *
 * @author Garces Usma
 */
public interface PropietarioDAO {
    public List<String[]> listarPropietario();

    public String[] consultarPropietario(String id);
    public void almacenarPropietario(Propietario propietario) throws LlaveDuplicadaException;      
    public boolean eliminarPropietario(String id);
    public void actualizarPropietario(Propietario propietario);
}
