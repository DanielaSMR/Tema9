public class Lavadora extends Electrodomestico {
    private int carga = 5;

    public Lavadora() {
        super();
    }

    public Lavadora(int carga, String modelo, int precioBase, String consumoEnergetico, int peso) {
        super(modelo, precioBase, consumoEnergetico, peso);
        this.carga = carga;
    }

    public Lavadora(Lavadora copiaLav) {
        super(copiaLav.getModelo(), copiaLav.getPrecioBase(), copiaLav.getConsumoEnergetico(), copiaLav.getPeso());
        carga = copiaLav.carga;

    }

    public double precioFinal() {
        double precio;
        if (carga > 30) {
            precio = incrementoPrecio() + 50;
        } else {
            precio = incrementoPrecio();
        }

        return precio;
    }

    @Override
    public String toString() {
        String texto = " La carga es: " + carga + "\n El precio Final es: " + precioFinal();
        return super.toString() + texto;
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }

}
