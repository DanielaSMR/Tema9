import java.util.HashMap;

abstract class Electrodomestico {
    private String modelo;
    private int precioBase;
    protected String consumoEnergetico;
    private int peso;
    int numTotal;
    HashMap <String, Integer> calificacion = new HashMap<String, Integer>();
    

    public Electrodomestico(){
        this.modelo = "Desconocido";
        this.precioBase = 100;
        this.consumoEnergetico = "F";
        this.peso = 5;
        numTotal++;
    }

    public Electrodomestico(String modelo, int precioBase, String consumoEnergetico, int peso){
        this.modelo = modelo;
        this.precioBase = precioBase;
        this.consumoEnergetico = consumoEnergetico;
        this.peso = peso;
        numTotal++;
    }

    public void comprobarConsumo(String letra){
        if(!letra.equals("A") || !letra.equals("B") || 
        !letra.equals("C") || !letra.equals("D") || 
        !letra.equals("E") || !letra.equals("F")){
            letra = "F";
        }
        
    }

    public void rellenarLetras(){
        calificacion.put("A", 100);
        calificacion.put("B", 80);
        calificacion.put("C", 60);
        calificacion.put("D", 50);
        calificacion.put("E", 30);
        calificacion.put("F", 10);

    }

    public double incrementoPrecio(){
        int suma = 0;
        int energia = 0;
        for(String i : calificacion.keySet()){
            if (consumoEnergetico == i){
                energia = calificacion.get(i);
            }
        }
        if(peso <= 19){
            suma = energia + 10;
        }else if(peso >= 20 && peso <= 49){
            suma = energia + 50;
        }else if(peso >= 50 && peso <= 79){
            suma = energia + 80;
        }else if(peso >= 80){
            suma = energia + 100;
        }

        return (double) suma;
    }

    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public int getPrecioBase() {
        return precioBase;
    }
    public void setPrecioBase(int precioBase) {
        this.precioBase = precioBase;
    }
    public String getConsumoEnergetico() {
        return consumoEnergetico;
    }
    public void setConsumoEnergetico(String consumoEnergetico) {
        if(consumoEnergetico.equals("A") || consumoEnergetico.equals("B") || 
        consumoEnergetico.equals("C") || consumoEnergetico.equals("D") || 
        consumoEnergetico.equals("E") || consumoEnergetico.equals("F")){
            this.consumoEnergetico = consumoEnergetico;
        }
    }
    public int getPeso() {
        return peso;
    }
    public void setPeso(int peso) {
        this.peso = peso;
    }

    

}
