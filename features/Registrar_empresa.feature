Feature: Registrar empresa


  Scenario: Usuario ingresa credenciales válidas
    Given que el usuario desee crear una cuenta en la aplicación Greenhouse
    When ingrese las credenciales de una cuenta inexistente en la base de datos Greenhouse and haya ingresado una contraseña que cumple con todos los requisitos de seguridad and haya aceptado los términos y condiciones de uso
    Then se procederá con el cobro para usar la aplicación

  Scenario: Usuario ingresa credenciales incorrectas
    Given que el usuario desee crear una cuenta en la aplicación Greenhouse
    When ingrese una dirección de correo electrónico o contraseña que no cumplen con los requisitos especificados
    Then se le denegará la operación

  Scenario: Usuario ingresa credenciales de pago válidas
    Given que el usuario desee adquirir alguno de los planes de suscripción a la aplicación
    When ingrese correctamente las credenciales necesarias para efectuar el pago
    Then el sistema creará la cuenta bajo el plan elegido

  Scenario: Usuario ingresa credenciales de pago incorrectas
    Given que el usuario desee adquirir alguno de los planes de suscripción a la aplicación
    When ingrese alguna credencial necesaria para efectuar el pago de manera incorrecta
    Then el sistema solicitará reingresar la información
