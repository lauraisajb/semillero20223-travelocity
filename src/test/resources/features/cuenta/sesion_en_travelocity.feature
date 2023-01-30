#language:es

Característica: Realizar logueo y cerrar sesion en travelocity

  Escenario: Inicio de sesion en travelocity
    Dado que el usuario se encuentra en la opcion de iniciar sesion
    Cuando se introduce el correo electronico
    Y se introduce la contrasena
    Entonces debe verse el nombre de "Laura"

  Escenario: Cerrar sesion en travelocity
    Dado que el usuario se encuentra en la opcion de iniciar sesion
    Cuando se introduce el correo electronico
    Y se introduce la contrasena
    Entonces debe verse el nombre de "Laura"
    Cuando cierro sesion
    Entonces debe verse inicio de sesion