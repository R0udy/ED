package deposito;

public class Main {

	public static void main(String[] args) {
		CCuenta cuenta1;
		cuenta1 = new CCuenta("Roman Matas","1000-2365-85-1230456789",2500,0);

        double saldoActual;
        
        saldoActual = cuenta1.estado();
        System.out.println("El saldo actual es"+ saldoActual );

        operativa_cuenta(0, cuenta1);
    }
	
	public static void operativa_cuenta(float cantidad, CCuenta cuenta1) {
	    System.out.println("El saldo actual es" + cuenta1.estado());

	    try {
	        cuenta1.retirar(cantidad);
	    } catch (Exception e) {
	        System.out.print("Fallo al retirar");
	    }
	    try {
	        System.out.println("Ingreso en cuenta");
	        cuenta1.ingresar(cantidad);
	    } catch (Exception e) {
	        System.out.print("Fallo al ingresar");
	    }
	}

}
