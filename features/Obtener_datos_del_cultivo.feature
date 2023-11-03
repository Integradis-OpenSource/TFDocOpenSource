Feature: Obtener datos del cultivo


  Scenario: Obtener cultivos
    Given que el endpoint "http://localhost:8080/api/v1/crops" se encuentra disponible
    When una solicitud de get es enviada al endpoint
    Then se recibirá una respuesta con el estatus 200
    And se incluye un recurso de cultivos en el contenido de la respuesta, con la lista de todos los cultivos registrados en la base de datos
