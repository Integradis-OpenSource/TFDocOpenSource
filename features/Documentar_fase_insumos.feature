Feature: Documentar fase insumos


  Scenario: Usuario registra información
    Given a un técnico o supervisor le corresponda realizar un registro preiódico durante la fase 0
    When ingrese la información asociada a los insumos a utilizar
    Then el sistema guardará el reporte en la base de datos

  Scenario: Usuario registra información incompleta
    Given a un técnico supervisor le corresponda realizar un registro periódico durante la fase 0
    When no ingrese toda la información obligatoria solicitada dentro de un registro
    Then el sistema rechazará la operación y solicitará completar campos restantes
