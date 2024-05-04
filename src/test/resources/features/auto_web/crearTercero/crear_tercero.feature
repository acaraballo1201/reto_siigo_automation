#language:es

@CrearTercero

 Característica: Creacion de Tercero
  Como usuario de la aplicacion web SIIGO
  Quiero realizar la creacion de un tercero
  Para verificar el funcionamiento de sus componentes

  @Loggin_1
  Escenario: Auntenticacion Exitosa
    Dado que "Andres" ingresa con el usuario: "admin@siigoautomationqa.com" y la clave: "$22g0QA321"
    Cuando el ingresa al menu crear clientes para terceros
    Entonces el podra observar el "Tercero guardado existosamente"