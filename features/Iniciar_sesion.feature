Feature: Iniciar sesión


  Scenario: Usuario ingresa credenciales válidass
    Given que el usuario posee una cuenta en la aplicación Greenhouse y desee iniciar sesión
    When ingrese las credenciales necesarias correctamente
    Then el sistema permitirá el acceso a la aplicación

  Scenario: Usuario ingresa credenciales incorrectass
    Given que el usuario posee una cuenta en la aplicación Greenhouse y desea iniciar sesión
    When ingrese alguna credencial de manera incorrecta
    Then el sistema denegará la solicitud
