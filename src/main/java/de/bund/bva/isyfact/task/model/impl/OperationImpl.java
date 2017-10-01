package de.bund.bva.isyfact.task.model.impl;

import de.bund.bva.isyfact.task.model.FixedRate;
import de.bund.bva.isyfact.task.model.Operation;

/**
 * Eine CallableOperation enthält die Anweisungen, die erledigt werden sollen.
 * Diese werden in einer call-Methode oder in einer run-Methode implementiert.
 *
 * @author Alexander Salvanos, msg systems ag
 *
 */
public abstract class OperationImpl implements Operation {
    private volatile ThreadLocal<String> id
            = new ThreadLocal<>();
    private volatile ThreadLocal<String> hostName
            = new ThreadLocal<>();
    private volatile ThreadLocal<Boolean> hasBeenExecutedSuccessfully
            = new ThreadLocal<>();
    private volatile ThreadLocal<String> errorMessage
            = new ThreadLocal<>();
    private volatile ThreadLocal<FixedRate> fixedRate
            = new ThreadLocal<>();
    private volatile ThreadLocal<String> threadLocalResult = new ThreadLocal<>();

    public OperationImpl() {}

    @Override
    public String getId() {
        return id.get();
    }

    @Override
    public void setId(String id) {
        this.id.set(id);
    }

    public String getHostName() {
        return hostName.get();
    }

    @Override
    public void setHostName(String hostName) {
        this.hostName.set(hostName);
    }

    @Override
    public synchronized boolean getHasBeenExecutedSuccessfully() {
        return hasBeenExecutedSuccessfully.get().booleanValue();
    }

    @Override
    public synchronized void setHasBeenExecutedSuccessfully(
            boolean hasBeenExecutedSuccessfully) {
        this.hasBeenExecutedSuccessfully.set(hasBeenExecutedSuccessfully);
    }

    @Override
    public synchronized String getErrorMessage() {
        return errorMessage.get();
    }

    @Override
    public synchronized void setErrorMessage(String errorMessage) {
        this.errorMessage.set(errorMessage);
    }

    @Override
    public FixedRate getFixedRate() {
        return fixedRate.get();
    }

    @Override
    public void setFixedRate(FixedRate fixedRate) {
        this.fixedRate.set(fixedRate);
    }

    @Override
    public String get() {
        return threadLocalResult.get();
    }

    @Override
    public void set(String result) {
        threadLocalResult.set(result);
    }
}
