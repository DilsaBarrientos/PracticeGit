/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.udea.edatos.ejemplo1.dao;

import co.edu.udea.edatos.ejemplo1.dao.exceptions.LlaveDuplicadaException;
import co.edu.udea.edatos.ejemplo1.modelo.Taxi;
import java.util.List;

/**
 *
 * @author Garces Usma
 */
public interface TaxiDAO {
    public List<String[]> listarTaxi();
    public String[] consultarTaxi(String id);
    public void almacenarTaxi(Taxi taxi) throws LlaveDuplicadaException; 
    public boolean eliminarTaxi(String placa);
    public void actualizarTaxi(Taxi taxi);
}
