public class Main {
    public static void main(String[] args)
    {
        Robot pepito = new Robot("Pepito");
        Robot juancito = new Robot("Juancito");
        
        juancito.defender();
        pepito.atacar(juancito);

    }
}
