/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inicio;
import com.sun.xml.internal.ws.encoding.SwACodec;
import java.util.Scanner;
/**
 *
 * @author 22437
 */
public class InicioJuego {

    
    public InicioJuego(){
    llenarMatriz();
    }

    public static String llenarMatriz(){
         int mat[][];
         String frut[][];
         int a, b, sk;
         String nombre;
         Scanner sc = new Scanner(System.in);
         System.out.println("Nombre del Jugador:");
         nombre = sc.nextLine();
         System.out.println("Ingrese x:");
         a = sc.nextInt();
         System.out.println("Ingrese y:");
         b = sc.nextInt();
         System.out.println("Ingrese valor de Snake:");
         sk = sc.nextInt();

         mat = new int[a][b];

           llenarMatriz2(mat = new int[a][b],a, b, nombre);
        frut = new String[a][b];   
        fruto(frut = new String[a][b],a);
 return"";
    }
    public static void limpiaPantalla(int lineas){
        for(int i = 0; i<lineas;i++){
            System.out.println("");
            
        }
        llenarMatriz();
    
    }
    public static String llenarMatriz2(int[][] mat,int a, int b, String  nombre){
       // limpiaPantalla();
        
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        System.out.println("Bienvenido: "+nombre);
         for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {

mat[i][j]=0;
             }

            }
String parederecha="";
  String raya="";
    String fila="";
             for (int i = 0; i < a; i++) {
                 if(i==0){
                   
                   
                     for (int u = 0; u < b; u++) {
                           
                         if(u<10){
                           fila+=u+"       ";    
                         }
                         if((u>=10)&&(u<100)){
                               fila+=u+"        ";     
                         }
                         if(u>=100){
                           fila+=u+"        ";      
                         }
                          
                         raya+="________";
                         parederecha+="\t"+"    "+"|";
                     }
                     System.out.println("\t"+fila+"\n"+"     "+raya);  
                     
                        
                 }
                 
               
                
                 // System.out.println(""+i+"|"); 
            for (int j = 0; j < b; j++) {
if(j==0){
    if(i<10){
      System.out.print(i + "   "+"|");     
    }
    if(i>=10){
      System.out.print(i + "  "+"|");    
    }
              
            }
 System.out.print("\t"+ "    | ");

 if(j==b-1){
     System.out.println("\n"+"    "+"|"+parederecha);
 }
            }

        }
             System.out.println("      "+raya);
             
             
        return"";
        
    }
    
        public static int snake(String[][] Tablero, int h, int t){
      
         Scanner ingreso = new Scanner(System.in);
         int a = 0,b = 0;
            System.out.println("Ingrese la posiocion del Snake en x");
            a= ingreso.nextInt();
            System.out.println("Ingrese la posiocion del Snake en y");
            b= ingreso.nextInt();
            
         
                 
         if(Tablero[a-1][b-1].equals("*"))
         {
            h ++;
            System.out.println("x");
            Tablero[a-1][b-1] = "x";
         }
         else
         {
            System.out.println("");
            Tablero[a-1][b-1] = "x";
         }
         return h;
}
    
           public static void fruto(String[][] tablero,int dimension){
         if(Math.random() < 0.5)
         {
            int a = (int)(Math.random()*7); 
            int b = (int)(Math.random()*5);
            
            for(int i = 0; i<dimension; i++)
            {
               tablero[a][b+i] = "*";
            }
         }
         else
         {
            int a = (int)(Math.random()*7); 
            int b = (int)(Math.random()*5);
            for(int i = 0; i<dimension; i++)
            {
               tablero[a+i][b] = "*";
            }
         }
      }
    
    }
   

