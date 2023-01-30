#language:es

Característica: Realizar reserva de hospedaje

  Escenario: hospedaje en travelocity
    Dado que me encuentro en la opcion hospedaje
    Cuando quiero reservar un hotel a santa marta por 15 dias
    Entonces debo obtener al menos una opcion de hospedaje

  Escenario: hospedaje en travelocity con auto
    Dado que me encuentro en la opcion hospedaje
    Cuando quiero reservar un hotel a santa marta por 15 dias agregando un auto
    Entonces debo obtener al menos una opcion de hospedaje
    Y debo obtener al menos una opcion de auto

  Escenario: hospedaje en travelocity con otra habitacion
    Dado que me encuentro en la opcion hospedaje
    Cuando quiero reservar un hotel a santa marta por 15 dias agregando otra habitacion
    Entonces debo obtener al menos una opcion de hospedaje

  Escenario: hospedaje en travelocity con vuelo
    Dado que me encuentro en la opcion hospedaje
    Cuando quiero reservar un hotel a santa marta por 15 dias agregando un vuelo
    Entonces debo obtener al menos una opcion de hospedaje
    Y debo obtener al menos una opcion de vuelo
