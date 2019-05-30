/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.udea.edatos.ejemplo1.dao;

import co.edu.udea.edatos.ejemplo1.dao.exceptions.LlaveDuplicadaException;
import co.edu.udea.edatos.ejemplo1.modelo.Taller;
import java.util.List;

/**
 *
 * @author Garces Usma
 */
public interface TallerDAO {
    public List<String[]> listarTaller();
    public String[] consultarTaller(String id);
    public void armacenarTaller(Taller taller) throws LlaveDuplicadaException; 
    public boolean eliminarTaller(String codigo);
    public void actualizarTaller(Taller taller);
}
