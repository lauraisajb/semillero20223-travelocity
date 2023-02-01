#language:es

Característica: Realizar logueo y cerrar sesion en travelocity

  Escenario: Inicio de sesion en travelocity
    Dado que Laura accedera a su cuenta en travelocity
    Cuando ingresa su informacion de acceso  "lauraisa1298@hotmail.com" y contrasena "shinoaburame1298*"
    Entonces debe verse el nombre de "Laura"

  Escenario: Cerrar sesion en travelocity
    Dado que el usuario esta logueado
    Cuando cierra sesion
    Entonces debe verse inicio de sesion