Feature: Obtener datos de cada fase del cultivo


  Scenario: Obtener registros de fase Formula
    Given que el endpoint "http://localhost:8080/api/v1/formulas" se encuentra disponible
    When una solicitud de get es enviada al endpoint
    Then se recibirá una respuesta con el estatus 200
    And se incluye un recurso de formulas en el contenido de la respuesta, con la lista de todos los registros de la fase formula registrados en la base de datos

  Scenario: Obtener registros de fase Formula sin ningún registro
    Given que no existen registros de formulas en la base de datos
    When una solicitud de get es enviada al endpoint
    Then se recibirá una respuesta con el estatus 400
    And se incluye un mensaje en el contenido de la respuesta con el valor "Formulas not found"

  Scenario: Obtener registros de fase Preparation Area
    Given que el endpoint "http://localhost:8080/api/v1/preparationareas" se encuentra disponible
    When una solicitud de get es enviada al endpoint
    Then se recibirá una respuesta con el estatus 200
    And se incluye un recurso de formulas en el contenido de la respuesta, con la lista de todos los registros de la fase preparation area registrados en la base de datos

  Scenario: Obtener registros de fase Preparation Area sin ningún registro
    Given que no existen registros de preparation area en la base de datos
    When una solicitud de get es enviada al endpoint
    Then se recibirá una respuesta con el estatus 400
    And se incluye un mensaje en el contenido de la respuesta con el valor "Preparation Areas not found"

  Scenario: Obtener registros de fase Bunker
    Given que el endpoint "http://localhost:8080/api/v1/bunkers" se encuentra disponible
    When una solicitud de get es enviada al endpoint
    Then se recibirá una respuesta con el estatus 200
    And se incluye un recurso de formulas en el contenido de la respuesta, con la lista de todos los registros de la fase bunker registrados en la base de datos

  Scenario: Obtener registros de fase Bunker sin ningún registro
    Given que no existen registros de bunker en la base de datos
    When una solicitud de get es enviada al endpoint
    Then se recibirá una respuesta con el estatus 400
    And se incluye un mensaje en el contenido de la respuesta con el valor "Bunkers not found"

  Scenario: Obtener registros de fase Tunnel
    Given que el endpoint "http://localhost:8080/api/v1/tunnels" se encuentra disponible
    When una solicitud de get es enviada al endpoint
    Then se recibirá una respuesta con el estatus 200
    And se incluye un recurso de formulas en el contenido de la respuesta, con la lista de todos los registros de la fase tunnel registrados en la base de datos

  Scenario: Obtener registros de fase Tunnel sin ningún registro
    Given que no existen registros de tunnel en la base de datos
    When una solicitud de get es enviada al endpoint
    Then se recibirá una respuesta con el estatus 400
    And se incluye un mensaje en el contenido de la respuesta con el valor "Tunnels not found"

  Scenario: Obtener registros de las fases de grow room
    Given que el endpoint "http://localhost:8080/api/v1/growroomrecords" se encuentra disponible
    When una solicitud de get es enviada al endpoint
    Then se recibirá una respuesta con el estatus 200
    And se incluye un recurso de grow rooms en el contenido de la respuesta, con la lista de todos los registros de las fases relacionadas con grow room registrados en la base de datos

  Scenario: Obtener registros de las fases de grow room sin ningún registro
    Given que no existen registros de las fases de grow room en la base de datos
    When una solicitud de get es enviada al endpoint
    Then se recibirá una respuesta con el estatus 400
    And se incluye un mensaje en el contenido de la respuesta con el valor "Grow Room Phase not found"
