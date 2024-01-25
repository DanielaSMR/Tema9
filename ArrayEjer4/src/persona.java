public class persona {
    private int dni;
    private String apellido;
    private String nombre;
    private String sexo;
    private int edad;
    private double peso;

    public persona(int dni, String apellido, String nombre, String sexo, int edad, double peso){
        this.dni = dni;
        this.apellido = apellido;
        this.nombre = nombre;
        this.sexo = sexo;
        this.edad = edad;
        this.peso = peso;

    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    

}
