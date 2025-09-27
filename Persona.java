/**
 * Representa una persona que visita el museo y puede tener asignado un boleto.
 * Contiene información básica como nombre e identificación, así como una referencia
 * al boleto asignado.
 * 
 * @author Geyer Chirino
 * @version 1.0
 */
public class Persona {

    /**
     * Nombre de la persona.
     */
    private String nombre;

    /**
     * Identificación oficial de la persona.
     */
    private String identificacion;

    /**
     * Boleto asignado a la persona.
     */
    private BoletoMuseo miBoleto;

    /**
     * Crea una persona con nombre e identificación.
     * 
     * @param nombre Nombre de la persona.
     * @param ident Identificación oficial de la persona.
     */
    public Persona(String nombre, String ident) {
        this(nombre);
        identificacion = ident;
    }

    /**
     * Crea una persona con solo el nombre.
     * 
     * @param nombre Nombre de la persona.
     */
    public Persona(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Asigna una nueva identificación a la persona.
     * 
     * @param pIdentificacion Nueva identificación.
     */
    public void setIdentificacion(String pIdentificacion) {
        identificacion = pIdentificacion;
    }

    /**
     * Asigna un boleto a la persona.
     * 
     * @param pMiBoleto Boleto que se asignará.
     */
    public void asignarBoleto(BoletoMuseo pMiBoleto) {
        miBoleto = pMiBoleto;
    }

    /**
     * Consulta el número del boleto asignado a la persona.
     * 
     * @return Número del boleto asignado.
     */
    public int consultarMiNumeroDeBoleto() {
        return miBoleto.getNumeroBoleto();
    }

    /**
     * Devuelve un string de la info de la persona, incluyendo
     * nombre, identificación y estado del boleto asignado.
     * 
     * @return Cadena con la información de la persona.
     */
    public String toString() {
        String msg = "Persona\n";
        msg += " Nombre: " + nombre + "\n";
        msg += " Identificacion: " + identificacion + "\n";

        if (miBoleto != null) {
            msg += " Boleto asignado: #" + miBoleto.getNumeroBoleto() + "\n";
        } else {
            msg += " Boleto asignado: (ninguno)\n";
        }

        return msg;
    }
}
