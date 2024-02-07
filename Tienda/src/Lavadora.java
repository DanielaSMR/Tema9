public class Lavadora extends Electrodomestico{
    private int carga;
    
    public Lavadora(){

    }

    public Lavadora(int carga,String modelo, int precioBase, String consumoEnergetico, int peso){
        super(modelo,precioBase,consumoEnergetico,peso);
        this.carga = carga;
    }


    
    @Override
    protected Object clone() throws CloneNotSupportedException {
    
      Lavadora nueva= new Lavadora (this.carga,);
      return nueva;
    }


    public Lavadora(Lavadora copiaLav){
        
        carga = copiaLav.carga;
        

    }
}
