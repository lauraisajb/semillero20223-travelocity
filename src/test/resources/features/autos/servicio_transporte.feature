#language: es

  Característica: Alquiler y servicio de auto

    Escenario: Renta de autos en travelocity
      Dado que estoy en medellin para rentar un auto
      Cuando quiero hacer turismo por 3 dias
      Entonces debo obtener al menos una opcion de auto

    Escenario: Renta de autos en travelocity con tarifa para socios
      Dado que estoy en medellin para rentar un auto
      Cuando quiero hacer turismo por 3 dias agregando la tarifa para socios AARP
      Entonces debo obtener al menos una opcion de auto

    Escenario: Traslado del aeropuerto al hotel
      Dado que estoy en "medellin" y necesito transporte
      Cuando quiero ir del aeropuerto de "medellin" al "hotel el deportista"
      Entonces debo obtener al menos una opcion de traslado

    Escenario: Traslado del aeropuerto al hotel con ida y vuelta
      Dado que estoy en "medellin" y necesito transporte
      Cuando quiero ir del aeropuerto de "medellin" al "hotel el deportista" agregando id y vuelta
      Entonces debo obtener al menos una opcion de traslado
