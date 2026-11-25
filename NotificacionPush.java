
public class NotificacionPush extends Notificacion {

    private String identificadorDispositivo;

    public NotificacionPush(String mensaje, String identificadorDispositivo) {
        super(mensaje);
        this.identificadorDispositivo = identificadorDispositivo;
    }

    @Override
    public void enviar() {
        System.out.println("=== ENVÍO POR PUSH ===");
        System.out.println("Dispositivo: " + identificadorDispositivo);
        System.out.println("Conectando con el servicio de notificaciones...");
        System.out.println("Mensaje: " + mensaje);
        System.out.println("Notificación push enviada correctamente.");
    }
}
