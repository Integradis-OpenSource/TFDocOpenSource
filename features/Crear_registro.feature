Feature: Crear registro


  Scenario: Crear registro de fase Formula
    Given que el endpoint "http://localhost:8080/api/v1/formulas" se encuentra disponible
    When una solicitud de post es enviada con los valores 200, 150, 450, 300, 100, 250, 400, 200, 5, 2
    Then se recibirá una respuesta con el estatus 200
    And se incluye un recurso de registro en el contenido de la respuesta, con los valores de la fecha actual como fecha de registro, 200, 150, 450, 300, 100, 250, 400, 200, 5, 2

  Scenario: Crear registro de fase Formula de cultivo no existente
    Given que un cultivo con id 7 no se encuentra almacenado
    When una solicitud de post es enviada con los valores 300, 50, 350, 200, 400, 150, 300, 100, 7, 2
    Then se recibirá una respuesta con el estatus 400
    And se incluye un mensaje en el contenido de la respuesta con el valor "Crop with Id 7 not found"

  Scenario: Crear registro de fase Formula de empleado no existente
    Given que un empleado con id 10 no se encuentra almacenado
    When una solicitud de post es enviada con los valores 200, 150, 250, 200, 500, 150, 300, 50, 5, 10
    Then se recibirá una respuesta con el estatus 400
    And se incluye un mensaje en el contenido de la respuesta con el valor "Employee with Id 10 not found"

  Scenario: Crear registro de fase Preparation Area
    Given que el endpoint "http://localhost:8080/api/v1/preparationareas" se encuentra disponible
    When una solicitud de post es enviada con los valores "Premezcla de Insumos", 30, "", 5, 2
    Then se recibirá una respuesta con el estatus 200
    And se incluye un recurso de registro en el contenido de la respuesta, con los valores de la fecha actual como fecha de registro, "Premezcla de Insumos", 30, "", 5, 2

  Scenario: Crear registro de fase Preparation Area de cultivo no existente
    Given que un cultivo con id 7 no se encuentra almacenado
    When una solicitud de post es enviada con los valores "Premezcla de Insumos", 30, "", 7, 2
    Then se recibirá una respuesta con el estatus 400
    And se incluye un mensaje en el contenido de la respuesta con el valor "Crop with Id 7 not found"

  Scenario: Crear registro de fase Preparation Area de empleado no existente
    Given que un empleado con id 10 no se encuentra almacenado
    When una solicitud de post es enviada con los valores "Formación del cordón", 31, "", 5, 10
    Then se recibirá una respuesta con el estatus 400
    And se incluye un mensaje en el contenido de la respuesta con el valor "Employee with Id 10 not found"

  Scenario: Crear registro de fase Bunker
    Given que el endpoint "http://localhost:8080/api/v1/bunkers" se encuentra disponible
    When una solicitud de post es enviada con los valores 525, 481, 490, 498.67, 50, "", 5, 2
    Then se recibirá una respuesta con el estatus 200
    And se incluye un recurso de registro en el contenido de la respuesta, con los valores de la fecha actual como fecha de registro, 525, 481, 490, 498.67, 50, "", 5, 2

  Scenario: Crear registro de fase Bunker de cultivo no existente
    Given que un cultivo con id 7 no se encuentra almacenado
    When una solicitud de post es enviada con los valores 524, 485, 484, 498.33, 50, "", 7, 2
    Then se recibirá una respuesta con el estatus 400
    And se incluye un mensaje en el contenido de la respuesta con el valor "Crop with Id 7 not found"

  Scenario: Crear registro de fase Bunker de empleado no existente
    Given que un empleado con id 10 no se encuentra almacenado
    When una solicitud de post es enviada con los valores 525, 486, 484, 498.67, 50, "", 5, 10
    Then se recibirá una respuesta con el estatus 400
    And se incluye un mensaje en el contenido de la respuesta con el valor "Employee with Id 10 not found"

  Scenario: Crear registro de fase Tunnel
    Given que el endpoint "http://localhost:8080/api/v1/tunnels" se encuentra disponible
    When una solicitud de post es enviada con los valores 545, 543, 500, 513.33, 16, 50, 30, 62, "", 5, 2
    Then se recibirá una respuesta con el estatus 200
    And se incluye un recurso de registro en el contenido de la respuesta, con los valores de la fecha actual como fecha de registro, 545, 543, 500, 513.33, 16, 50, 30, 62, "", 5, 2

  Scenario: Crear registro de fase Tunnel de cultivo no existente
    Given que un cultivo con id 7 no se encuentra almacenado
    When una solicitud de post es enviada con los valores 543, 493, 497, 511, 18, 50, 30, 62, "", 7, 2
    Then se recibirá una respuesta con el estatus 400
    And se incluye un mensaje en el contenido de la respuesta con el valor "Crop with Id 7 not found"

  Scenario: Crear registro de fase Tunnel de empleado no existente
    Given que un empleado con id 10 no se encuentra almacenado
    When una solicitud de post es enviada con los valores 545, 543, 500, 513.33, 30, 50, 30, 62, "T2=460", 5, 10
    Then se recibirá una respuesta con el estatus 400
    And se incluye un mensaje en el contenido de la respuesta con el valor "Employee with Id 10 not found"

  Scenario: Crear registro de fase Grow Room
    Given que el endpoint "http://localhost:8080/api/v1/growroomrecords" se encuentra disponible
    When una solicitud de post es enviada con los valores 4, 22.0, 23-24, 2192, 92, 20.0, "Incubation", "", 5, 2
    Then se recibirá una respuesta con el estatus 200
    And se incluye un recurso de registro en el contenido de la respuesta, con los valores de la fecha actual como fecha de registro, 4, 22.0, 23-24, 2192, 92, 20.0, "Incubation", "", 5, 2

  Scenario: Crear registro de fase Grow Room de cultivo no existente
    Given que un cultivo con id 7 no se encuentra almacenado
    When una solicitud de post es enviada con los valores 4, 22.0, 23-24, 2192, 92, 20.0, "Incubation", "", 7, 2
    Then se recibirá una respuesta con el estatus 400
    And se incluye un mensaje en el contenido de la respuesta con el valor "Crop with Id 7 not found"

  Scenario: Crear registro de fase Grow Room de empleado no existente
    Given que un empleado con id 10 no se encuentra almacenado
    When una solicitud de post es enviada con los valores 4, 22.0, 23-24, 2192, 92, 20.0, "Incubation", "", 5, 10
    Then se recibirá una respuesta con el estatus 400
    And se incluye un mensaje en el contenido de la respuesta con el valor "Employee with Id 10 not found"
