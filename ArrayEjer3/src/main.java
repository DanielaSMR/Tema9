import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Alumno> alumnos = new ArrayList<Alumno>();
        String nombre;
        Double nota;
        
        System.out.println("Cuantos alumnos vas a meter?");
        int contador = sc.nextInt();

        for(int u = 0; u == contador; u++){
            nombre = sc.nextLine();
            nota = sc.nextDouble();
            alumnos.add(new Alumno(nombre, nota));
        }

        System.out.println("Esto son los alumnos ordenador por nombre");
        /*@Override
        Collections.sort(alumnos){
            
        }

        System.out.println();

        /*Collections.sort(alumnos, new Comparator<Alumno>(){
            public Alumno compare(Alumno a1, Alumno a2){
                if( a1.getNota() > a2.getNota()){
                    return a1;
                }else{
                    return a2;
                }
            }
        });*/

        System.out.println(alumnos);
    }

    
}
