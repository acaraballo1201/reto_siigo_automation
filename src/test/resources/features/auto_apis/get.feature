#language:es

Característica: Consulta en el servicio
  Yo como empleador de la app
  quiero consumir los servicios del metodo GET
  para realizar consultas

  Esquema del escenario: Consulta de Empleado por metodo GET  de manera Exitosa
    Dado que Andres usa el servicio "REQRES"
    Cuando el Consume el Servicio para consultar el empleado <empleado>
    Entonces el esperara un codigo de estado <statusCode>
    Y el esperara recibir un mensaje de stado <status>
    Ejemplos:
      | empleado | statusCode | status    |
      | 1        | 200        | "success" |

  Esquema del escenario: Consulta de todos los Empleado por metodo GET de manera Exitosa
    Dado que Andres usa el servicio "REQRES"
    Cuando El consume el servicio para consultar todos los empleados
    Entonces el esperara un codigo de estado <statusCode>
    Y el esperara recibir un mensaje de stado <status>
    Ejemplos:
      | statusCode | status  |
      | 200        | "success" |
