import java.util.*;

public class main {
    static ArrayList<persona> personas = new ArrayList<persona>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opciones = 0;
        do{
            System.out.println("\nACCIONES\n" + 
                    "[1] Buscar persona\n" + 
                    "[2] Eliminar numero\n" + 
                    "[3] Orden por apellido\n" + 
                    "[4] Añadir persona\n" + 
                    "[5] Salir\n" +
                    "Introduzca acción (1-5):\n");

            opciones = sc.nextInt();

            switch (opciones) {
                case 1:
                    buscarNum();
                    break;
                case 2:
                    eliminaNum();
                    break;
                case 3:
                    comparador();
                    break;
                case 4:
                    agregarNum();
                    break;
                case 5:
                    System.out.println("Adios...");
                    break;
                   
            }


        }
        while (opciones != 5);

    }

        public static void agregarNum(){
            Scanner sc1 = new Scanner(System.in);
            System.out.println("Añade el dni");
            int dni = sc1.nextInt();
            System.out.println("Añade el apellido");
            String apellido = sc1.nextLine();
            String apellido2 = sc1.nextLine();
            System.out.println("Añade el nombre");
            String nombre = sc1.nextLine();
            System.out.println("Añade el sexo");
            String sexo = sc1.nextLine();
            System.out.println("Añade el edad");
            int edad = sc1.nextInt();
            System.out.println("Añade el peso");
            int peso = sc1.nextInt();

            personas.add(new persona(dni, apellido2, nombre, sexo, edad, peso));
            
        }

        public static void buscarNum(){
            Scanner sc2 = new Scanner(System.in);
            System.out.println("Escribe el dni");
            int buscar = sc2.nextInt();
            int contador = 0;

            persona pro = new persona(0, null, null, null, 0,0);
            pro = personas.get(0); 
            for (persona person: personas) 
                if(person.getDni() == buscar) 
                    pro = person;
                contador++;
                if(contador == personas.size())
                    System.out.println("No esta :,(");
        
            System.out.println("La posicion es " + contador);
            System.out.println( pro );
        }

        public static void eliminaNum(){
            Scanner sc4 = new Scanner(System.in);
            System.out.println("Escribe el numero que quieres eliminar");
            int eliminar = sc4.nextInt();
            int contador = 0;

            for (persona person: personas) 
                if(person.getDni() == eliminar) 
                    personas.remove(person);
                contador++;
                if(contador == personas.size())
                    System.out.println("No esta :,(");
        
        }

        public static void comparador(){
        Comparator<persona> cm2=Comparator.comparing(persona::getApellido,String.CASE_INSENSITIVE_ORDER);  
            Collections.sort(personas,cm2);
            System.out.println(personas);
        }

}
