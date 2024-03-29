import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Ejer2 {
    static ArrayList<Integer> metodos = new ArrayList<Integer>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opciones = 0;
        do{
            System.out.println("\nACCIONES\n" + 
                    "[1] Agregar numero\n" + 
                    "[2] Buscar numero\n" + 
                    "[3] Modificar numero\n" + 
                    "[4] Eliminar numero\n" + 
                    "[5] Insertar numero\n" + 
                    "[6] Mostrar numeros\n" + 
                    "[7] Orden ascendente\n" + 
                    "[8] Orden descendente\n" + 
                    "[9] Salir\n" + 
                    "Introduzca acción (1-9):\n");

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
                    insertarNum();
                    break;
                case 6:
                    mostrarNum();
                    break;
                case 7:
                    ordenarAscNum();
                    break;
                case 8:
                    ordenarDescNum();
                    break;
                case 9:
                    System.out.println("Adios...");
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
        int contador = 0;
        for(int n = 0; n < metodos.size();n++){
            if(metodos.get(n) == buscar){
                System.out.println("Si esta!:D \n Se encuentra en la posicion: " + n);
                break;
            }else
                contador++;
            
            if(contador == metodos.size())
                System.out.println("No esta :,(");
            
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

    public static void insertarNum(){
        Scanner sc5 = new Scanner(System.in);
        System.out.println("Escribe la posicion donde quieres añadirlo \n recuerda que empieza por la posicion 0");
        int posicion = sc5.nextInt();
        metodos.remove(posicion);//remove busca la posicion no el numero
        System.out.println("Dime el numero que quieres añadir");
        int insertar = sc5.nextInt();
        if(posicion == metodos.size()+1){
            metodos.add(insertar);
        }else if(posicion > metodos.size()){
            System.out.println("No es posible");
        }
        else{
            metodos.set(posicion, insertar);
        }

    }

    public static void mostrarNum(){
        for(int n = 0; n < metodos.size();n++){
            System.out.println("posicion [" + n + "] = " + metodos.get(n) + "\n");
        }
    }

    public static void ordenarAscNum(){
        Collections.sort(metodos);
        for(int n = 0; n < metodos.size();n++){
            System.out.println("posicion [" + n + "] = " + metodos.get(n) + "\n");
        }
    }

    public static void ordenarDescNum(){
        Comparator<Integer> comparador = Collections.reverseOrder();
        Collections.sort(metodos, comparador);
        for(int n = 0; n < metodos.size();n++){
            System.out.println("posicion [" + n + "] = " + metodos.get(n) + "\n");
        }
    }
    
}
