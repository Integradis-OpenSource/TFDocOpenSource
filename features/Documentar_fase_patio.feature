Feature: Documentar fase patio


  Scenario: Usuario registra información fP
    Given a un tecnico supervisor le corresponde realizar un registro periódico sobre mezcla de insumos durante la fase de "patio"
    When ingrese las actividades realizadas en el patio
    Then el sistema guardará el reporte en la base de datos

  Scenario: Usuario registra información incompleta fP
    Given a un técnico supervisor le corresponda realizar un registro periódico sobre la mezcla de insumos durante la fase "patio"
    When no ingrese toda la información obligatoria solicitada dentro de un registro
    Then el sistema rechazará la operación y solicitará completar los campos restantes
