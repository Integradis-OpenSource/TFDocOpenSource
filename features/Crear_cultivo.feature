Feature: Crear cultivo


  Scenario: Crear cultivo
    Given que el endpoint "http://localhost:8080/api/v1/crops" se encuentra disponible
    When una solicitud de post es enviada con el valor 5
    Then se recibirá una respuesta con el estatus 200
    And se incluye un recurso de cultivo en el contenido de la respuesta, con los valores de la fecha actual como fecha de inicio, 1, 5

  Scenario: Crear cultivo con id de compañía no existente
    Given que una compañía con id 9 no se encuentra almacenada
    When una solicitud de post es enviada con el valor 9
    Then se recibirá una respuesta con el estatus 400
    And se incluye un mensaje en el contenido de la respuesta con los valores "Company with Id 9 not found"
