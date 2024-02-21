package deposito;

/**
 * Clase para gestionar las cuentas bancarias de los clientes.
 * Permite realizar operaciones básicas como consultar el saldo,
 * ingresar y retirar dinero.
 */

public class CCuenta {

    private String nombre; 
    private String cuenta;
    private double saldo;
    private double tipoInteres;

    public CCuenta(){
    	
    }

    /**
     * Constructor con parámetros para inicializar una cuenta.
     * @param nom Nombre del titular de la cuenta.
     * @param cue Número de la cuenta.
     * @param sal Saldo inicial de la cuenta.
     * @param tipo Tipo de interés de la cuenta.
     */
    
    public CCuenta(String nom, String cue, double sal, double tipo){
        this.nombre =nom;
        this.cuenta=cue;
        this.saldo=sal;
    }
    
    /**
     * Devuelve el saldo actual de la cuenta.
     * @return Saldo actual.
     */
    public double estado(){
        return saldo;
    }

    /**
     * Permite ingresar una cantidad de dinero en la cuenta.
     * @param cantidad Cantidad a ingresar.
     * @throws Exception Si la cantidad es negativa.
     */
    public void ingresar(double cantidad) throws Exception{
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        saldo = saldo + cantidad;
    }
    
    /**
     * Permite retirar una cantidad de dinero de la cuenta.
     * @param cantidad Cantidad a retirar.
     * @throws Exception Si la cantidad es negativa o no hay suficiente saldo.
     */

    public void retirar(double cantidad) throws Exception{
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        saldo = saldo - cantidad;
        
    }
}
