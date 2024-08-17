/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Struts2/Action.java to edit this template
 */
package beans.actions;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
/**
 *
 * @author grenn
 */
public class MostrarPersonaAction extends ActionSupport{
    Logger log = LogManager.getLogger(MostrarPersonaAction.class);
    private String nombre; //Variable con el valor introducido en el textfield

    
    @Override
    public String execute() throws Exception {
        log.info("El nombre es: " + nombre);//Imprime el nombre en consola
        return SUCCESS;//Retorna un "success"
    }

    //Metodo para obtener el valor de la variable nombre
    public String getNombre() {
        return nombre;
    }
    //Metodo para asignar el valor de la variable nombre
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    //Metodo para obtener el valor de la variable "titulo" en el archivo propoerties
    public String getTitulo(){
        return getText("persona.titulo");
    }
    //Metodo para obtener el valor de la variable "valor" en el archivo propoerties
    public String getValor(){
        return getText("persona.valor");
    }
    //Metodo para obtener el valor de la variable "boton" en el archivo propoerties (nombre visible del boton)
    public String getBoton(){
        return getText("persona.boton");
    }
}
