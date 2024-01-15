import java.util.ArrayList;
import java.util.Scanner;
import java.util.*;

public class main {
    public static void main(String[] args) {
        
        ArrayList<Integer> lista = new ArrayList<Integer>();
        lista = leerValores(lista);
        calcularSuma(lista);
    }   

    public static ArrayList<Integer> leerValores(ArrayList<Integer> listaAr){
        Scanner sc = new Scanner(System.in);
        int s = 0;

        do{
            s = sc.nextInt();

            if(s != 99){
                listaAr.add(s);
            }
        }
        while(s != -99){
            System.out.println("Dame numeros");
            s = sc.nextInt();
            listaAr.add(s);
        }

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
}
