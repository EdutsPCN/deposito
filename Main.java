package cuentas;

public class Main {

    public static void main(String[] args) {
        CCuenta cuenta1 = new CCuenta("Antonio López", "1000-2365-85-1230456789", 2500, 0);
        operativa_cuenta(cuenta1, 2300);
    }

    public static void operativa_cuenta(CCuenta cuenta1, float cantidad) {
        System.out.println("Saldo actual: " + cuenta1.getSaldo());

        try {
            cuenta1.retirar(cantidad);
            System.out.println("Retirada de " + cantidad + " realizada con éxito.");
        } catch (Exception e) {
            System.out.println("Fallo al retirar: " + e.getMessage());
        }

        try {
            cuenta1.ingresar(cantidad);
            System.out.println("Ingreso de " + cantidad + " realizado con éxito.");
        } catch (Exception e) {
            System.out.println("Fallo al ingresar: " + e.getMessage());
        }

        System.out.println("Saldo final: " + cuenta1.getSaldo());
    }
}
