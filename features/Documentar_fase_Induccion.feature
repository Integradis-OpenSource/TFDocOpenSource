Feature: Documentar fase Inducción


  Scenario: Usuario registra información fIn
    Given a un técnico supervisor le corresponda realizar un registro periódico sobre el micelio inducido durante la fase "inducción"
    When ingrese la información asociada al estado actual del cultivo dentro de las naves
    Then el sistema guardará el reporte en la base de datos

  Scenario: Usuario registra información incompleta fIn
    Given a un técnico supervisor le corresponda realizar un registro periódico sobre el micelio inducido durante la fase "inducción"
    When no ingrese toda la información obligatoria solicitada dentro de un registro
    Then el sistema rechazará la operación y solicitará completar los campos restantes
