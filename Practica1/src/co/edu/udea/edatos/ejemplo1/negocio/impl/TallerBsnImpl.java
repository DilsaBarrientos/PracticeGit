/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.udea.edatos.ejemplo1.negocio.impl;

import co.edu.udea.edatos.ejemplo1.dao.TallerDAO;
import co.edu.udea.edatos.ejemplo1.dao.exceptions.LlaveDuplicadaException;
import co.edu.udea.edatos.ejemplo1.dao.impl.FileTaller;
import co.edu.udea.edatos.ejemplo1.modelo.Taller;
import co.edu.udea.edatos.ejemplo1.negocio.TallerBsn;
import co.edu.udea.edatos.ejemplo1.negocio.exceptions.YaExisteException;
import java.util.List;

/**
 *
 * @author Garces Usma
 */
public class TallerBsnImpl implements TallerBsn {
    private TallerDAO tallerDAO;

    public TallerBsnImpl() {
        tallerDAO = new FileTaller();
    }
    
    
    @Override
    public List<String[]> listarTaller() {
    return tallerDAO.listarTaller();
    }

    @Override
    public String[] consultarTaller(String id) {
    return tallerDAO.consultarTaller(id);
    }

    @Override
    public void armacenarTaller(Taller taller) throws YaExisteException {
     try {
            tallerDAO.armacenarTaller(taller);
        } catch (LlaveDuplicadaException lde) {
          throw new YaExisteException();
        }
    }

    @Override
    public boolean eliminarTaller(String codigo) {
    return tallerDAO.eliminarTaller(codigo);
    }

    @Override
    public void actualizarTaller(Taller taller) {
    tallerDAO.actualizarTaller(taller);
    }
    
}
