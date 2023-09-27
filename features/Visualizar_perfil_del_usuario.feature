Feature: Visualizar perfil del usuario


  Scenario: Acceder al perfil del usuario
    Given el usuario desee visualizar la información de un empleado
    When ingrese al perfil del mismo
    Then el obtendrá los datos de relevancia, tales como nombre, rol, empresa a la cual pertenece, etc.
