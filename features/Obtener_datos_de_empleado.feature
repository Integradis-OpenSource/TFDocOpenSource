Feature: Obtener datos de empleado


  Scenario: Obtener empleados
    Given que el endpoint "http://localhost:8080/api/v1/employees" se encuentra disponible
    When una solicitud de get es enviada al endpoint
    Then se recibirá una respuesta con el estatus 200
    And se incluye un recurso de empleados en el contenido de la respuesta, con la lista de todos los empleados registrados en la base de datos

  Scenario: Obtener empleados sin ningún empleado registrado
    Given que no existen empleados registrados en la base de datos
    When una solicitud de get es enviada al endpoint
    Then se recibirá una respuesta con el estatus 400
    And se incluye un mensaje en el contenido de la respuesta con el valor "Employees not found"
