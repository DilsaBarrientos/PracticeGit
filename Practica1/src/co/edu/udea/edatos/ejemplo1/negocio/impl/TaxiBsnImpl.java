/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.udea.edatos.ejemplo1.negocio.impl;

import co.edu.udea.edatos.ejemplo1.dao.TaxiDAO;
import co.edu.udea.edatos.ejemplo1.dao.exceptions.LlaveDuplicadaException;
import co.edu.udea.edatos.ejemplo1.dao.impl.FileTaxi;
import co.edu.udea.edatos.ejemplo1.modelo.Taxi;
import co.edu.udea.edatos.ejemplo1.negocio.TaxiBsn;
import co.edu.udea.edatos.ejemplo1.negocio.exceptions.YaExisteException;
import java.util.List;

/**
 *
 * @author Garces Usma
 */
public class TaxiBsnImpl implements TaxiBsn {
    private TaxiDAO taxiDAO;
    
    public TaxiBsnImpl() {
        taxiDAO = new FileTaxi();
    }
    @Override
    public List<String[]> listarTaxi() {
    return taxiDAO.listarTaxi();
    }

    @Override
    public String[] consultarTaxi(String id) {
     return taxiDAO.consultarTaxi(id);
    }

    @Override
    public void almacenarTaxi(Taxi taxi) throws YaExisteException {
     try {
            taxiDAO.almacenarTaxi(taxi);
        } catch (LlaveDuplicadaException lde) {
          throw new YaExisteException();
        }
    }
    

    @Override
    public boolean eliminarTaxi(String placa) {
    return taxiDAO.eliminarTaxi(placa);
      }

    @Override
    public void actualizarTaxi(Taxi taxi) {
    taxiDAO.actualizarTaxi(taxi);
    }
    
}
