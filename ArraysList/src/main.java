import java.util.ArrayList;
import java.util.Scanner;
import java.util.*;

public class main {
    public static void main(String[] args) {
        
        ArrayList<Integer> lista = new ArrayList<Integer>();
        lista = leerValores(lista);
        int suma = calcularSuma(lista);
        int media = suma/lista.size();
        mostrarResultados(lista, suma, media);
    }   

    public static ArrayList<Integer> leerValores(ArrayList<Integer> listaAr){
        Scanner sc = new Scanner(System.in);
        int s = 0;

        do{
            System.out.println("Añade un numeros, si quieres terminar escribe -99");
            s = sc.nextInt();

            if(s != -99){
                listaAr.add(s);
            }
        }
        while(s != -99);
        
        System.out.println("los numeros son: ");
        for(int n = 0; n < listaAr.size();n++){
            System.out.println(listaAr.get(n));
        }
        return listaAr;
    }

    public static int calcularSuma(ArrayList<Integer> listaAr){
        Iterator <Integer> it = listaAr.iterator();
        int suma = 0;
        while(it.hasNext()){
            suma = suma + it.next();
        }
        return suma;
    }

    public static String mostrarResultados(ArrayList<Integer> listaAr,int suma,int media){
        int contador = 0;
        for(int n = 0; n < listaAr.size();n++){
            if(listaAr.get(n) > media){
                contador++;
            }
        }
        System.out.println("Los numeros son: ");
        for(int n = 0; n < listaAr.size();n++){
            System.out.println(listaAr.get(n));
        }
        System.out.println("La suma total es: " + suma
                            + "\nLa media total es: " + media
                            + "\nLa cantidad de numeros superior a la media son: " + contador);
        return " ";
    }
}
