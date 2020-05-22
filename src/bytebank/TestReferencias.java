package bytebank;

public class TestReferencias {

    public static void main(String[] args) {
        Cuenta primeraCuenta = new Cuenta();
        primeraCuenta.saldo = 300;

        System.out.println("saldo de primera cuenta : " + primeraCuenta.saldo);

        Cuenta segundaCuenta = primeraCuenta;

        System.out.println("saldo de segunda Cuenta: " + segundaCuenta.saldo);

        segundaCuenta.saldo += 100;
        System.out.println("saldo de segunda Cuenta " + segundaCuenta.saldo);

        System.out.println(primeraCuenta.saldo);

        if(primeraCuenta == segundaCuenta) {
            System.out.println("Es la misma cuenta");
        }

        System.out.println(primeraCuenta);
        System.out.println(segundaCuenta);
    }
    
}
