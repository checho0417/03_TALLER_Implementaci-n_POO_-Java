package Juego;

import java.util.Scanner;

public class PiedraPalpelTijera {
    
    String[] opciones = {"piedra", "papel", "tijeras"};
      int usuario, maquina;

public void variableUsuario(){

    Scanner lectura=new Scanner(System.in);

    System.out.println("Elija una opción:");
    System.out.println("1. Piedra");
    System.out.println("2. Papel");
    System.out.println("3. Tijeras");

    System.out.println("Cual Escoges¡¡");
    usuario=lectura.nextInt();
}

public void variableComputador(){

    int aleatorio = (int) (Math.random() * 3) + 1;

        if (aleatorio == 1) {
            this.setmaquina("piedra");
        } else if (aleatorio == 2) {
            this.setmaquina("papel");
        } else if (aleatorio == 3) {
            this.setmaquina("tijera");
        }
            
}

private void setmaquina(String string) {
}

public void ganador(){
    if (usuario == maquina) {
        System.out.println("Empate!");
    } else if (usuario == 1 && maquina == 3 || usuario == 2 && maquina == 1 || usuario == 3 && maquina == 2) {
        System.out.println("El usuario gana!");
    } else {
        System.out.println("La máquina gana!");
    }
    System.out.println("Fin del juego.");
    
}
        
}
