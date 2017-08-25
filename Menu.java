/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package inicio;
import java.util.Scanner;
/**
 *
 * @author 22437
 */
public class Menu {
    public Menu(){
        int n;
        Scanner sc = new Scanner(System.in);
	System.out.println("");
        System.out.println("Seleccione una opcion: ");
	System.out.println("1. Inicio Juego ");
	System.out.println("2. Datos del Estudiate");
	System.out.println("3. Historial de partidas jugadas");
	System.out.println("4. Salir");
        n = sc.nextInt();
	switch (n){
        case 1:
            InicioJuego juego = new InicioJuego();
            break;
        case 2:
            Datos run = new Datos();
            break;
        case 3:
            
            System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
            System.out.println("3. Lo sentimos no llegamos hasta este punto");
            System.out.println("\n");
            Menu menu = new    Menu();
            break;
        case 4:
            break;
        default:
            
            System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
            System.out.println("No existe esa opcion");
            System.out.println("\n");
            Menu men = new    Menu();
        }
    
    
    
    
    }
    
    
    
}
