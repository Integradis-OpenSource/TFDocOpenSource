Feature: Crear nuevo cultivo


  Scenario: Técnico supervisor crea cultivo nuevo satisfactoriamente
    Given que el técnico supervisor desea comenzar una nueva siembra
    When confirme su intención
    Then el id y fecha de creación del cultivo serán almacenados en la base de datos de la aplicación

  Scenario: Técnico supervisor cancela creación de nuevo cultivo
    Given que el técnico supervisor haya intentado crear una nueva siembra
    When cancele la operación
    Then el sistema revertirá la operación y cancelará la creación de un nuevo cultivo

  Scenario: Sistema impide la creación de un nuevo cultivo
    Given que el técnico supervisor haya intentado comenzar una nueva siembra
    When el sistema entre en un estado de error que imposibilite la creación
    Then cancelará la operación e indicará el error generado
