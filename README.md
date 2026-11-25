# U3-ejercicio27
# Sistema de Notificaciones Multicanal

## Objetivo principal

Diseñar un sistema de notificaciones en Java que permita enviar mensajes mediante diferentes canales utilizando herencia y polimorfismo.

## Descripción

Se desarrolla una clase base `Notificacion` que contiene el mensaje y la fecha de creación, junto con un método general para enviar notificaciones.

A partir de esta clase se implementan las subclases `NotificacionEmail`, `NotificacionSMS` y `NotificacionPush`, que incorporan los datos específicos de cada canal y sobrescriben el método `enviar()` para simular su mecanismo de despacho.

En la clase principal se utiliza una colección de tipo `Notificacion` para almacenar y enviar diferentes tipos de avisos de manera polimórfica.

## Conceptos aplicados

- Herencia
- Encapsulamiento
- Constructores y uso de `super`
- Sobrescritura de métodos (`@Override`)
- Polimorfismo
- Colecciones con `ArrayList`
- Fecha y hora con `LocalDateTime`


  ![U3 ejercicio27](U3%20ejercicio27.png)
