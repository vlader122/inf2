public class Main {
    public static void main(String[] args) {
        Cuadrado cuadrado = new Cuadrado(5.5);
        cuadrado.calcular_area();
        cuadrado.calcular_perimetro();
        Circulo circulo = new Circulo(5.0);
        circulo.calcular_area();
        circulo.calcular_perimetro();
        Triangulo triangulo = new Triangulo(5.0, 4.0);
        triangulo.calcular_area();
        triangulo.calcular_perimetro();
    }
}
