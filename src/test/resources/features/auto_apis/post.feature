#language:es

Característica: Creacion de usuario
  Yo como aministrador
  quiero consumir los servicios del metodo POST
  para crear usuarios

    Escenario: Creacion de usuario por metodo Post de manera Exitosa
    Dado que Andres usa el servicio "REQRES"
    Cuando el realiza el Consumo del servicio para la creacion
    Entonces el esperara un codigo de estado 201
