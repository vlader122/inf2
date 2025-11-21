public class Circulo implements IFigura{
    private Double radio;

    public Circulo(Double radio){
        this.radio = radio;
    }
    
    @Override
    public void calcular_area() {
        System.out.println("El area del Circulo es: "+ (Math.PI*this.radio*this.radio));
    }

    @Override
    public void calcular_perimetro() {
        System.out.println("El perimetro del Circulo es: "+ (2*Math.PI*this.radio));
    }

}
