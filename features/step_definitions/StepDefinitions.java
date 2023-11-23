package com.example;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;

public class StepDefinitions {
    public Actionwords actionwords = new Actionwords();

    @Given("que el usuario desee crear una cuenta en la aplicación Greenhouse")
    public void queElUsuarioDeseeCrearUnaCuentaEnLaAplicacionGreenhouse() {
        actionwords.queElUsuarioDeseeCrearUnaCuentaEnLaAplicacionGreenhouse();
    }

    @When("ingrese las credenciales de una cuenta inexistente en la base de datos Greenhouse and haya ingresado una contraseña que cumple con todos los requisitos de seguridad and haya aceptado los términos y condiciones de uso")
    public void ingreseLasCredencialesDeUnaCuentaInexistenteEnLaBaseDeDatosGreenhouseAndHayaIngresadoUnaContrasenaQueCumpleConTodosLosRequisitosDeSeguridadAndHayaAceptadoLosTerminosYCondicionesDeUso() {
        actionwords.ingreseLasCredencialesDeUnaCuentaInexistenteEnLaBaseDeDatosGreenhouseAndHayaIngresadoUnaContrasenaQueCumpleConTodosLosRequisitosDeSeguridadAndHayaAceptadoLosTerminosYCondicionesDeUso();
    }

    @Then("se procederá con el cobro para usar la aplicación")
    public void seProcederaConElCobroParaUsarLaAplicacion() {
        actionwords.seProcederaConElCobroParaUsarLaAplicacion();
    }

    @When("ingrese una dirección de correo electrónico o contraseña que no cumplen con los requisitos especificados")
    public void ingreseUnaDireccionDeCorreoElectronicoOContrasenaQueNoCumplenConLosRequisitosEspecificados() {
        actionwords.ingreseUnaDireccionDeCorreoElectronicoOContrasenaQueNoCumplenConLosRequisitosEspecificados();
    }

    @Then("se le denegará la operación")
    public void seLeDenegaraLaOperacion() {
        actionwords.seLeDenegaraLaOperacion();
    }

    @Given("que el usuario desee adquirir alguno de los planes de suscripción a la aplicación")
    public void queElUsuarioDeseeAdquirirAlgunoDeLosPlanesDeSuscripcionALaAplicacion() {
        actionwords.queElUsuarioDeseeAdquirirAlgunoDeLosPlanesDeSuscripcionALaAplicacion();
    }

    @When("ingrese correctamente las credenciales necesarias para efectuar el pago")
    public void ingreseCorrectamenteLasCredencialesNecesariasParaEfectuarElPago() {
        actionwords.ingreseCorrectamenteLasCredencialesNecesariasParaEfectuarElPago();
    }

    @Then("el sistema creará la cuenta bajo el plan elegido")
    public void elSistemaCrearaLaCuentaBajoElPlanElegido() {
        actionwords.elSistemaCrearaLaCuentaBajoElPlanElegido();
    }

    @When("ingrese alguna credencial necesaria para efectuar el pago de manera incorrecta")
    public void ingreseAlgunaCredencialNecesariaParaEfectuarElPagoDeManeraIncorrecta() {
        actionwords.ingreseAlgunaCredencialNecesariaParaEfectuarElPagoDeManeraIncorrecta();
    }

    @Then("el sistema solicitará reingresar la información")
    public void elSistemaSolicitaraReingresarLaInformacion() {
        actionwords.elSistemaSolicitaraReingresarLaInformacion();
    }

    @Given("que el usuario posee una cuenta en la aplicación Greenhouse y desee iniciar sesión")
    public void queElUsuarioPoseeUnaCuentaEnLaAplicacionGreenhouseYDeseeIniciarSesion() {
        actionwords.queElUsuarioPoseeUnaCuentaEnLaAplicacionGreenhouseYDeseeIniciarSesion();
    }

    @When("ingrese las credenciales necesarias correctamente")
    public void ingreseLasCredencialesNecesariasCorrectamente() {
        actionwords.ingreseLasCredencialesNecesariasCorrectamente();
    }

    @Then("el sistema permitirá el acceso a la aplicación")
    public void elSistemaPermitiraElAccesoALaAplicacion() {
        actionwords.elSistemaPermitiraElAccesoALaAplicacion();
    }

    @Given("que el usuario posee una cuenta en la aplicación Greenhouse y desea iniciar sesión")
    public void queElUsuarioPoseeUnaCuentaEnLaAplicacionGreenhouseYDeseaIniciarSesion() {
        actionwords.queElUsuarioPoseeUnaCuentaEnLaAplicacionGreenhouseYDeseaIniciarSesion();
    }

    @When("ingrese alguna credencial de manera incorrecta")
    public void ingreseAlgunaCredencialDeManeraIncorrecta() {
        actionwords.ingreseAlgunaCredencialDeManeraIncorrecta();
    }

    @Then("el sistema denegará la solicitud")
    public void elSistemaDenegaraLaSolicitud() {
        actionwords.elSistemaDenegaraLaSolicitud();
    }

    @Given("que el técnico supervisor desea comenzar una nueva siembra")
    public void queElTecnicoSupervisorDeseaComenzarUnaNuevaSiembra() {
        actionwords.queElTecnicoSupervisorDeseaComenzarUnaNuevaSiembra();
    }

    @When("confirme su intención")
    public void confirmeSuIntencion() {
        actionwords.confirmeSuIntencion();
    }

    @Then("el id y fecha de creación del cultivo serán almacenados en la base de datos de la aplicación")
    public void elIdYFechaDeCreacionDelCultivoSeranAlmacenadosEnLaBaseDeDatosDeLaAplicacion() {
        actionwords.elIdYFechaDeCreacionDelCultivoSeranAlmacenadosEnLaBaseDeDatosDeLaAplicacion();
    }

    @Given("que el técnico supervisor haya intentado crear una nueva siembra")
    public void queElTecnicoSupervisorHayaIntentadoCrearUnaNuevaSiembra() {
        actionwords.queElTecnicoSupervisorHayaIntentadoCrearUnaNuevaSiembra();
    }

    @When("cancele la operación")
    public void canceleLaOperacion() {
        actionwords.canceleLaOperacion();
    }

    @Then("el sistema revertirá la operación y cancelará la creación de un nuevo cultivo")
    public void elSistemaRevertiraLaOperacionYCancelaraLaCreacionDeUnNuevoCultivo() {
        actionwords.elSistemaRevertiraLaOperacionYCancelaraLaCreacionDeUnNuevoCultivo();
    }

    @Given("que el técnico supervisor haya intentado comenzar una nueva siembra")
    public void queElTecnicoSupervisorHayaIntentadoComenzarUnaNuevaSiembra() {
        actionwords.queElTecnicoSupervisorHayaIntentadoComenzarUnaNuevaSiembra();
    }

    @When("el sistema entre en un estado de error que imposibilite la creación")
    public void elSistemaEntreEnUnEstadoDeErrorQueImposibiliteLaCreacion() {
        actionwords.elSistemaEntreEnUnEstadoDeErrorQueImposibiliteLaCreacion();
    }

    @Then("cancelará la operación e indicará el error generado")
    public void cancelaraLaOperacionEIndicaraElErrorGenerado() {
        actionwords.cancelaraLaOperacionEIndicaraElErrorGenerado();
    }

    @Given("que el técnico supervisor desea visualizar una siembra existente")
    public void queElTecnicoSupervisorDeseaVisualizarUnaSiembraExistente() {
        actionwords.queElTecnicoSupervisorDeseaVisualizarUnaSiembraExistente();
    }

    @When("acceda a la lista de cultivos en curso")
    public void accedaALaListaDeCultivosEnCurso() {
        actionwords.accedaALaListaDeCultivosEnCurso();
    }

    @Then("el sistema mostrará la información registrada para el cultivo seleccionado")
    public void elSistemaMostraraLaInformacionRegistradaParaElCultivoSeleccionado() {
        actionwords.elSistemaMostraraLaInformacionRegistradaParaElCultivoSeleccionado();
    }

    @When("el sistema entre en un estado de error al intentar visualizar la lista de cultivos en curso")
    public void elSistemaEntreEnUnEstadoDeErrorAlIntentarVisualizarLaListaDeCultivosEnCurso() {
        actionwords.elSistemaEntreEnUnEstadoDeErrorAlIntentarVisualizarLaListaDeCultivosEnCurso();
    }

    @Then("se indicará el error generado y se cancelará la operación")
    public void seIndicaraElErrorGeneradoYSeCancelaraLaOperacion() {
        actionwords.seIndicaraElErrorGeneradoYSeCancelaraLaOperacion();
    }

    @Given("que el usuario desee visualizar la información y estructura de la empresa")
    public void queElUsuarioDeseeVisualizarLaInformacionYEstructuraDeLaEmpresa() {
        actionwords.queElUsuarioDeseeVisualizarLaInformacionYEstructuraDeLaEmpresa();
    }

    @When("ingrese al perfil de la empresa")
    public void ingreseAlPerfilDeLaEmpresa() {
        actionwords.ingreseAlPerfilDeLaEmpresa();
    }

    @Then("obtendrá una lista con los datos de la empresa y los empleados registrados")
    public void obtendraUnaListaConLosDatosDeLaEmpresaYLosEmpleadosRegistrados() {
        actionwords.obtendraUnaListaConLosDatosDeLaEmpresaYLosEmpleadosRegistrados();
    }

    @Given("que el usuario desee visualizar la información de un empleado")
    public void queElUsuarioDeseeVisualizarLaInformacionDeUnEmpleado() {
        actionwords.queElUsuarioDeseeVisualizarLaInformacionDeUnEmpleado();
    }

    @When("ingrese al perfil del empleado")
    public void ingreseAlPerfilDelEmpleado() {
        actionwords.ingreseAlPerfilDelEmpleado();
    }

    @Then("obtendrá los datos de relevancia, tales como nombre, rol, empresa a la cual pertenece, etc\\.")
    public void obtendraLosDatosDeRelevanciaTalesComoNombreRolEmpresaALaCualPerteneceEtc() {
        actionwords.obtendraLosDatosDeRelevanciaTalesComoNombreRolEmpresaALaCualPerteneceEtc();
    }

    @Given("que el endpoint {string} se encuentra disponible")
    public void queElEndpointP1SeEncuentraDisponible(String p1) {
        actionwords.queElEndpointP1SeEncuentraDisponible(p1);
    }

    @When("una solicitud de post es enviada con los valores {string}, {string}, {string}, {string}, 5")
    public void unaSolicitudDePostEsEnviadaConLosValoresP1P2P3P45(String p1, String p2, String p3, String p4) {
        actionwords.unaSolicitudDePostEsEnviadaConLosValoresP1P2P3P45(p1, p2, p3, p4);
    }

    @Then("se recibirá una respuesta con el estatus 200 and se incluye un recurso de empleado en el contenido de la respuesta, con los valores {string}, {string}, {string}, {string}, 5")
    public void seRecibiraUnaRespuestaConElEstatus200AndSeIncluyeUnRecursoDeEmpleadoEnElContenidoDeLaRespuestaConLosValoresP1P2P3P45(String p1, String p2, String p3, String p4) {
        actionwords.seRecibiraUnaRespuestaConElEstatus200AndSeIncluyeUnRecursoDeEmpleadoEnElContenidoDeLaRespuestaConLosValoresP1P2P3P45(p1, p2, p3, p4);
    }

    @Given("que un empleado con email {string} ya se encuentra almacenado")
    public void queUnEmpleadoConEmailP1YaSeEncuentraAlmacenado(String p1) {
        actionwords.queUnEmpleadoConEmailP1YaSeEncuentraAlmacenado(p1);
    }

    @Then("se recibirá una respuesta con el estatus 500 and se incluye un mensaje en el contenido de la respuesta con los valores {string}")
    public void seRecibiraUnaRespuestaConElEstatus500AndSeIncluyeUnMensajeEnElContenidoDeLaRespuestaConLosValoresP1(String p1) {
        actionwords.seRecibiraUnaRespuestaConElEstatus500AndSeIncluyeUnMensajeEnElContenidoDeLaRespuestaConLosValoresP1(p1);
    }

    @Given("que una compañía con id 8 no se encuentra almacenada")
    public void queUnaCompaniaConId8NoSeEncuentraAlmacenada() {
        actionwords.queUnaCompaniaConId8NoSeEncuentraAlmacenada();
    }

    @When("una solicitud de post es enviada con los valores {string}, {string}, {string}, {string}, 8")
    public void unaSolicitudDePostEsEnviadaConLosValoresP1P2P3P48(String p1, String p2, String p3, String p4) {
        actionwords.unaSolicitudDePostEsEnviadaConLosValoresP1P2P3P48(p1, p2, p3, p4);
    }

    @When("una solicitud de post es enviada con el valor 5")
    public void unaSolicitudDePostEsEnviadaConElValor5() {
        actionwords.unaSolicitudDePostEsEnviadaConElValor5();
    }

    @Then("se recibirá una respuesta con el estatus 200")
    public void seRecibiraUnaRespuestaConElEstatus200() {
        actionwords.seRecibiraUnaRespuestaConElEstatus200();
    }

    @Then("se incluye un recurso de cultivo en el contenido de la respuesta, con los valores de la fecha actual como fecha de inicio, 1, 5")
    public void seIncluyeUnRecursoDeCultivoEnElContenidoDeLaRespuestaConLosValoresDeLaFechaActualComoFechaDeInicio15() {
        actionwords.seIncluyeUnRecursoDeCultivoEnElContenidoDeLaRespuestaConLosValoresDeLaFechaActualComoFechaDeInicio15();
    }

    @Given("que una compañía con id 9 no se encuentra almacenada")
    public void queUnaCompaniaConId9NoSeEncuentraAlmacenada() {
        actionwords.queUnaCompaniaConId9NoSeEncuentraAlmacenada();
    }

    @When("una solicitud de post es enviada con el valor 9")
    public void unaSolicitudDePostEsEnviadaConElValor9() {
        actionwords.unaSolicitudDePostEsEnviadaConElValor9();
    }

    @Then("se recibirá una respuesta con el estatus 400")
    public void seRecibiraUnaRespuestaConElEstatus400() {
        actionwords.seRecibiraUnaRespuestaConElEstatus400();
    }

    @Then("se incluye un mensaje en el contenido de la respuesta con los valores {string}")
    public void seIncluyeUnMensajeEnElContenidoDeLaRespuestaConLosValoresP1(String p1) {
        actionwords.seIncluyeUnMensajeEnElContenidoDeLaRespuestaConLosValoresP1(p1);
    }

    @When("una solicitud de get es enviada al endpoint")
    public void unaSolicitudDeGetEsEnviadaAlEndpoint() {
        actionwords.unaSolicitudDeGetEsEnviadaAlEndpoint();
    }

    @Then("se incluye un recurso de empleados en el contenido de la respuesta, con la lista de todos los empleados registrados en la base de datos")
    public void seIncluyeUnRecursoDeEmpleadosEnElContenidoDeLaRespuestaConLaListaDeTodosLosEmpleadosRegistradosEnLaBaseDeDatos() {
        actionwords.seIncluyeUnRecursoDeEmpleadosEnElContenidoDeLaRespuestaConLaListaDeTodosLosEmpleadosRegistradosEnLaBaseDeDatos();
    }

    @Given("que no existen empleados registrados en la base de datos")
    public void queNoExistenEmpleadosRegistradosEnLaBaseDeDatos() {
        actionwords.queNoExistenEmpleadosRegistradosEnLaBaseDeDatos();
    }

    @Then("se incluye un mensaje en el contenido de la respuesta con el valor {string}")
    public void seIncluyeUnMensajeEnElContenidoDeLaRespuestaConElValorP1(String p1) {
        actionwords.seIncluyeUnMensajeEnElContenidoDeLaRespuestaConElValorP1(p1);
    }

    @Then("se incluye un recurso de cultivos en el contenido de la respuesta, con la lista de todos los cultivos registrados en la base de datos")
    public void seIncluyeUnRecursoDeCultivosEnElContenidoDeLaRespuestaConLaListaDeTodosLosCultivosRegistradosEnLaBaseDeDatos() {
        actionwords.seIncluyeUnRecursoDeCultivosEnElContenidoDeLaRespuestaConLaListaDeTodosLosCultivosRegistradosEnLaBaseDeDatos();
    }

    @Then("se incluye un recurso de formulas en el contenido de la respuesta, con la lista de todos los registros de la fase formula registrados en la base de datos")
    public void seIncluyeUnRecursoDeFormulasEnElContenidoDeLaRespuestaConLaListaDeTodosLosRegistrosDeLaFaseFormulaRegistradosEnLaBaseDeDatos() {
        actionwords.seIncluyeUnRecursoDeFormulasEnElContenidoDeLaRespuestaConLaListaDeTodosLosRegistrosDeLaFaseFormulaRegistradosEnLaBaseDeDatos();
    }

    @Given("que no existen registros de formulas en la base de datos")
    public void queNoExistenRegistrosDeFormulasEnLaBaseDeDatos() {
        actionwords.queNoExistenRegistrosDeFormulasEnLaBaseDeDatos();
    }

    @Then("se incluye un recurso de formulas en el contenido de la respuesta, con la lista de todos los registros de la fase preparation area registrados en la base de datos")
    public void seIncluyeUnRecursoDeFormulasEnElContenidoDeLaRespuestaConLaListaDeTodosLosRegistrosDeLaFasePreparationAreaRegistradosEnLaBaseDeDatos() {
        actionwords.seIncluyeUnRecursoDeFormulasEnElContenidoDeLaRespuestaConLaListaDeTodosLosRegistrosDeLaFasePreparationAreaRegistradosEnLaBaseDeDatos();
    }

    @Given("que no existen registros de preparation area en la base de datos")
    public void queNoExistenRegistrosDePreparationAreaEnLaBaseDeDatos() {
        actionwords.queNoExistenRegistrosDePreparationAreaEnLaBaseDeDatos();
    }

    @Then("se incluye un recurso de formulas en el contenido de la respuesta, con la lista de todos los registros de la fase bunker registrados en la base de datos")
    public void seIncluyeUnRecursoDeFormulasEnElContenidoDeLaRespuestaConLaListaDeTodosLosRegistrosDeLaFaseBunkerRegistradosEnLaBaseDeDatos() {
        actionwords.seIncluyeUnRecursoDeFormulasEnElContenidoDeLaRespuestaConLaListaDeTodosLosRegistrosDeLaFaseBunkerRegistradosEnLaBaseDeDatos();
    }

    @Given("que no existen registros de bunker en la base de datos")
    public void queNoExistenRegistrosDeBunkerEnLaBaseDeDatos() {
        actionwords.queNoExistenRegistrosDeBunkerEnLaBaseDeDatos();
    }

    @Then("se incluye un recurso de formulas en el contenido de la respuesta, con la lista de todos los registros de la fase tunnel registrados en la base de datos")
    public void seIncluyeUnRecursoDeFormulasEnElContenidoDeLaRespuestaConLaListaDeTodosLosRegistrosDeLaFaseTunnelRegistradosEnLaBaseDeDatos() {
        actionwords.seIncluyeUnRecursoDeFormulasEnElContenidoDeLaRespuestaConLaListaDeTodosLosRegistrosDeLaFaseTunnelRegistradosEnLaBaseDeDatos();
    }

    @Given("que no existen registros de tunnel en la base de datos")
    public void queNoExistenRegistrosDeTunnelEnLaBaseDeDatos() {
        actionwords.queNoExistenRegistrosDeTunnelEnLaBaseDeDatos();
    }

    @Then("se incluye un recurso de grow rooms en el contenido de la respuesta, con la lista de todos los registros de las fases relacionadas con grow room registrados en la base de datos")
    public void seIncluyeUnRecursoDeGrowRoomsEnElContenidoDeLaRespuestaConLaListaDeTodosLosRegistrosDeLasFasesRelacionadasConGrowRoomRegistradosEnLaBaseDeDatos() {
        actionwords.seIncluyeUnRecursoDeGrowRoomsEnElContenidoDeLaRespuestaConLaListaDeTodosLosRegistrosDeLasFasesRelacionadasConGrowRoomRegistradosEnLaBaseDeDatos();
    }

    @Given("que no existen registros de las fases de grow room en la base de datos")
    public void queNoExistenRegistrosDeLasFasesDeGrowRoomEnLaBaseDeDatos() {
        actionwords.queNoExistenRegistrosDeLasFasesDeGrowRoomEnLaBaseDeDatos();
    }

    @When("una solicitud de post es enviada con los valores 200, 150, 450, 300, 100, 250, 400, 200, 5, 2")
    public void unaSolicitudDePostEsEnviadaConLosValores20015045030010025040020052() {
        actionwords.unaSolicitudDePostEsEnviadaConLosValores20015045030010025040020052();
    }

    @Then("se incluye un recurso de registro en el contenido de la respuesta, con los valores de la fecha actual como fecha de registro, 200, 150, 450, 300, 100, 250, 400, 200, 5, 2")
    public void seIncluyeUnRecursoDeRegistroEnElContenidoDeLaRespuestaConLosValoresDeLaFechaActualComoFechaDeRegistro20015045030010025040020052() {
        actionwords.seIncluyeUnRecursoDeRegistroEnElContenidoDeLaRespuestaConLosValoresDeLaFechaActualComoFechaDeRegistro20015045030010025040020052();
    }

    @Given("que un cultivo con id 7 no se encuentra almacenado")
    public void queUnCultivoConId7NoSeEncuentraAlmacenado() {
        actionwords.queUnCultivoConId7NoSeEncuentraAlmacenado();
    }

    @When("una solicitud de post es enviada con los valores 300, 50, 350, 200, 400, 150, 300, 100, 7, 2")
    public void unaSolicitudDePostEsEnviadaConLosValores3005035020040015030010072() {
        actionwords.unaSolicitudDePostEsEnviadaConLosValores3005035020040015030010072();
    }

    @Given("que un empleado con id 10 no se encuentra almacenado")
    public void queUnEmpleadoConId10NoSeEncuentraAlmacenado() {
        actionwords.queUnEmpleadoConId10NoSeEncuentraAlmacenado();
    }

    @When("una solicitud de post es enviada con los valores 200, 150, 250, 200, 500, 150, 300, 50, 5, 10")
    public void unaSolicitudDePostEsEnviadaConLosValores20015025020050015030050510() {
        actionwords.unaSolicitudDePostEsEnviadaConLosValores20015025020050015030050510();
    }

    @When("una solicitud de post es enviada con los valores {string}, 30, {string}, 5, 2")
    public void unaSolicitudDePostEsEnviadaConLosValoresP130P252(String p1, String p2) {
        actionwords.unaSolicitudDePostEsEnviadaConLosValoresP130P252(p1, p2);
    }

    @Then("se incluye un recurso de registro en el contenido de la respuesta, con los valores de la fecha actual como fecha de registro, {string}, 30, {string}, 5, 2")
    public void seIncluyeUnRecursoDeRegistroEnElContenidoDeLaRespuestaConLosValoresDeLaFechaActualComoFechaDeRegistroP130P252(String p1, String p2) {
        actionwords.seIncluyeUnRecursoDeRegistroEnElContenidoDeLaRespuestaConLosValoresDeLaFechaActualComoFechaDeRegistroP130P252(p1, p2);
    }

    @When("una solicitud de post es enviada con los valores {string}, 30, {string}, 7, 2")
    public void unaSolicitudDePostEsEnviadaConLosValoresP130P272(String p1, String p2) {
        actionwords.unaSolicitudDePostEsEnviadaConLosValoresP130P272(p1, p2);
    }

    @When("una solicitud de post es enviada con los valores {string}, 31, {string}, 5, 10")
    public void unaSolicitudDePostEsEnviadaConLosValoresP131P2510(String p1, String p2) {
        actionwords.unaSolicitudDePostEsEnviadaConLosValoresP131P2510(p1, p2);
    }

    @When("una solicitud de post es enviada con los valores 525, 481, 490, 498\\.67, 50, {string}, 5, 2")
    public void unaSolicitudDePostEsEnviadaConLosValores5254814904986750P152(String p1) {
        actionwords.unaSolicitudDePostEsEnviadaConLosValores5254814904986750P152(p1);
    }

    @Then("se incluye un recurso de registro en el contenido de la respuesta, con los valores de la fecha actual como fecha de registro, 525, 481, 490, 498\\.67, 50, {string}, 5, 2")
    public void seIncluyeUnRecursoDeRegistroEnElContenidoDeLaRespuestaConLosValoresDeLaFechaActualComoFechaDeRegistro5254814904986750P152(String p1) {
        actionwords.seIncluyeUnRecursoDeRegistroEnElContenidoDeLaRespuestaConLosValoresDeLaFechaActualComoFechaDeRegistro5254814904986750P152(p1);
    }

    @When("una solicitud de post es enviada con los valores 524, 485, 484, 498\\.33, 50, {string}, 7, 2")
    public void unaSolicitudDePostEsEnviadaConLosValores5244854844983350P172(String p1) {
        actionwords.unaSolicitudDePostEsEnviadaConLosValores5244854844983350P172(p1);
    }

    @When("una solicitud de post es enviada con los valores 525, 486, 484, 498\\.67, 50, {string}, 5, 10")
    public void unaSolicitudDePostEsEnviadaConLosValores5254864844986750P1510(String p1) {
        actionwords.unaSolicitudDePostEsEnviadaConLosValores5254864844986750P1510(p1);
    }

    @When("una solicitud de post es enviada con los valores 545, 543, 500, 513\\.33, 16, 50, 30, 62, {string}, 5, 2")
    public void unaSolicitudDePostEsEnviadaConLosValores5455435005133316503062P152(String p1) {
        actionwords.unaSolicitudDePostEsEnviadaConLosValores5455435005133316503062P152(p1);
    }

    @Then("se incluye un recurso de registro en el contenido de la respuesta, con los valores de la fecha actual como fecha de registro, 545, 543, 500, 513\\.33, 16, 50, 30, 62, {string}, 5, 2")
    public void seIncluyeUnRecursoDeRegistroEnElContenidoDeLaRespuestaConLosValoresDeLaFechaActualComoFechaDeRegistro5455435005133316503062P152(String p1) {
        actionwords.seIncluyeUnRecursoDeRegistroEnElContenidoDeLaRespuestaConLosValoresDeLaFechaActualComoFechaDeRegistro5455435005133316503062P152(p1);
    }

    @When("una solicitud de post es enviada con los valores 543, 493, 497, 511, 18, 50, 30, 62, {string}, 7, 2")
    public void unaSolicitudDePostEsEnviadaConLosValores54349349751118503062P172(String p1) {
        actionwords.unaSolicitudDePostEsEnviadaConLosValores54349349751118503062P172(p1);
    }

    @When("una solicitud de post es enviada con los valores 545, 543, 500, 513\\.33, 30, 50, 30, 62, {string}, 5, 10")
    public void unaSolicitudDePostEsEnviadaConLosValores5455435005133330503062P1510(String p1) {
        actionwords.unaSolicitudDePostEsEnviadaConLosValores5455435005133330503062P1510(p1);
    }

    @When("una solicitud de post es enviada con los valores 4, 22\\.0, 23-24, 2192, 92, 20\\.0, {string}, {string}, 5, 2")
    public void unaSolicitudDePostEsEnviadaConLosValores42202324219292200P1P252(String p1, String p2) {
        actionwords.unaSolicitudDePostEsEnviadaConLosValores42202324219292200P1P252(p1, p2);
    }

    @Then("se incluye un recurso de registro en el contenido de la respuesta, con los valores de la fecha actual como fecha de registro, 4, 22\\.0, 23-24, 2192, 92, 20\\.0, {string}, {string}, 5, 2")
    public void seIncluyeUnRecursoDeRegistroEnElContenidoDeLaRespuestaConLosValoresDeLaFechaActualComoFechaDeRegistro42202324219292200P1P252(String p1, String p2) {
        actionwords.seIncluyeUnRecursoDeRegistroEnElContenidoDeLaRespuestaConLosValoresDeLaFechaActualComoFechaDeRegistro42202324219292200P1P252(p1, p2);
    }

    @When("una solicitud de post es enviada con los valores 4, 22\\.0, 23-24, 2192, 92, 20\\.0, {string}, {string}, 7, 2")
    public void unaSolicitudDePostEsEnviadaConLosValores42202324219292200P1P272(String p1, String p2) {
        actionwords.unaSolicitudDePostEsEnviadaConLosValores42202324219292200P1P272(p1, p2);
    }

    @When("una solicitud de post es enviada con los valores 4, 22\\.0, 23-24, 2192, 92, 20\\.0, {string}, {string}, 5, 10")
    public void unaSolicitudDePostEsEnviadaConLosValores42202324219292200P1P2510(String p1, String p2) {
        actionwords.unaSolicitudDePostEsEnviadaConLosValores42202324219292200P1P2510(p1, p2);
    }
}