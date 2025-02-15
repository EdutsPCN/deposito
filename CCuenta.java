package cuentas;

/**
 * Clase que representa una cuenta bancaria con operaciones básicas
 * como ingresar y retirar dinero.
 */
public class CCuenta {

    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInteres;

    /**
     * Constructor por defecto de la clase CCuenta.
     */
    public CCuenta() {}

    /**
     * Constructor con parámetros de la clase CCuenta.
     * @param nom Nombre del titular de la cuenta.
     * @param cue Número de cuenta bancaria.
     * @param sal Saldo inicial de la cuenta.
     * @param tipo Tipo de interés aplicado a la cuenta.
     */
    public CCuenta(String nom, String cue, double sal, double tipo) {
        this.nombre = nom;
        this.cuenta = cue;
        this.saldo = sal;
        this.tipoInteres = tipo;
    }

    /**
     * Obtiene el nombre del titular de la cuenta.
     * @return Nombre del titular.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del titular de la cuenta.
     * @param nombre Nuevo nombre del titular.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene el número de cuenta bancaria.
     * @return Número de cuenta.
     */
    public String getCuenta() {
        return cuenta;
    }

    /**
     * Establece el número de cuenta bancaria.
     * @param cuenta Nuevo número de cuenta.
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * Obtiene el saldo actual de la cuenta.
     * @return Saldo de la cuenta.
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * Establece un nuevo saldo en la cuenta.
     * @param saldo Nuevo saldo de la cuenta.
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * Obtiene el tipo de interés de la cuenta.
     * @return Tipo de interés.
     */
    public double getTipoInteres() {
        return tipoInteres;
    }

    /**
     * Establece el tipo de interés de la cuenta.
     * @param tipoInteres Nuevo tipo de interés.
     */
    public void setTipoInteres(double tipoInteres) {
        this.tipoInteres = tipoInteres;
    }

    /**
     * Ingresa una cantidad de dinero en la cuenta.
     * @param cantidad Monto a ingresar.
     * @throws Exception Si la cantidad es negativa.
     */
    public void ingresar(double cantidad) throws Exception {
        if (cantidad < 0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        saldo += cantidad;
    }

    /**
     * Retira una cantidad de dinero de la cuenta.
     * @param cantidad Monto a retirar.
     * @throws Exception Si la cantidad es negativa o mayor al saldo disponible.
     */
    public void retirar(double cantidad) throws Exception {
        if (cantidad <= 0)
            throw new Exception("No se puede retirar una cantidad negativa");
        if (saldo < cantidad)
            throw new Exception("No hay suficiente saldo");
        saldo -= cantidad;
    }
}