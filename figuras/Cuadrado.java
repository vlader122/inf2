public class Cuadrado implements IFigura{
    private Double lado;

    public Cuadrado(Double lado){
        this.lado = lado;
    }

    @Override
    public void calcular_area() {
        System.out.println("El area del cuadrado es: "+ (this.lado*this.lado));
    }

    @Override
    public void calcular_perimetro() {
        System.out.println("El perimetro del cuadrado es: "+ (this.lado*4));
    }

}
