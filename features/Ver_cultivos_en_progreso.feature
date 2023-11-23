Feature: Ver cultivos en progreso


  Scenario: Técnico supervisor visualiza cultivo satisfactoriamente
    Given que el técnico supervisor desea visualizar una siembra existente
    When acceda a la lista de cultivos en curso
    Then el sistema mostrará la información registrada para el cultivo seleccionado

  Scenario: Usuario no puede visualizar cultivo
    Given que el técnico supervisor desea visualizar una siembra existente
    When el sistema entre en un estado de error al intentar visualizar la lista de cultivos en curso
    Then se indicará el error generado y se cancelará la operación
