public class Lavadora extends Electrodomestico{
    private int carga;
    
    public Lavadora(){

    }

    public Lavadora(int carga,String modelo, int precioBase, String consumoEnergetico, int peso){
        super(modelo,precioBase,consumoEnergetico,peso);
        this.carga = carga;
    }


    public Lavadora(Lavadora copiaLav,String modelo, int precioBase, String consumoEnergetico, int peso){
        super(modelo,precioBase,consumoEnergetico,peso);
        carga = copiaLav.carga;
        

    }
}
