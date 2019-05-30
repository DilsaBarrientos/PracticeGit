/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.udea.edatos.ejemplo1.dao;

import co.edu.udea.edatos.ejemplo1.dao.exceptions.LlaveDuplicadaException;
import co.edu.udea.edatos.ejemplo1.modelo.Conductor;
import java.util.List;

/**
 *
 * 
 */
public interface ConductorDAO {
    public List<String[]> listarConductor();
    public String[] consultarConductor(String id);
    public void almacenarConductor(Conductor conductor) throws LlaveDuplicadaException;   
    public boolean eliminarConductor(String id);
    public void actualizarConductor(Conductor conductor);
}
