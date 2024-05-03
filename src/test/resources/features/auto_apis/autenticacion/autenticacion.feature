#language:es

@Login

 Característica: :  Hu login
  Como usuario de la aplicacion web SIIGO
  Quiero realizar el logueo en el sitio
  Para verificar el funcionamiento de sus componentes

  @Loggin_1
  Escenario: Auntenticacion Exitosa
    Dado que "Andres" ingresa con el usuario: "admin@siigoautomationqa.com" y la clave: "$22g0QA321"
    Cuando el ingresa al menu de crear clientes
    Entonces el podra observar el catalogo de servicio


