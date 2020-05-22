package bytebank;

public class TestCuentaSinCliente {

    public static void main(String[] args) {
        Cuenta cuentaDeJimena = new Cuenta();
        System.out.println(cuentaDeJimena.saldo);

        // Descomentar esta linea para evitar el NullPointerException
        // cuentaDeJimena.titular = new Cliente();

        System.out.println(cuentaDeJimena.titular);

        cuentaDeJimena.titular.nombre = "Jimena";
        System.out.println(cuentaDeJimena.titular.nombre);
    }
}
