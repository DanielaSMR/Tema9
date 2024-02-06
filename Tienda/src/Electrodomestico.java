import java.util.HashMap;

abstract class Electrodomestico {
    private String modelo;
    private int precioBase;
    protected String consumoEnergetico;
    private int peso;
    int numTotal;
    static HashMap<String, Integer> calificacion = new HashMap<>("A",100,"B",80,"C",60,"D",50,"E",30,"F",10);

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
        if(consumoEnergetico.equals('A') || consumoEnergetico.equals('B') || 
        consumoEnergetico.equals('C') || consumoEnergetico.equals('D') || 
        consumoEnergetico.equals('E') || consumoEnergetico.equals('F')){
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
