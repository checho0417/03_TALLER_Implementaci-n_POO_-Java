package salud;

import java.util.Scanner;

public class Empleado extends Persona {

    String cargo;
    double valorhora;
    int horastrabajadas;
    String departamento;
   
    //METODO CONSTRUCTOR

    public Empleado(String tipoDoc, int documento, String nombre, String apellido, double peso, double estatura,
    int edad, String sexo, double pesoActual, String cargo, double valorhora, int horastrabajadas,
    String departamento) {
    super(tipoDoc, documento, nombre, apellido, peso, estatura, edad, sexo, pesoActual);
    this.cargo = cargo;
    this.valorhora = valorhora;
    this.horastrabajadas = horastrabajadas;
    this.departamento = departamento;
}
public void pedirDatos(){

  Scanner lectura=new Scanner(System.in);

  System.out.println("Digite su cargo");
  cargo=lectura.nextLine();
  System.out.println("Digite Cuanto Gana Cada Hora");
  valorhora=lectura.nextDouble();
  System.out.println("Digite Las Horas Trabajadas");
  horastrabajadas=lectura.nextInt();
  System.out.println("Digite El Departamento");
  departamento=lectura.next();

}


public void  calcularHorarios(){
    
  double valorSinReteica = valorhora * horastrabajadas;
  double valorConReteica = valorSinReteica - (valorSinReteica * 0.00966);
  System.out.println("su cargo es: " + cargo);
  System.out.println(" su valor por hora es: " + valorhora);
  System.out.println("sus horas trabajadas son: " + horastrabajadas);
  System.out.println("su departamento es: " + departamento);
  System.out.println("su total a pagar es: " + valorConReteica);

  }

}


      
 