Feature: Documentar fase Cosecha


  Scenario: Usuario registra información fCo
    Given a un técnico supervisor le corresponda realizar un registro periódico sobre el estado final del cultivo de champiñones durante la fase "cosecha"
    When ingrese la información asociada al estado actual del cultivo dentro de las naves
    Then el sistema guardará el reporte en la base de datos

  Scenario: Usuario registra información incompleta fCo
    Given a un técnico supervisor le corresponda realizar un registro periódico sobre el estado final del cultivo de champiñones durante la fase "cosecha"
    When no ingrese toda la información obligatoria solicitada dentro de un registro
    Then el sistema rechazará la operación y solicitará completar los campos restantes
