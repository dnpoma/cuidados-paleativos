package proyectopoo;

import espe.edu.ec.controller.PacienteController;
import espe.edu.ec.view.JFInicio;



public class ProyectoPoo {


    public static void main(String[] args) {

    PacienteController pacienteController = PacienteController.getInstance();
    pacienteController.abrirVentanaInicio();

    }
    
}
