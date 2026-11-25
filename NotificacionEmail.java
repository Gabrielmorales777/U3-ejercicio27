
public class NotificacionEmail extends Notificacion {

    private String direccionCorreo;

    public NotificacionEmail(String mensaje, String direccionCorreo) {
        super(mensaje);
        this.direccionCorreo = direccionCorreo;
    }

    @Override
    public void enviar() {
        System.out.println("=== ENVÍO POR EMAIL ===");
        System.out.println("Destinatario: " + direccionCorreo);
        System.out.println("Asunto: Notificación corporativa");
        System.out.println("Enviando correo electrónico...");
        System.out.println("Mensaje: " + mensaje);
        System.out.println("Email enviado correctamente.");
    }
}
