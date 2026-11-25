
import java.time.LocalDateTime;

public class Notificacion {

    protected String mensaje;
    protected LocalDateTime fechaEnvio;

    public Notificacion(String mensaje) {
        this.mensaje = mensaje;
        this.fechaEnvio = LocalDateTime.now();
    }

    public void enviar() {
        System.out.println("Enviando notificación...");
    }

    public void mostrarInformacion() {
        System.out.println("Mensaje: " + mensaje);
        System.out.println("Fecha de creación: " + fechaEnvio);
    }
}
