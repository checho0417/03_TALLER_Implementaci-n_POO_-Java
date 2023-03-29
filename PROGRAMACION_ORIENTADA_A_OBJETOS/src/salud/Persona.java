package salud;

import java.util.Scanner;

public class Persona {

    //atributos
    private String tipoDoc;
    private int documento;
    private String nombre;
    private String apellido;
    private double peso;
    private double estatura;
    private int edad;
    private String sexo;
    private double pesoActual;
 

//METODO CONSTRUCTOR

public Persona(String tipoDoc, int documento, String nombre, String apellido, double peso, double estatura,
            int edad, String sexo, double pesoActual) {
        this.tipoDoc = tipoDoc;
        this.documento = documento;
        this.nombre = nombre;
        this.apellido = apellido;
        this.peso = peso;
        this.estatura = estatura;
        this.edad = edad;
        this.sexo = sexo;
        this.pesoActual = pesoActual;
    }


//METODOS ACCESORES nos permiten acceder a los atributos de los metodos privados 
//Set Asignar un valor 
//Get 


public Persona() {
}


public void setTipoDoc(String tipoDoc) {
    this.tipoDoc = tipoDoc;
}public int getDocumento() {
    return documento;
}public void setDocumento(int documento) {
    this.documento = documento;
}public String getNombre() {
    return nombre;
}public void setNombre(String nombre) {
    this.nombre = nombre;
}public String getApellido() {
    return apellido;
}public void setApellido(String apellido) {
    this.apellido = apellido;
}public double getPeso() {
    return peso;
}public void setPeso(double peso) {
    this.peso = peso;
}public double getEstatura() {
    return estatura;
}public void setEstatura(double estatura) {
    this.estatura = estatura;
}public int getEdad() {
    return edad;
}public void setEdad(int edad) {
    this.edad = edad;
}public String getSexo() {
    return sexo;
}public void setSexo(String sexo) {
    this.sexo = sexo;
}public double getPesoActual() {
    return pesoActual;
}public void setPesoActual(double pesoActual) {
    this.pesoActual = pesoActual;
}






    //metodos;

    public void pedirDatos(){

        Scanner lectura=new Scanner(System.in);

        System.out.print("Por Favor Digite Su Tipo De Documento");
        tipoDoc=lectura.next();
        System.out.print("Por Favor Digite Su Numero De Documento");
        documento=lectura.nextInt();
        System.out.print("Por Favor Digite Su Nombre");
        nombre=lectura.next();
        System.out.print("Por Favor Digite Su Apellido");
        apellido=lectura.next();
        System.out.print("Por Favor Digite Su Peso(en kilogramos)");
        peso=lectura.nextInt();
        System.out.print("Por Favor Digite Su Estatura(en metros)");
        estatura=lectura.nextInt();
        System.out.print("Por Favor Digite Su Edad");
        edad=lectura.nextInt();
        System.out.print("Por Favor Digite Su Sexo");
        sexo=lectura.next();

        

    }

    public String getTipoDoc() {
        return tipoDoc;
    }



    public void mostrarPersona(){
        System.out.print(" Su Tipo De Documento Es "+tipoDoc);
        System.out.println(" Su Numero De Documento Es "+documento);
        System.out.println(" Su Nombre Es "+nombre);
        System.out.println(" Su Apellido Es " +apellido);
        System.out.println( "Su Peso Es "+peso+"kilogramos");
        System.out.println(" La Estatura Es "+estatura+"metros");
        System.out.println(" La Edad Es "+edad);
        System.out.println(" El Sexo es "+sexo);
    
    }

 /*   public void calcularImc() {
         pesoActual = peso / (estatura * estatura);

                if (pesoActual < 20) {
                    System.out.println("El peso está por debajo de lo ideal");
                } else if (pesoActual >= 20 && pesoActual <= 25) {
                    System.out.println("El peso es ideal");
                } else if(pesoActual>25 && pesoActual <100) {
                    System.out.println("Tiene sobrepeso");
                } else {
                    System.out.println("los valores que digitaste son incorrectos");
        }
 
    }

    public void mayorEdad(){

            if (edad >= 18) {
                System.out.println(nombre+apellido+" Es mayor de edad");
            } else {
                System.out.println(nombre+apellido+" Es menor de edad");
            }
*/

// 2RETO

public int calcularImc(int peso, int estatura) {

        int imc;
        imc=peso/(estatura*estatura);
        System.out.println("El Indice De Masa Corporal Es"+imc);
        if (imc < 20) {
            System.out.println("PESOBAJO"); 
        } else if (imc >= 20 && imc <= 25) {
            System.out.println("PESOIDEAL"); 
        } else if(imc>25 && imc <100) {
            System.out.println("SOBREPESO"); 
        } else {
            System.out.println("los valores que digitaste son incorrectos");
        }
        return imc;

        

       
} 

    public void mayorEdad(){

            if (edad >= 18) {
                System.out.println(nombre+apellido+" Es mayor de edad");
            } else {
                System.out.println(nombre+apellido+" Es menor de edad");
            }


    }




 }            

 


