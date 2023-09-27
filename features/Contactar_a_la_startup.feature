Feature: Contactar a la startup


  Scenario: Enviar mensaje a los desarrolladores
    Given el visitante tenga una consulta o comentario relacionado con la aplicación
    When redacte un mensaje y adjunte una dirección de correo electronico para contactar a los desarrolladores
    Then el sistema remitirá la consulta a los desarrolladores
