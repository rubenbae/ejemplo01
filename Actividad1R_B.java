/*INSTRUCCIONES.
Para trabajar en este ejercicio de repaso, Ud. debe ejecutar el compilador de Java Online https://www.compilejava.net/

Ejecute y conteste las preguntas aquÃ­ seÃ±aladas con la ayuda de un compaÃ±ero si Ud trabaja en parejas

AdemÃ¡s desarrolle los DOS mÃ©todos  seÃ±alados */

// Nombre de los Alumos: 


// Proyecto EmpresaRrhh


/*  ACTIVIDAD 1. Dibuje la clase en lucidchart e envie el diagrama adjunto con las respuestas de este problema
|---------------|
|   Persona     |
|---------------| 
| - atributos   |
|               |
|---------------|
| + metodos()   | 
|               | 
|---------------|
*/

/* ACTIVIDAD  2. Conteste las siguientes preguntas como comentario */

class Persona {
    private String run;
    private String nombre;
    private String genero;
    private int edad; 
    private int sueldo;  
 
  
//1. Â¿Por cuÃ¡l principio bÃ¡sico de POO es recomendable que los atributos sean privados?  Encapsulamiento
  /*
  */

    
    
    // Constructor sin parÃ¡metros. Atributos Inicializados
    public Persona(){
        run = "8607245-9";
        genero = "Masculino";
        nombre = "Roberto GÃ³mez CatalÃ¡n";
        edad = 35;
        sueldo=856000;
    }
    
    // Constructor parametrizado
    public Persona(String valorRun,String valorNombre){		
        run = valorRun;
        genero = "Masculino";
        nombre = valorNombre;
        edad = 18;
        sueldo=301000;
    } 
  // 2. Â¿por cuÃ¡l principio bÃ¡sico de POO es posible tener dos mÃ©todos con el mismo nombre?: Polimorfismo
  /*
  */
    
    // MÃ©todo accesador
    public String getNombre(){
      return nombre;
    }
    
    // MÃ©todo mutador
    public void setNombre(String nombre){
      this.nombre = nombre;					
    } 
  // 3. Â¿para quÃ© se usa la palabra reservada this?: Es para hacer referencia al atributo de la clase persona(objeto actual) y no al atributo del metodo, que lo remplazara.  
  /*
  */
    public void setEdad(int edad){
        this.edad=edad;
    }
    public void setGenero(String genero){
        this.genero=genero;
    }
    // MÃ©todo print
    public void printPersona(){					
        System.out.println("run: " + run);				
        System.out.println("Nombre: " + nombre);
        System.out.println("Genero: " + genero);
        System.out.println("edad: " + edad + " aÃ±os");   
        System.out.println("Sueldo: " + sueldo);
        System.out.println("==============");
    }
    
  // 4. CuÃ¡l es el objetivo del mÃ©todo printPersona. Cree Ud. que es un mÃ©todo Mutador, Accesador, Constructor o Customer: es un Accesador para obtener los atributos para imprimirlos en pantalla
  // 5. Â¿QuÃ© es System.out y cuÃ¡les mÃ©todos tiene asociado?: es una variable de la clase System que contiene los metodos para imprimir valores de datos
  // 6. Â¿QuÃ© estÃ¡ haciendo el sÃ­mbolo mÃ¡s en esta sentencia : ("edad: " + edad + " aÃ±os");  ?: Concatenar un string con el atributo para imprimirlo.
  
  
    // MÃ©todo customer
    public void aumentarSueldo(int valorSueldo){   
       sueldo=sueldo+valorSueldo;					
    }
  // 7. Â¿CuÃ¡l es el sentido de la sentencia int valorSueldo en este mÃ©todo ?: Hace que al llamar este metodo le da un parametro a la funcion parqa utilizarla dentro.
  // 8. Â¿QuÃ© es sueldo y quÃ© le ocurre en la lÃ­nea de cÃ³digo 93?: sueldo es un atributo de la clace pesona, y la linea 93 rescribe el valor sueldo como sueldo aumentado en valorSueldo.
    
}

//             C  L  A  S  E     P  R  I  N  C I  P  A  L 

  public class EmpresaRrhh {
    public static void main(String[] args) {  // 9. Â¿QuÃ© hace esta lÃ­nea de cÃ³digo?: es el que hace el llamado a hacer inicio al programa.
  
        Persona persona1 = new Persona();	// 10. Â¿QuÃ© hace esta lÃ­nea de cÃ³digo?:	Creamos persona1 del tipo persona
        Persona persona2 = new Persona();   // 11. Â¿QuÃ© es persona2? : es una instancia de la clase Persona()
        
        persona1.printPersona();  // 12. Â¿QuÃ© imprime esta lÃ­nea de cÃ³digo?: me imprime los datos del primer construcctor
      
        persona1.setNombre("Patricio FernÃ¡ndez");  // 13. Â¿QuÃ© hace el mÃ©todo setNombre?. Es un mÃ©todo Mutador, Accesador, Constructor o Customer:  es un metodo mutador rescribe Nombre a patricio fernandez
        persona1.printPersona();                   //14. Â¿QuÃ© imprime esta lÃ­nea de cÃ³digo? run: 8607245-9 Nombre: Patricio FernÃ¡ndez Genero: Masculino edad: 35 aÃ±os Sueldo: 856000
        
      
      //15. QuÃ© diferencia hay con la lÃ­nea anterior (108) de printPersona().PorquÃ©? imprime lo mismo que la pregunta 12 pero con nombre: Patricio FernÃ¡ndez por que se seteo ese nombre en la linea 110
      
       
        persona1.aumentarSueldo(152000);  
      
      // 16. Â¿QuÃ© hace el mÃ©todo aumentarSueldo?. Es un mÃ©todo Mutador, Accesador, Constructor o Customer: Este metodo Mutador hace que el Atributo Sueldo de la clase persona Aumente su valor en 152000
      
      persona1.setEdad(38);  
      // 17 Implemente el mÃ©todo setEdad. Saque las lÃ­neas de comentario de la lÃ­nea 121 y ejecute el cÃ³digo completamente: OK
      
      persona1.printPersona();  //18. Â¿QuÃ© imprime esta lÃ­nea de cÃ³digo?: run: 8607245-9 Nombre: Patricio FernÃ¡ndez Genero: Masculino edad: 38 aÃ±os Sueldo: 1008000
      
      //19. QuÃ© diferencia hay con la lÃ­nea 111.PorquÃ©? lo mismo solo que cambian los atributos sueldo y edad. por que se muto el atributo edad y sueldo
      
      
      persona1.setNombre("Rocio Flores");
      
      persona1.setGenero("Femenino");  // 20. Implemente el mÃ©todo setGenero. Saque las lÃ­neas de comentario y ejecute el cÃ³digo completo
      
      persona1.printPersona();  //21 Â¿QuÃ© imprime esta lÃ­nea de cÃ³digo? run: 8607245-9 Nombre: Rocio Flores Genero: Femenino edad: 38 aÃ±os Sueldo: 1008000

      
      //22. QuÃ© diferencia hay con la lÃ­nea 124.PorquÃ©? cambiamos los atributos nombre a rocio flores y el atributo de genero a Femenino.
     
    }
}



