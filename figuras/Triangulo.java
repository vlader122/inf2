public class Triangulo implements IFigura {
    private Double lado;
    private Double altura;

    public Triangulo(Double lado,Double altura){
        this.lado = lado;
        this.altura = altura;
    }

    @Override
    public void calcular_area() {
        System.out.println("El area del Triangulo es: "+ (this.lado*this.altura)/2);
    }

    @Override
    public void calcular_perimetro() {
        System.out.println("El perimetro del Triangulo es: "+ (3*this.lado));
    }

}
