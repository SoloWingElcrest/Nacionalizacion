
package mx.itson.nacionalizandoALasTwice;

import java.awt.event.KeyEvent;
import static java.lang.Math.random;
import java.util.Random;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.INFORMATION_MESSAGE;
import org.apache.commons.lang3.RandomStringUtils;



/**
 * Genera el curp
 * @author Martan Gallardo Jesus Alexis, Xylan Rodriguez Robles
 */
public class metodos {


       int dia = 0;
       int año = 0;
       int mes = 0;
       String sexo = "";
       String estado = "";
       String nombre = "";
       String apellidoPaterno = "";
       String apellidoMaterno = "";
       String d1 = "";
       String d2 = "";
       
       /**
        * @param a Convierte el día en una string 
        * @param b Convierte el mes en una string
        * @param c Convierte el año en una string
        */
       public void getFecha(String a, String b, String c){
           
           dia = Integer.parseInt(a);
           mes = Integer.parseInt(b);
           año = Integer.parseInt(c);
        
      }
   
/**
 * 
 * @param radio Obtiene el valor del sexo
 */
       public void getSexo(String radio){
           sexo = radio;
           
       }
       /**
        * 
        * @param boxEstado Obtiene el valor seleccionado del estado
        */
       public void getEstado(String boxEstado){
           estado = boxEstado;
       }
       
  /**
   * 
   * @param a Obtiene los datos del nombre
   * @param b Obtiene los datos del apellido
   * @param c Obtiene los datos del año
   */
       public void getNombre(String a, String b, String c){
           
           nombre = a.toUpperCase();
           apellidoPaterno = b.toUpperCase();
           apellidoMaterno = c.toUpperCase();
           
       }
       
       /**
        * Ordena todos los caracteres necesarios para la creacion del CURP
        */
        public void generarCurp(){
            /**
             * Busca la primera vocal del apellido paterno
             */
           char p1 = apellidoPaterno.charAt(0); //Primer caracter del apellido 
           char p2 = 0;
           for (int i = 1; i < apellidoPaterno.length(); i++){
                char l = apellidoPaterno.charAt(i);
                if(l == 'A' || l == 'E' || l == 'I' || l == 'O' || l == 'U'){
                p2 = l;
               
           }else{
                    break;
                }
       }
           /**
            * Delcara las variables dentro de caracteres
            */
           char p3 = apellidoMaterno.charAt(0);
           char p4 = nombre.charAt(0);
           String anio = String.valueOf(año);
           String sem = String.valueOf(mes);
           char p5 = anio.charAt(2);
           char p6 = anio.charAt(3);
           char p7 = 0;
           char p8 = 0;

           /**
            * Evalua si el valor del mes es menor o mayor a 10
            */
           if(mes < 10){
               p7 = '0';
               p8 = sem.charAt(0);
               
           }else{
               
               p7 = sem.charAt(0);
               p8 = sem.charAt(1);
               
           }
           String aid = String.valueOf(dia);
           char p9 = 0;
           char p10 = 0;
           
           /**
            * Evalua si el dia es menor o mayor a 10
            */
           if(dia < 10){
               p9 = '0';
               p10 = aid.charAt(0);
               
           }else{
               
               p9 = aid.charAt(0);
               p10 = aid.charAt(1);
               
           }
           
          char  p11 = sexo.charAt(0);
          entidadFederativa();
          String p12 = d1; 
          String p13 = d2;
          
          char p14 = 0;
          
          /**
           * Busca la primera consonante del apellido paterno
           */
          for (int i = 1; i < apellidoPaterno.length(); i++){
                char l = apellidoPaterno.charAt(i);
                if(l != 'A' && l != 'E' && l != 'I' && l != 'O' && l != 'U'){
                p14 = l;
                    break;
                }
       }
          /**
           * Busca la primera consonante del apellido Materno
           */
          
          char p15 = 0;
          for (int i = 1; i < apellidoMaterno.length(); i++){
                char l = apellidoMaterno.charAt(i);
                if(l != 'A' && l != 'E' && l != 'I' && l != 'O' && l != 'U'){
                p15 = l;
                    break;
                }
       }
          /**
           * Busca la primera consonante del Nombre
           */
          char p16 = 0;
          for (int i = 1; i < nombre.length(); i++){
                char l = nombre.charAt(i);
                if(l != 'A' && l != 'E' && l != 'I' && l != 'O' && l != 'U'){
                p16 = l;
                    break;
                }
       }
          /**
           * Genera un caracter aleatorio
           */
         String randomizedString = RandomStringUtils.randomAlphanumeric(1).toUpperCase();
        char p17 = randomizedString.charAt(0);
            
        /**
         * Genera un número aleatorio del 1 al 9
         */        
        /* int rand1 = (int) (Math.random()*9+1);
         String numRand1 = String.valueOf(rand1);
         char p18 = numRand1.charAt(0);
        */
        
        /**
         * Convierte el ultimo digito del curp en 1
         */
        Random random = new Random();

        char p18 = (char) (random.nextInt(1) + '1');
        
        /**
         * Genera una ventana donde se mostrará el curp
         */
        
           JOptionPane.showMessageDialog(null,p1+""+p2+""+p3+""+p4+""+p5+""+p6+""+p7+""+p8+""+p9+""+p10+""+p11+""+p12+""+p13+""+p14+""+p15+""+p16+""+""+p17+""+p18,"CURP",INFORMATION_MESSAGE);
       }
       
        
        
        /**
         * Determina el código del estado en función al nombre
         */
        public void entidadFederativa(){
            
            switch(estado){
                
                case "AguasCalientes":
                 d1 = "A";
                 d2 = "S";
                    break;
                    
                case "Baja California":
                d1 = "B";
                d2 = "C";   
                    break;
                    
                case "Baja California Sur":
                d1 = "B";
                d2 = "S";
                     break;
                     
                case "Campeche ":
                d1 = "C";
                d2 = "C";
                    break;
                case "Chiapas":
                d1 = "C";
                d2 = "S";
                    break;
                    
                case "Chihuahua":
                d1 = "C";
                d2 = "H";
                    break;
                case "Coahuila":
                d1 = "C";
                d2 = "L";
                    break;
                    
                case "Colima":
                d1 = "C";
                d2 = "M";
                    break;
                    
                case "Distrito Federal":
                d1 = "D";
                d2 = "F";
                    break;
                    
                case "Durango":
                d1 = "D";
                d2 = "G";
                    break;
                    
                case "Guanajuato":
                d1 = "G";
                d2 = "T";
                    break;
                case "Guerrero":
                d1 = "G";
                d2 = "R";
                    break;
                    
                case "Hidalgo":
                d1 = "H";
                d2 = "G";
                    break;
                    
                case "Jalisco ":
                d1 = "J";
                d2 = "C";
                    break;
                    
                case "Michoacán":
                d1 = "M";
                d2 = "N";
                    break;
                    
                case "Morelos":
                d1 = "M";
                d2 = "S";
                    break;
                    
                case "Nayarit ":
                d1 = "N";
                d2 = "T";
                    break;
                    
                case "Nuevo León ":
                d1 = "N";
                d2 = "L";
                    break;
                    
                case "Oaxaca":
                d1 = "O";
                d2 = "C";
                    break;
                    
                case "Puebla":
                d1 = "P";
                d2 = "L";
                    break;
                    
                case "Querétaro":
                d1 = "Q";
                d2 = "T";
                
                case "Quintana Roo":
                d1 = "Q";
                d2 = "R";
                    break;
                    
                case "San Luis Potosí":
                d1 = "S";
                d2 = "P";
                    break;
                    
                case "Sinaloa":
                d1 = "S";
                d2 = "N";
                    break;
                    
                case "Sonora":
                d1 = "S";
                d2 = "R";
                    break;
                    
                case "Tabasco":
                d1 = "T";
                d2 = "C";
                    break;
                    
                case "Tamaulipas":
                d1 = "T";
                d2 = "S";
                    break;
                    
                case "Tlaxcala":
                d1 = "T";
                d2 = "L";
                
                case "Veracruz ":
                d1 = "V";
                d2 = "Z";
                    break;
                    
                case "Yucatán":
                d1 = "Y";
                d2 = "N";
                    break;
                    
                case "Zacatecas":
                d1 = "Z";
                d2 = "S";
                    break;
                    
                case "Nacido en el Extranjero":
                d1 = "N";
                d2 = "E";
                    break;
                    
                } 
            
        }
}

