package co.edu.udea.edatos.ejemplo1.controlador;

import co.edu.udea.edatos.ejemplo1.dao.impl.FileConductor;
import co.edu.udea.edatos.ejemplo1.dao.impl.FilePropietario;
import co.edu.udea.edatos.ejemplo1.dao.impl.FileTaxi;
import co.edu.udea.edatos.ejemplo1.modelo.Conductor;
import co.edu.udea.edatos.ejemplo1.modelo.Propietario;
import co.edu.udea.edatos.ejemplo1.modelo.Taller;
import co.edu.udea.edatos.ejemplo1.modelo.Taxi;
import co.edu.udea.edatos.ejemplo1.negocio.impl.ConductorBsnImpl;

public class Principal {
      //agregar y eliminar taxis, conductores, propietarios, 
        //listar 
    
    //vista-controlador
    public static void main(String args[])  {
        
      
/*
        try {
            estudianteBsn.almacenarEstudiante(e1);
            estudianteBsn.almacenarEstudiante(e2);


        } catch (EstudianteYaExisteException e) {
            e.printStackTrace();
        } catch (PromedioFueraDeRangoException e) {
            e.printStackTrace();
        }
        */
        //List<Estudiante> estudiantes = estudianteBsn.listarEstudiantes();
        //estudiantes.forEach(System.out::println);
        FileConductor fc = new FileConductor();
        FileTaxi ft = new FileTaxi();
        ConductorBsnImpl con= new ConductorBsnImpl();
        Taller taller= new Taller();
        Propietario propietario = new Propietario();
        propietario.setIdentificacion("123456");
        taller.setCodigo("654546");
       // Taxi taxi = new Taxi("123","15", "2005", propietario, "mat");
        Conductor conductor = new Conductor( "103", "pepe", "sua", "55", "masculino", "312");
          //  conductor.insertarTaxi(taxi);
            
       FilePropietario fp= new FilePropietario();
        System.out.println(fp.eliminarPropietario("1"));
       
          
       //  List <String[]> lista= new ArrayList<>();
       //  lista=con.listarConductor().t
            //System.out.println(fc.consultarConductor("103").getNombre()); 
              
       /*
        try{
       ft.almacenarTaxi(taxi);
       fc.almacenarConductor(conductor);
        }catch(LlaveDuplicadaException ex){
        }
        */
      // System.out.println(ft.c);
       // fc.eliminarConductor("01");
        
        
        
    }
}
