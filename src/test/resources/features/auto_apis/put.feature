#language:es

Característica: Actualizar informacion de usuario
  Yo como aministrador
  quiero consumir los servicios del metodo PUT
  para crear usuarios

  Escenario: Actualizar informacion por metodo Put de manera Exitosa
    Dado que Andres usa el servicio "REQRES"
    Cuando el Consume el servicio para actualizar informacion de usuario 2
    Entonces el esperara un codigo de estado 200

