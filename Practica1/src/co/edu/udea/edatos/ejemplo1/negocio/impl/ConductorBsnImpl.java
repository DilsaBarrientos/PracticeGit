/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.udea.edatos.ejemplo1.negocio.impl;

import co.edu.udea.edatos.ejemplo1.dao.ConductorDAO;
import co.edu.udea.edatos.ejemplo1.dao.exceptions.LlaveDuplicadaException;
import co.edu.udea.edatos.ejemplo1.dao.impl.FileConductor;
import co.edu.udea.edatos.ejemplo1.modelo.Conductor;
import co.edu.udea.edatos.ejemplo1.negocio.ConductorBsn;
import co.edu.udea.edatos.ejemplo1.negocio.exceptions.NoSeEncuentraException;
import co.edu.udea.edatos.ejemplo1.negocio.exceptions.YaExisteException;
import java.util.List;

/**
 *
 * @author Garces Usma
 */
public class ConductorBsnImpl implements ConductorBsn {
    private ConductorDAO conductorDAO;
    
    public ConductorBsnImpl() {
        conductorDAO = new FileConductor();
    }
    @Override
    public List<String[]> listarConductor() {
    return conductorDAO.listarConductor();
    }

    @Override
    public String[] consultarConductor(String id) throws NoSeEncuentraException{
    return conductorDAO.consultarConductor(id);
    }

    @Override
    public void almacenarConductor(Conductor conductor) throws YaExisteException {
        try {
            conductorDAO.almacenarConductor(conductor);
        } catch (LlaveDuplicadaException lde) {
          throw new YaExisteException();
        }
    }

    @Override
    public boolean eliminarConductor(String id) {
    return conductorDAO.eliminarConductor(id);
    }

    @Override
    public void actualizarConductor(Conductor conductor) {
    conductorDAO.actualizarConductor(conductor);
    }
    
}
