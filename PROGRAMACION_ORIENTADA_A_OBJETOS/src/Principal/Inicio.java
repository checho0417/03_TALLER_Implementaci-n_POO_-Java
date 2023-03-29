package Principal;

import java.util.Scanner;
 
import salud.*;

public class Inicio {
    public static void main(String[] args) {

    

    //crear un objeto 

    Persona persona=new Persona();
    Empleado Empleado=new Empleado(null, 0, null, null, 0, 0, 0, null, 0, null, 0, 0, null);

    //invocando un metodo
    persona.setNombre(null);
    persona.setApellido(null);
    persona.setTipoDoc(null);
    persona.setDocumento(0);
    persona.setEdad(0);
    persona.setEstatura(0);
    persona.setSexo(null);
    persona.setPeso(0);



    persona.pedirDatos();
    persona.mostrarPersona();
    persona.mayorEdad();
    Empleado.pedirDatos();
    Empleado.calcularHorarios();
    
//metodo con parametros 

    int peso;
    int estatura;    
    Scanner lectura=new Scanner(System.in);
    System.out.println("Digite Su Peso");
    peso=lectura.nextInt();
    System.out.println("Digite Su Estatura");
    estatura=lectura.nextInt();

    persona.calcularImc(peso, estatura);

    lectura.close();
    }
}


