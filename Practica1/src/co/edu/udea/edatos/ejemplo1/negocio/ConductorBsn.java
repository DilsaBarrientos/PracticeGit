/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.udea.edatos.ejemplo1.negocio;
import co.edu.udea.edatos.ejemplo1.modelo.Conductor;
import co.edu.udea.edatos.ejemplo1.negocio.exceptions.NoSeEncuentraException;
import co.edu.udea.edatos.ejemplo1.negocio.exceptions.YaExisteException;
import java.util.List;

/**
 *
 * @author Garces Usma
 */
public interface ConductorBsn {
    public List<String[]> listarConductor();
    public String[] consultarConductor(String id) throws NoSeEncuentraException ;
    public void almacenarConductor(Conductor conductor) throws YaExisteException;   
    public boolean eliminarConductor(String id);
    public void actualizarConductor(Conductor conductor);
    
}
