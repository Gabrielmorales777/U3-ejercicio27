
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Notificacion> notificaciones = new ArrayList<>();

        NotificacionEmail email = new NotificacionEmail(
                "La reunión comenzará a las 10:00.",
                "usuario@empresa.com"
        );

        NotificacionSMS sms = new NotificacionSMS(
                "Su código de verificación es 4582.",
                "+5492611234567"
        );

        NotificacionPush push = new NotificacionPush(
                "Tiene una nueva actualización disponible.",
                "DISPOSITIVO-001"
        );

        notificaciones.add(email);
        notificaciones.add(sms);
        notificaciones.add(push);

        for (Notificacion notificacion : notificaciones) {
            notificacion.enviar();
            System.out.println();
        }
    }
}
