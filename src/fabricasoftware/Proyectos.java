/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fabricasoftware;

import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.Month;

/**
 *
 * @author jhon
 */
public class Proyectos extends Persona{
  
 public Proyectos(){
     
 }   
   public  static double asignarProyecto(){
       int duracionProyecto=6;
        float sumaProyecto = 0;
        double costoProyecto=0;
       
                 

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
desaJava.sueldoDesarrolladorJava=3500_000;

Tester tester= new Tester();
tester.nombre= "Jhon Muñoz";
tester.edad=30;
tester.fechaNacimiento=LocalDate.of(1986, Month.JULY, 07);
tester.sueldoTester=2000_000;    
        if (duracionProyecto==6){
          double tarifaGerente= gerente.sueldo*6;
          double tarifaTester=tester.sueldoTester*2;
          double tarifaAnalista=analista.sueldo*2;
          double tarifaDesarrolladorJ=desaJava.sueldoDesarrolladorJava*3;
            System.out.println("tarifa gerente"+tarifaGerente);
            System.out.println("tarifa tester"+tarifaTester);
            System.out.println("tarifa analista"+tarifaAnalista);
            System.out.println("tarifa desarrollador"+tarifaDesarrolladorJ);
            
          double []arrayProyecto={tarifaGerente,tarifaDesarrolladorJ,tarifaAnalista,tarifaTester}; 
          
          for(int i=0;i<arrayProyecto.length;i++){
           sumaProyecto+=arrayProyecto[i];
           costoProyecto=sumaProyecto/6;
            
        
          }
              System.out.println("El costo del Proyecto"+sumaProyecto);
              System.out.println("EL costo mensual del proyecto; "+costoProyecto);
              
        }
       return 0;

   

   }
}