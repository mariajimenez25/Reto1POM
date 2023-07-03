package is.demo.serenity.stepDefinitions;


import io.cucumber.java.es.*;
import is.demo.serenity.steps.*;
import net.thucydides.core.annotations.Steps;

import java.io.IOException;

public class CambioDeEmpleado {

    @Steps
    CredencialesSteps credencialesSteps;
    @Steps
    TableroSteps tableroSteps;
    @Steps
    IdOrdenSteps idOrdenSteps;
    @Steps
    EmpleadoVinculadoStep empleadoVinculadoStep;
    @Steps
    GuardadoSatisfactorioSteps guardadoSatisfactorioSteps;
    @Dado("que el usuario ingresa a la URL del portal demo serenity y realiza el inicio de sesión exitoso")
    public void queElUsuarioIngresaALaURLDelPortalDemoSerenityYRealizaElInicioDeSesiónExitoso() throws IOException {
        credencialesSteps.abrirNavegador();
        credencialesSteps.enviarUsuario();
        credencialesSteps.enviarClave();
        credencialesSteps.IniciarSesion();

    }
    @Cuando("el usuario ingresa al modulo de ordenes y selecciona una orden en especifico")
    public void elUsuarioIngresaAlModuloDeOrdenesYSeleccionaUnaOrdenEnEspecifico() {
        tableroSteps.EntrarOpenOrden();
        idOrdenSteps.SeleccionarIdOrden();

    }
    @Cuando("se asigne el responsable de la orden y guarde los cambios relacionados.")
    public void seAsigneElResponsableDeLaOrdenYGuardeLosCambiosRelacionados() {

        empleadoVinculadoStep.selectorEmpleados();
        empleadoVinculadoStep.seleccionEmpleado();
        empleadoVinculadoStep.accionAplicarCambios();

    }
    @Entonces("el usuario visualizara una alerta de guardado exitoso")
    public void elUsuarioVisualizaraUnaAlertaDeGuardadoExitoso() {
        guardadoSatisfactorioSteps.CambiosGuardados();

    }
}
