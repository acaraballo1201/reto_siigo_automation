#language:es

Característica: Consultar usuario
  Yo como empleador de la app
  quiero consumir los servicios del metodo GET
  para realizar consultas

    Escenario: Consulta de todos los Empleado por metodo GET de manera Exitosa
    Dado que Andres usa el servicio "REQRES"
    Cuando El consume el servicio para consultar todos los empleados
    Entonces el esperara un codigo de estado 200

    Escenario: Consulta de Empleado por metodo GET  de manera Exitosa
    Dado que Andres usa el servicio "REQRES"
    Cuando el Consume el Servicio para consultar el empleado 1
    Entonces el esperara un codigo de estado 200

