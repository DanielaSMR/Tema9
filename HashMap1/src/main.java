import java.util.*;

public class main {
    static HashMap <String, Integer> agenda = new HashMap<String, Integer>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opciones = 0;
        do{
            System.out.println("\nACCIONES\n" + 
                    "[1] Agregar numero\n" + 
                    "[2] Consultar numeros agendados\n" + 
                    "[3] Buscar numero por nombre\n" +
                    "[4] Modificar numero\n" + 
                    "[5] Buscar nombre por numero\n" +
                    "[6] Eliminar numero\n" + 
                    "[7] Mostrar contenido de la agenda\n" + 
                    "[8] Mostrar numeros de amigos\n" + 
                    "[9] Orden por nombre\n" + 
                    "[10] Orden por numeros\n" + 
                    "[11] Salir\n" + 
                    "Introduzca acción (1-9):\n");

            opciones = sc.nextInt();

            switch (opciones) {
                case 1:
                    agregarNum();
                    break;
                case 2:
                    consultarNum();
                    break;
                case 3:
                    buscarNum();
                    break;
                case 4:
                    modificarNum();
                    break;
                case 5:
    
                    break;
                case 6:
                    eliminaNum();
                    mostrarNum();
                    break;
                case 7:
                    ordenarAscNum();
                    break;
                case 8:
                    ordenarDescNum();
                    break;
                case 9:
                    break;
                case 10:
                    break;
                case 11:
                    System.out.println("Adios...");
                    break;
            }


        }
        while (opciones != 9);


    }

    public static void agregarNum(){
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Añade el nombre");
        String nom = sc1.nextLine();
        System.out.println("Añade el numero");
        Integer num = sc1.nextInt();
        agenda.put(nom,num);
    }

    public static void consultarNum(){
        
        for(String i : agenda.keySet()){
            if(i.equals("")){

            }else{
                System.out.println("Nombre: " + i + "Numero: " + agenda.get(i));
            }
        }
    }
    

    public static void buscarNum(){
        Scanner sc2 = new Scanner(System.in);
        System.out.println("Escribe el nombre del telefono que buscas");
        String nom = sc2.nextLine();
        for(String i : agenda.keySet()){
            if(i.equals(nom)){
                System.out.println("El numero de " + i + "es " + agenda.get(i));
            }
        }

    }

    
    public static void modificarNum(){
        Scanner sc3 = new Scanner(System.in);
        System.out.println("Escribe el nombre de quien quieres modificar");
        String nom = sc3.nextLine();
        System.out.println("Escribe el numero nuevo");
        Integer num = sc3.nextInt();

        agenda.remove(nom);
        agenda.put(nom, num);

    }


}
