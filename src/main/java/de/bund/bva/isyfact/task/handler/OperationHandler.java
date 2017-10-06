package de.bund.bva.isyfact.task.handler;

import de.bund.bva.isyfact.task.exception.CreateOperationInstanceException;
import de.bund.bva.isyfact.task.model.Operation;
import de.bund.bva.pliscommon.konfiguration.common.Konfiguration;
import org.springframework.context.ApplicationContext;

/**
 * Der OperationHandler ist ein Werkzeug für den Bau von Operation-Instanzen.
 *
 * @author Alexander Salvanos, msg systems ag
 */
public interface OperationHandler {
    Operation getOperation(String id, ApplicationContext applicationContext)
        throws CreateOperationInstanceException;
}
