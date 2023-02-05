#language:es

Característica: Realizar reserva de hospedaje

  Antecedentes:
    Dado Laura se encuentra en la opcion hospedaje

  @manual
  Escenario: reserva de hospedaje en travelocity con opciones por defecto
    Cuando quiere reservar un hotel a "cartagena" por 8 dias
    Entonces debe obtener al menos una opcion de hospedaje

   @manual
  Escenario: reserva de hospedaje en travelocity con auto
    Cuando quiere reservar un hotel a cartagena por 8 dias agregando un auto
    Entonces debe obtener al menos una opcion de hospedaje
    Y debo obtener al menos una opcion de auto

  @manual
  Escenario: reserva de hospedaje en travelocity con otra habitacion
    Cuando quiere reservar un hotel a "Cartagena" por 8 dias agregando otra habitacion
    Entonces debe obtener al menos una opcion de hospedaje

   @manual
  Escenario: reserva de hospedaje en travelocity con vuelo
    Cuando quiere reservar un hotel a cartagena por 8 dias agregando un vuelo
    Entonces debe obtener al menos una opcion de hospedaje
    Y debo obtener al menos una opcion de vuelo
