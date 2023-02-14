#language:es

Característica: Realizar logueo y cerrar sesion en travelocity

  @manual
  Escenario: Inicio de sesion en travelocity
    Dado que Laura accedera a su cuenta en travelocity
    Cuando ingresa su informacion de acceso  "" y contrasena ""
    Entonces debe verse el nombre de "Laura"

  @manual
  Escenario: Cerrar sesion en travelocity
    Dado que el usuario esta logueado
    Cuando cierra sesion
    Entonces debe verse inicio de sesion