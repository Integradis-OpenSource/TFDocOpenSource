Feature: Documentar fase Incubación


  Scenario: Usuario registrar información fI
    Given a un técnico supervisor le corresponda realizar un registro periódico sobre la incubación del champiñón durante la fase "incubación"
    When ingrese la información asociada al estado actual del cultivo dentro de las naves
    Then el sistema guardará el reporte en la base de datos

  Scenario: Usuario registra información incompleta fI
    Given a un técnico supervisor le corresponda realizar un registro periódico sobre la incubación del champiñón durante la fase "incubación"
    When no ingrese toda la información obligatoria solicitada dentro de un registro
    Then el sistema rechazará la operación y solicitará completar los campos restantes
