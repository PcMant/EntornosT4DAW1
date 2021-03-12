package cuentas;

/**
 * Esta clase contiene los métodos de las acciones que puede hacer una cuenta bancaria.
 * @author Normal User
 *
 */
public class CCuenta {


    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInteres;

    /**
     * Contructor sin recibir parámetros.
     */
    public CCuenta() {}

    /**
     * Constructor que recibe los siguientes parámetros:
     * @param nom - nombre
     * @param cue - ciemta
     * @param sal - saldo
     * @param tipo - tipoInteres
     */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }

    /**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the cuenta
	 */
	public String getCuenta() {
		return cuenta;
	}

	/**
	 * @param cuenta the cuenta to set
	 */
	public void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}

	/**
	 * @return the saldo
	 */
	public double getSaldo() {
		return saldo;
	}

	/**
	 * @param saldo the saldo to set
	 */
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	/**
	 * @return the tipoInteres
	 */
	public double getTipoInteres() {
		return tipoInteres;
	}

	/**
	 * @param tipoInteres the tipoInteres to set
	 */
	public void setTipoInteres(double tipoInteres) {
		this.tipoInteres = tipoInteres;
	}

	/**
	 * @return el saldo
	 */
	public double estado()
    {
        return saldo;
    }

    /**
     * Método que hace un ingreso de dinero a la cuenta bancaria y comprueba que no se ingresa una cantidad negativa.
     * @param cantidad - Cantidad de dinero ingresada a la cuenta bancacaria
     * @throws Exception
     */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        saldo = saldo + cantidad;
    }

    /**
     * Método que hace retirada de dinero de la cuenta bancaria y comprueba que no se retire una cantidad negativa.
     * @param cantidad - Cantidad de dinero a retirar de la cuenta bancaria
     * @throws Exception
     */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        saldo = saldo - cantidad;
    }
    
    /**
     * Método que ejecuta las instrucciones del método main de la clase Main.
     * @param cantidad
     */
    public void operativa_cuenta(float cantidad){
    	
    	Main.main(null);
    	
    }
}
