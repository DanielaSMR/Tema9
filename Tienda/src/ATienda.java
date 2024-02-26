import java.util.ArrayList;
import java.util.Scanner;

public class ATienda {
    ArrayList<Lavadora> lavs = new ArrayList<Lavadora>();//hacer dinamico
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
                    "[6] Salir\n"+
                    "Introduzca acción (1-6):\n");

            opciones = sc.nextInt();

            switch (opciones) {
                case 1:
                    agregarLav();
                    break;
                case 2:
                    buscarLav();
                    break;
                /*case 3:
                    modificarLav();
                    break;*/
                case 4:
                    eliminarLav();
                    break;
                case 5:
                    mostrar();
                    break;
                case 6:
                    System.out.println("Adios...");
                    break;
                   
            }


        }
        while (opciones != 7);

    }

    public static void agregarLav(){
        System.out.println("Quieres poner informacion a la lavadora? 1-Si 2-No");
        int decidir = sc.nextInt();
        if(decidir == 1){
            System.out.println("Modelo");
            String modelo = sc.nextLine();
            String modelo2 = sc.nextLine();
            System.out.println("PrecioBase");
            int precioBase = sc.nextInt();
            System.out.println("ConsumoEnergetico (Solo del A-F)");
            String consumo = sc.nextLine();
            String consumo2 = sc.nextLine();
            System.out.println("Peso");
            int peso = sc.nextInt();
            System.out.println("Carga");
            int carga = sc.nextInt();

            lavs.add(new Lavadora(carga, modelo2, precioBase, consumo2, peso));
        }

        lavs.add(new Lavadora());

    }

    public static void buscarLav(){
        System.out.println("Escribe el modelo que buscas");
        String buscar = sc.nextLine();
        String buscar2 = sc.nextLine();

        for(int n = 0; n < lavs.size();n++){
            if(lavs.get(n).getModelo().equals(buscar2)){
                System.out.println("Esta es la informacion sobre el modelo encontrado: \t");
                System.out.println(lavs.get(n));
            }
        }

    }


    public static void modificarLav(){
        System.out.println("Escribe el modelo que deseas modificar el precio");
        String modifi = sc.nextLine();
        String modifi2 = sc.nextLine();

        for(int n = 0; n < lavs.size();n++){
            if(lavs.get(n).getModelo().equals(modifi2)){
                System.out.println("Esta es la informacion sobre el modelo encontrado: \t");
                System.out.println(lavs.get(n));

                System.out.println("Escribe el precio nuevo: ");
                int precio = sc.nextInt();

                lavs.add(n, lavs.get(n));//error
                
                System.out.println("Informacion actualizada: ");
                System.out.println(lavs.get(n));

            }
        }



    }

    public static void eliminarLav(){

        System.out.println("Escribe el modelo que quieres eliminar");
        String buscar = sc.nextLine();
        String eliminar = sc.nextLine();

        for(int n = 0; n < lavs.size();n++){
            if(lavs.get(n).getModelo().equals(eliminar)){
                System.out.println("Esta es la informacion sobre el modelo encontrado: \t");
                System.out.println(lavs.get(n));

                lavs.remove(n);
                System.out.println("Eliminado");
            }
        }


    }

    public static void mostrar(){

        for(int n = 0; n < lavs.size();n++){
            System.out.println(lavs.get(n));
        }

    }


}
