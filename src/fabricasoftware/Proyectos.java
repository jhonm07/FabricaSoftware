/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fabricasoftware;

import java.time.LocalDate;
import java.time.Month;

/**
 *
 * @author jhon
 */
public class Proyectos extends Persona{
  
 public Proyectos(){
     
 }   
   public void asignarProyecto(){
       int duracionProyecto=6;
GerenteProyectos gerente= new GerenteProyectos();
gerente.nombre="Jonathan Pereira";
gerente.edad=45;
gerente.Cargo="Gerente Proyectos";
LocalDate fechaGerente= LocalDate.of(1983, Month.JULY, 07);
gerente.sueldo=5000_000;

AnalistaProyectos analista= new AnalistaProyectos();
analista.nombre="Monica Ramirez";
analista.edad=44;
analista.fechaNacimiento=LocalDate.of(1980, Month.AUGUST, 8);
analista.sueldo=3000_000;

DesarrolladorJava desaJava= new DesarrolladorJava();
desaJava.nombre="Oscar Hernandez";
desaJava.edad=22;
desaJava.fechaNacimiento=LocalDate.of(1988, Month.OCTOBER, 31);
desaJava.sueldoDesarrolladorJava=3.500_000;

Tester tester= new Tester();
tester.nombre= "Jhon Muñoz";
tester.edad=30;
tester.fechaNacimiento=LocalDate.of(1986, Month.JULY, 07);
tester.sueldoTester=2000_000;    
        if (duracionProyecto==6){
            
        }


       System.out.println("el proyecto:"+gerente.Cargo+"nombre: "+gerente.nombre+"edad: "+gerente.edad+"fecha nacimiento: "+fechaGerente+"sueldo"+gerente.sueldo );
    
  
}
   
}