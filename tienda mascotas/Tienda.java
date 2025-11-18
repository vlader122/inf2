public class Tienda {
    public static void main(String[] args)
    {
        Gato gato = new Gato();
        gato.comer();
        gato.hablar();
        Perro perro = new Perro();
        perro.comer();
        perro.hablar();
        Loro loro = new Loro();
        loro.volar();
        Guacamayo guaca = new Guacamayo();
        guaca.volar();
    }
}
