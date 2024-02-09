import java.util.ArrayList;
import java.util.Scanner;

public class ATienda {
    static ArrayList<Lavadora> lavs = new ArrayList<Lavadora>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int opciones = 0;
        do{
            System.out.println("\nACCIONES\n" + 
                    "[1] Agregar Lavadoras\n" + 
                    "[2] Buscar una lavadora determinada por el modelo\n" + 
                    "[3] Modificar el precio base de una lavadora determinada por el modelo y mostrarla\n" + 
                    "[4] Eliminar una lavadora determinada por el modelo\n" + 
                    "[5] Mostrar todas las lavadoras\n" +
                    "[6] Mostrar numero de lavadoras\n" +
                    "[7] Salir\n"+
                    "Introduzca acción (1-7):\n");

            opciones = sc.nextInt();

            switch (opciones) {
                case 1:
                    agregarLav();
                    break;
                case 2:
                    buscarLav();
                    break;
                case 3:
                    modificarLav();
                    break;
                case 4:
                    eliminarLav();
                    break;
                case 5:
                    mostrar();
                    break;
                case 6:
                    mostrarLavs();
                    break;
                case 7:
                    System.out.println("Adios...");
                    break;
                   
            }


        }
        while (opciones != 5);

    }

    public static void agregarLav(){
        System.out.println("Quieres poner informacion a la lavadora? 1-Si 2-No");
        int decidir = sc.nextInt();
        if(decidir == 1){
            System.out.println("Modelo");
            String modelo = sc.nextLine();
            System.out.println("PrecioBase");
            int precioBase = sc.nextInt();
            System.out.println("ConsumoEnergetico (Solo del A-F)");
            String consumo = sc.nextLine();
            System.out.println("Peso");
            int peso = sc.nextInt();
            System.out.println("Carga");
            int carga = sc.nextInt();

            lavs.add(new Lavadora(carga, modelo, precioBase, consumo, peso));
        }

        lavs.add(new Lavadora());

    }

    public static void buscarLav(){
        System.out.println("Escribe el modelo que buscas");
        String buscar = sc.nextLine();

        for(int n = 0; n < lavs.size();n++){
            if(lavs)
            System.out.println(lavs.get(n));
        }

    }



}
