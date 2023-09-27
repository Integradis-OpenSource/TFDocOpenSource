package com.example;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;

public class StepDefinitions {
    public Actionwords actionwords = new Actionwords();

    @Given("el visitante tenga una consulta o comentario relacionado con la aplicación")
    public void elVisitanteTengaUnaConsultaOComentarioRelacionadoConLaAplicacion() {
        actionwords.elVisitanteTengaUnaConsultaOComentarioRelacionadoConLaAplicacion();
    }

    @When("redacte un mensaje y adjunte una dirección de correo electronico para contactar a los desarrolladores")
    public void redacteUnMensajeYAdjunteUnaDireccionDeCorreoElectronicoParaContactarALosDesarrolladores() {
        actionwords.redacteUnMensajeYAdjunteUnaDireccionDeCorreoElectronicoParaContactarALosDesarrolladores();
    }

    @Then("el sistema remitirá la consulta a los desarrolladores")
    public void elSistemaRemitiraLaConsultaALosDesarrolladores() {
        actionwords.elSistemaRemitiraLaConsultaALosDesarrolladores();
    }

    @Given("el visitante se encuentre dentro de la landing page")
    public void elVisitanteSeEncuentreDentroDeLaLandingPage() {
        actionwords.elVisitanteSeEncuentreDentroDeLaLandingPage();
    }

    @When("navegue a través de las diversas secciones")
    public void navegueATravesDeLasDiversasSecciones() {
        actionwords.navegueATravesDeLasDiversasSecciones();
    }

    @Then("podrá encontrar información clara y concisa que me permita entender de inmediato el propósito principal del software")
    public void podraEncontrarInformacionClaraYConcisaQueMePermitaEntenderDeInmediatoElPropositoPrincipalDelSoftware() {
        actionwords.podraEncontrarInformacionClaraYConcisaQueMePermitaEntenderDeInmediatoElPropositoPrincipalDelSoftware();
    }

    @Given("el usuario desee comenzar a utilizar la aplicación")
    public void elUsuarioDeseeComenzarAUtilizarLaAplicacion() {
        actionwords.elUsuarioDeseeComenzarAUtilizarLaAplicacion();
    }

    @When("ingrese a la landing page y seleccione la opción que permite el acceso al software elaborado")
    public void ingreseALaLandingPageYSeleccioneLaOpcionQuePermiteElAccesoAlSoftwareElaborado() {
        actionwords.ingreseALaLandingPageYSeleccioneLaOpcionQuePermiteElAccesoAlSoftwareElaborado();
    }

    @Then("deberá ser redirigido a la página desplegada")
    public void deberaSerRedirigidoALaPaginaDesplegada() {
        actionwords.deberaSerRedirigidoALaPaginaDesplegada();
    }

    @When("ingrese a la landing page y seleccione la opción que permite el acceso al software elaborado y ocurra un error en el proceso de redirección o el servidor de la aplicación no responde")
    public void ingreseALaLandingPageYSeleccioneLaOpcionQuePermiteElAccesoAlSoftwareElaboradoYOcurraUnErrorEnElProcesoDeRedireccionOElServidorDeLaAplicacionNoResponde() {
        actionwords.ingreseALaLandingPageYSeleccioneLaOpcionQuePermiteElAccesoAlSoftwareElaboradoYOcurraUnErrorEnElProcesoDeRedireccionOElServidorDeLaAplicacionNoResponde();
    }

    @Then("el usuario deberá obtener un mensaje de error generado")
    public void elUsuarioDeberaObtenerUnMensajeDeErrorGenerado() {
        actionwords.elUsuarioDeberaObtenerUnMensajeDeErrorGenerado();
    }

    @Given("a un técnico o supervisor le corresponda realizar un registro preiódico durante la fase 0")
    public void aUnTecnicoOSupervisorLeCorrespondaRealizarUnRegistroPreiodicoDuranteLaFase0() {
        actionwords.aUnTecnicoOSupervisorLeCorrespondaRealizarUnRegistroPreiodicoDuranteLaFase0();
    }

    @When("ingrese la información asociada a los insumos a utilizar")
    public void ingreseLaInformacionAsociadaALosInsumosAUtilizar() {
        actionwords.ingreseLaInformacionAsociadaALosInsumosAUtilizar();
    }

    @Then("el sistema guardará el reporte en la base de datos")
    public void elSistemaGuardaraElReporteEnLaBaseDeDatos() {
        actionwords.elSistemaGuardaraElReporteEnLaBaseDeDatos();
    }

    @Given("a un técnico supervisor le corresponda realizar un registro periódico durante la fase 0")
    public void aUnTecnicoSupervisorLeCorrespondaRealizarUnRegistroPeriodicoDuranteLaFase0() {
        actionwords.aUnTecnicoSupervisorLeCorrespondaRealizarUnRegistroPeriodicoDuranteLaFase0();
    }

    @When("no ingrese toda la información obligatoria solicitada dentro de un registro")
    public void noIngreseTodaLaInformacionObligatoriaSolicitadaDentroDeUnRegistro() {
        actionwords.noIngreseTodaLaInformacionObligatoriaSolicitadaDentroDeUnRegistro();
    }

    @Then("el sistema rechazará la operación y solicitará completar campos restantes")
    public void elSistemaRechazaraLaOperacionYSolicitaraCompletarCamposRestantes() {
        actionwords.elSistemaRechazaraLaOperacionYSolicitaraCompletarCamposRestantes();
    }

    @Given("a un tecnico supervisor le corresponde realizar un registro periódico sobre mezcla de insumos durante la fase de {string}")
    public void aUnTecnicoSupervisorLeCorrespondeRealizarUnRegistroPeriodicoSobreMezclaDeInsumosDuranteLaFaseDeP1(String p1) {
        actionwords.aUnTecnicoSupervisorLeCorrespondeRealizarUnRegistroPeriodicoSobreMezclaDeInsumosDuranteLaFaseDeP1(p1);
    }

    @When("ingrese las actividades realizadas en el patio")
    public void ingreseLasActividadesRealizadasEnElPatio() {
        actionwords.ingreseLasActividadesRealizadasEnElPatio();
    }

    @Given("a un técnico supervisor le corresponda realizar un registro periódico sobre la mezcla de insumos durante la fase {string}")
    public void aUnTecnicoSupervisorLeCorrespondaRealizarUnRegistroPeriodicoSobreLaMezclaDeInsumosDuranteLaFaseP1(String p1) {
        actionwords.aUnTecnicoSupervisorLeCorrespondaRealizarUnRegistroPeriodicoSobreLaMezclaDeInsumosDuranteLaFaseP1(p1);
    }

    @Then("el sistema rechazará la operación y solicitará completar los campos restantes")
    public void elSistemaRechazaraLaOperacionYSolicitaraCompletarLosCamposRestantes() {
        actionwords.elSistemaRechazaraLaOperacionYSolicitaraCompletarLosCamposRestantes();
    }

    @Given("a un técnico supervisor le corresponda realizar un registro periódico sobre la colección del compost durante la fase {string}")
    public void aUnTecnicoSupervisorLeCorrespondaRealizarUnRegistroPeriodicoSobreLaColeccionDelCompostDuranteLaFaseP1(String p1) {
        actionwords.aUnTecnicoSupervisorLeCorrespondaRealizarUnRegistroPeriodicoSobreLaColeccionDelCompostDuranteLaFaseP1(p1);
    }

    @When("ingrese la infromación asociada al estado del compost en cocción dentro del búnker")
    public void ingreseLaInfromacionAsociadaAlEstadoDelCompostEnCoccionDentroDelBunker() {
        actionwords.ingreseLaInfromacionAsociadaAlEstadoDelCompostEnCoccionDentroDelBunker();
    }

    @Given("a un técnico supervisor le corresponda realizar un registro periódico sobre la cocción del compost durante la fase {string}")
    public void aUnTecnicoSupervisorLeCorrespondaRealizarUnRegistroPeriodicoSobreLaCoccionDelCompostDuranteLaFaseP1(String p1) {
        actionwords.aUnTecnicoSupervisorLeCorrespondaRealizarUnRegistroPeriodicoSobreLaCoccionDelCompostDuranteLaFaseP1(p1);
    }

    @Given("a un técnico supervisor le corresponda realizar un registro periódico sobre la pasteurización, enfriamiento y acondicionamiento del compost durante la fase de {string}")
    public void aUnTecnicoSupervisorLeCorrespondaRealizarUnRegistroPeriodicoSobreLaPasteurizacionEnfriamientoYAcondicionamientoDelCompostDuranteLaFaseDeP1(String p1) {
        actionwords.aUnTecnicoSupervisorLeCorrespondaRealizarUnRegistroPeriodicoSobreLaPasteurizacionEnfriamientoYAcondicionamientoDelCompostDuranteLaFaseDeP1(p1);
    }

    @When("ingrese la información asociada al estado del compost dentro del túnel de pasteurización")
    public void ingreseLaInformacionAsociadaAlEstadoDelCompostDentroDelTunelDePasteurizacion() {
        actionwords.ingreseLaInformacionAsociadaAlEstadoDelCompostDentroDelTunelDePasteurizacion();
    }

    @Given("a un técnico supervisor le corresponda realizar un registro periódico sobre la incubación del champiñón durante la fase {string}")
    public void aUnTecnicoSupervisorLeCorrespondaRealizarUnRegistroPeriodicoSobreLaIncubacionDelChampinonDuranteLaFaseP1(String p1) {
        actionwords.aUnTecnicoSupervisorLeCorrespondaRealizarUnRegistroPeriodicoSobreLaIncubacionDelChampinonDuranteLaFaseP1(p1);
    }

    @When("ingrese la información asociada al estado actual del cultivo dentro de las naves")
    public void ingreseLaInformacionAsociadaAlEstadoActualDelCultivoDentroDeLasNaves() {
        actionwords.ingreseLaInformacionAsociadaAlEstadoActualDelCultivoDentroDeLasNaves();
    }

    @Given("a un técnico supervisor le corresponda realizar un registro periódico sobre la cobertura del micelio durante la fase {string}")
    public void aUnTecnicoSupervisorLeCorrespondaRealizarUnRegistroPeriodicoSobreLaCoberturaDelMicelioDuranteLaFaseP1(String p1) {
        actionwords.aUnTecnicoSupervisorLeCorrespondaRealizarUnRegistroPeriodicoSobreLaCoberturaDelMicelioDuranteLaFaseP1(p1);
    }

    @Given("a un técnico supervisor le corresponda realizar un registro periódico sobre el micelio inducido durante la fase {string}")
    public void aUnTecnicoSupervisorLeCorrespondaRealizarUnRegistroPeriodicoSobreElMicelioInducidoDuranteLaFaseP1(String p1) {
        actionwords.aUnTecnicoSupervisorLeCorrespondaRealizarUnRegistroPeriodicoSobreElMicelioInducidoDuranteLaFaseP1(p1);
    }

    @Given("a un técnico supervisor le corresponda realizar un registro periódico sobre el estado final del cultivo de champiñones durante la fase {string}")
    public void aUnTecnicoSupervisorLeCorrespondaRealizarUnRegistroPeriodicoSobreElEstadoFinalDelCultivoDeChampinonesDuranteLaFaseP1(String p1) {
        actionwords.aUnTecnicoSupervisorLeCorrespondaRealizarUnRegistroPeriodicoSobreElEstadoFinalDelCultivoDeChampinonesDuranteLaFaseP1(p1);
    }

    @Given("el usuario desee visualizar la información y estructura de la empresa")
    public void elUsuarioDeseeVisualizarLaInformacionYEstructuraDeLaEmpresa() {
        actionwords.elUsuarioDeseeVisualizarLaInformacionYEstructuraDeLaEmpresa();
    }

    @When("ingrese al perfil de la misma")
    public void ingreseAlPerfilDeLaMisma() {
        actionwords.ingreseAlPerfilDeLaMisma();
    }

    @Then("obtendrá una lista con los datos de la empresa y los empleados registrados")
    public void obtendraUnaListaConLosDatosDeLaEmpresaYLosEmpleadosRegistrados() {
        actionwords.obtendraUnaListaConLosDatosDeLaEmpresaYLosEmpleadosRegistrados();
    }

    @Given("el usuario desee visualizar la información de un empleado")
    public void elUsuarioDeseeVisualizarLaInformacionDeUnEmpleado() {
        actionwords.elUsuarioDeseeVisualizarLaInformacionDeUnEmpleado();
    }

    @When("ingrese al perfil del mismo")
    public void ingreseAlPerfilDelMismo() {
        actionwords.ingreseAlPerfilDelMismo();
    }

    @Then("el obtendrá los datos de relevancia, tales como nombre, rol, empresa a la cual pertenece, etc\\.")
    public void elObtendraLosDatosDeRelevanciaTalesComoNombreRolEmpresaALaCualPerteneceEtc() {
        actionwords.elObtendraLosDatosDeRelevanciaTalesComoNombreRolEmpresaALaCualPerteneceEtc();
    }
}