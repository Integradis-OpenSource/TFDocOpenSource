Feature: Visualizar perfil de la empresa


  Scenario: Acceder al perfil de la empresa
    Given el usuario desee visualizar la información y estructura de la empresa
    When ingrese al perfil de la misma
    Then obtendrá una lista con los datos de la empresa y los empleados registrados
