Feature: Crear cuenta de empleado


  Scenario: Crear empleado
    Given que el endpoint "http://localhost:8080/api/v1/employees" se encuentra disponible
    When una solicitud de post es enviada con los valores "Nicolas", "Espinoza", "nespinoza@gmail.com", "nicolasnaer", 5
    Then se recibirá una respuesta con el estatus 200 and se incluye un recurso de empleado en el contenido de la respuesta, con los valores "Nicolas", "Espinoza", "nespinoza@gmail.com", "nicolasnaer", 5

  Scenario: Crear empleado con email existente
    Given que un empleado con email "asotito@gmail.com" ya se encuentra almacenado
    When una solicitud de post es enviada con los valores "Andres", "Soto", "asotito@gmail.com", "asotito", 5
    Then se recibirá una respuesta con el estatus 500 and se incluye un mensaje en el contenido de la respuesta con los valores "Employee with email 'asotito@gmail.com' already exists"

  Scenario: Crear empleado con id de compañía no existente
    Given que una compañía con id 8 no se encuentra almacenada
    When una solicitud de post es enviada con los valores "Alan", "Galavis", "agalavis@gmail;.com", "AlanEGD", 8
    Then se recibirá una respuesta con el estatus 500 and se incluye un mensaje en el contenido de la respuesta con los valores "Company with Id 8 not found"
