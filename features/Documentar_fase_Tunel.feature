Feature: Documentar fase Túnel


  Scenario: Usuario registra información fT
    Given a un técnico supervisor le corresponda realizar un registro periódico sobre la pasteurización, enfriamiento y acondicionamiento del compost durante la fase de "túnel"
    When ingrese la información asociada al estado del compost dentro del túnel de pasteurización
    Then el sistema guardará el reporte en la base de datos

  Scenario: Usuario registra información incompleta fT
    Given a un técnico supervisor le corresponda realizar un registro periódico sobre la pasteurización, enfriamiento y acondicionamiento del compost durante la fase de "túnel"
    When no ingrese toda la información obligatoria solicitada dentro de un registro
    Then el sistema rechazará la operación y solicitará completar los campos restantes
