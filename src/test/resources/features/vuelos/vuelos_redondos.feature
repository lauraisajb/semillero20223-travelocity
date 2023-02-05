# language: es
Característica: Vuelos redondos

  Antecedentes:
    Dado Laura esta en "Medellin"

  @manual
  Escenario: vuelo redondo con opciones por defecto
    Cuando quiera viajar a "Cancun" por 8 dias
    Entonces debe obtener alguna opcion de vuelo

  @manual
  Escenario: vuelo redondo con opcion clase economica premium
    Cuando quiera viajar a "Cancun" en clase economica premium por 8 dias
    Entonces debe obtener al menos una opcion de viaje

  @manual
  Escenario: vuelo redondo con opcion de agregar auto
    Cuando quiera viajar a "Cancun" por 8 dias agregando un auto
    Entonces debe obtener alguna opcion de auto

  @manual
  Escenario: vuelo redondo con opcion de agregar hospedaje
    Cuando quiera viajar a "Cancun" agregando un hospedaje por 8 dias
    Entonces debe obtener alguna opcion de vuelo y de hospedaje