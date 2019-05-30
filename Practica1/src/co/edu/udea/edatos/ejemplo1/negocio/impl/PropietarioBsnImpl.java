/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.udea.edatos.ejemplo1.negocio.impl;

import co.edu.udea.edatos.ejemplo1.dao.PropietarioDAO;
import co.edu.udea.edatos.ejemplo1.dao.exceptions.LlaveDuplicadaException;
import co.edu.udea.edatos.ejemplo1.dao.impl.FilePropietario;
import co.edu.udea.edatos.ejemplo1.modelo.Propietario;
import co.edu.udea.edatos.ejemplo1.negocio.PropietarioBsn;
import co.edu.udea.edatos.ejemplo1.negocio.exceptions.YaExisteException;
import java.util.List;

/**
 *
 * @author Garces Usma
 */
public class PropietarioBsnImpl implements PropietarioBsn{
    private PropietarioDAO propietarioDAO;
    
    public PropietarioBsnImpl() {
        propietarioDAO = new FilePropietario();
    }
    
    @Override
    public List<String[]> listarPropietario() {
    return propietarioDAO.listarPropietario();
            }

    @Override
    public String[] consultarPropietario(String id) {
    return propietarioDAO.consultarPropietario(id);
    }

    @Override
    public void almacenarPropietario(Propietario propietario) throws YaExisteException {
    try {
            propietarioDAO.almacenarPropietario(propietario);
        } catch (LlaveDuplicadaException lde) {
          throw new YaExisteException();
        }
    }

    @Override
    public boolean eliminarPropietario(String id) {
    return propietarioDAO.eliminarPropietario(id);
    }

    @Override
    public void actualizarPropietario(Propietario propietario) {
    propietarioDAO.actualizarPropietario(propietario);
    }
    
}
