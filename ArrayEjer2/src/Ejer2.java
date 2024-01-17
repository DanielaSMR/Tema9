import java.util.ArrayList;
import java.util.Scanner;

public class Ejer2 {
    static ArrayList<Integer> metodos = new ArrayList<Integer>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opciones = 0;
        do{
            System.out.println("ACCIONES\n" + 
                    "[1] Agregar numero\n" + 
                    "[2] Buscar numero\n" + 
                    "[3] Modificar numero\n" + 
                    "[4] Eliminar numero\n" + 
                    "[5] Insertar numero\n" + 
                    "[6] Mostrar numeros\n" + 
                    "[7] Orden ascendente\n" + 
                    "[8] Orden descendente\n" + 
                    "[9] Salir\n" + 
                    "Introduzca acción (1-9):");

            opciones = sc.nextInt();

            switch (opciones) {
                case 1:
                    agregarNum();
                    break;
                case 2:
                    buscarNum();
                    break;
                case 3:
                    modificarNum();
                    break;
                case 4:
                    eliminaNum();
                    break;
                case 5:
                    
                    break;
                case 6:
                    
                    break;
                case 7:
                    
                    break;
                case 8:
                    
                    break;
                case 9:
                
                    break;
            }


        }
        while (opciones != 9);


    }

    public static void agregarNum(){
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Añade un nuevo num");
        int añadir = sc1.nextInt();
        metodos.add(añadir);
    }

    public static void buscarNum(){
        Scanner sc2 = new Scanner(System.in);
        System.out.println("Escribe el numero que buscas");
        int buscar = sc2.nextInt();
        for(int n = 0; n < metodos.size();n++){
            if(metodos.get(n) == buscar){
                System.out.println("Si esta!:D \n Se encuantra en la posicion: " + n);
            }
        }
    }

    public static void modificarNum(){
        Scanner sc3 = new Scanner(System.in);
        System.out.println("Escribe el numero que deseas quitar");
        int modifica = sc3.nextInt();
        for(int n = 0; n < metodos.size();n++){
            if(metodos.get(n) == modifica){
                System.out.println("Escribe el numero nuevo");
                int nuevo = sc3.nextInt();
                metodos.set(n, nuevo);
            }
        }
    }

    public static void eliminaNum(){
        Scanner sc4 = new Scanner(System.in);
        System.out.println("Escribe el numero que quieres eliminar");
        int eliminar = sc4.nextInt();
        metodos.remove(metodos.indexOf(eliminar));
    }



    
}
