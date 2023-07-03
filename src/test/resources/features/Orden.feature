#language: es

Característica: Modulo orden de compra
  Como usuario se desea cambiar el nombre del empleado en cualquiera de las ordenes de compra

  Escenario: Modificar el responsable de una orden creada previamente
    Dado que el usuario ingresa a la URL del portal demo serenity y realiza el inicio de sesión exitoso
    Cuando el usuario ingresa al modulo de ordenes y selecciona una orden en especifico
    Y se asigne el responsable de la orden y guarde los cambios relacionados.
    Entonces el usuario visualizara una alerta de guardado exitoso