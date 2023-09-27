Feature: Documentar fase Búnker


  Scenario: Usuario registra información fB
    Given a un técnico supervisor le corresponda realizar un registro periódico sobre la colección del compost durante la fase "Búnker"
    When ingrese la infromación asociada al estado del compost en cocción dentro del búnker
    Then el sistema guardará el reporte en la base de datos

  Scenario: Usuario registra información incompleta fB
    Given a un técnico supervisor le corresponda realizar un registro periódico sobre la cocción del compost durante la fase "Búnker"
    When no ingrese toda la información obligatoria solicitada dentro de un registro
    Then el sistema rechazará la operación y solicitará completar los campos restantes
