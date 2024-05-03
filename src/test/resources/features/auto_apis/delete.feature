#language:es

Característica: Eliminar usuario
  Yo como aministrador
  quiero consumir los servicios del metodo DELETE
  para crear usuarios

  Escenario: Eliminar usuario con metodo DELETE de manera Exitosa
    Dado que Andres usa el servicio "REQRES"
    Cuando el Consume el servicio para Eliminar a un usuario 2
    Entonces el esperara un codigo de estado 204
