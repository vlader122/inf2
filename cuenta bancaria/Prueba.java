public class Prueba
{
    public static void main(String[] args)
    {
        CuentaBancaria miCuenta = new CuentaBancaria();
        miCuenta.nro_cuenta = "12315465";
        miCuenta.titular = "Niver Copa";

        miCuenta.aumentarLimite(5000);
        miCuenta.depositar(3500.0);
        miCuenta.retiro(3100.0);
        miCuenta.depositar(100.0);
    }
}