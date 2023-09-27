Feature: Acceder a la aplciación desde la landing page


  Scenario: Usuario ingresa a la aplicación
    Given el usuario desee comenzar a utilizar la aplicación
    When ingrese a la landing page y seleccione la opción que permite el acceso al software elaborado
    Then deberá ser redirigido a la página desplegada

  Scenario: Fallo en el acceso a la aplicación
    Given el usuario desee comenzar a utilizar la aplicación
    When ingrese a la landing page y seleccione la opción que permite el acceso al software elaborado y ocurra un error en el proceso de redirección o el servidor de la aplicación no responde
    Then el usuario deberá obtener un mensaje de error generado
