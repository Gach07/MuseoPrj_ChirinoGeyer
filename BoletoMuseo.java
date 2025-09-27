import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * Representa un boleto emitido por el museo, con precio, número único y fecha de emisión.
 * Cada boleto se crea con un número consecutivo y una fecha automática.
 * 
 * @author Geyer Chirino
 * @version 1.0
 */
public class BoletoMuseo {

    /**
     * Precio del boleto en colones.
     */
    private double precio;

    /**
     * Número único del boleto.
     */
    private int numeroBoleto;

    /**
     * Fecha de emisión del boleto en formato yyyy-MM-dd.
     */
    private String fechaEmision;

    /**
     * Contador estático para asignar números únicos a cada boleto.
     */
    private static int contador = 0;

    /**
     * Crea un nuevo boleto con el precio indicado.
     * Asigna número consecutivo y fecha de emisión automática.
     * 
     * @param precio Precio del boleto.
     */
    public BoletoMuseo(double precio) {
        this.precio = precio;
        contador++;
        this.numeroBoleto = contador;
        this.fechaEmision = establecerFechaEmisionBoleto();
    }

    /**
     * Establece la fecha de emisión del boleto usando la fecha actual.
     * 
     * @return Fecha de emisión en formato yyyy-MM-dd.
     */
    private String establecerFechaEmisionBoleto() {
        DateTimeFormatter f = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        return LocalDate.now().format(f);
    }

    /**
     * Devuelve el número total de boletos emitidos.
     * 
     * @return Número de boletos creados.
     */
    public static int getContador() {
        return contador;
    }

    /**
     * Devuelve el número único de este boleto.
     * 
     * @return Número del boleto.
     */
    public int getNumeroBoleto() {
        return numeroBoleto;
    }

    /**
     * Devuelve el precio del boleto.
     * 
     * @return Precio en colones.
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * Devuelve un string del boleto, incluyendo número,
     * precio y fecha de emisión.
     * 
     * @return Cadena con los datos del boleto.
     */
    public String toString() {
        String msg = "BoletoMuseo\n";
        msg += " Numero: " + numeroBoleto + "\n";
        msg += " Precio: " + precio + "\n";
        msg += " Fecha Emision: " + fechaEmision;
        return msg;
    }
}