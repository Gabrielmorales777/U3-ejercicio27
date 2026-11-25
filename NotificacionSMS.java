
public class NotificacionSMS extends Notificacion {

    private String numeroTelefono;

    public NotificacionSMS(String mensaje, String numeroTelefono) {
        super(mensaje);
        this.numeroTelefono = numeroTelefono;
    }

    @Override
    public void enviar() {
        System.out.println("=== ENVÍO POR SMS ===");
        System.out.println("Teléfono: " + numeroTelefono);
        System.out.println("Conectando con la red móvil...");
        System.out.println("Mensaje: " + mensaje);
        System.out.println("SMS enviado correctamente.");
    }
}
