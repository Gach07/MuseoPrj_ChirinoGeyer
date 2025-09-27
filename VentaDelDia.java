import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

/**
 * Representa la venta de boletos realizada en un día específico.
 * Almacena la fecha de la venta y la lista de boletos vendidos.
 * Permite registrar boletos y calcular el total de ingresos.
 * 
 * @author Geyer Chirino
 * @version 1.0
 */
public class VentaDelDia {

    /**
     * Fecha en que se realizó la venta.
     */
    private String fechaDeLaVenta;

    /**
     * Lista de boletos vendidos durante el día.
     */
    private List<BoletoMuseo> boletosVendidos;

    /**
     * Crea una nueva instancia de venta del día con la fecha actual
     * y una lista vacía de boletos vendidos.
     */
    public VentaDelDia() {
        fechaDeLaVenta = establecerFechaDeLaVenta();
        boletosVendidos = new ArrayList<>();
    }

    /**
     * Registra un boleto como parte de la venta del día.
     * 
     * @param boleto Boleto vendido que se agregará a la lista.
     */
    public void registrarVentaBoleto(BoletoMuseo boleto) {
        boletosVendidos.add(boleto);
    }

    /**
     * Calcula el total de ingresos generados por la venta del día.
     * 
     * @return Suma de los precios de todos los boletos vendidos.
     */
    public double calcularTotalVentaDelDia() {
        double total = 0.0;
        for (BoletoMuseo b : boletosVendidos) {
            total += b.getPrecio();
        }
        return total;
    }

    /**
     * Establece la fecha de la venta usando la fecha actual.
     * 
     * @return Fecha en formato yyyy-MM-dd.
     */
    private String establecerFechaDeLaVenta() {
        DateTimeFormatter f = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        return LocalDate.now().format(f);
    }

    /**
     * Devuelve un string de la venta del día,
     * incluyendo fecha, cantidad de boletos, detalle de cada boleto
     * y el total de ingresos.
     * 
     * @return Cadena con la información de la venta.
     */
    public String toString() {
        String msg = "VentaDelDia\n";
        msg += " Fecha: " + fechaDeLaVenta + "\n";
        msg += " Cantidad de boletos: " + boletosVendidos.size() + "\n";
        msg += " Detalle:\n";
        for (BoletoMuseo b : boletosVendidos) {
            msg += " - Boleto #" + b.getNumeroBoleto() + " | " + b.getPrecio() + "\n";
        }
        msg += " Total: " + calcularTotalVentaDelDia();
        return msg;
    }
}