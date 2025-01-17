/*
 * See the NOTICE file distributed with this work for additional
 * information regarding copyright ownership.
 * The Federal Office of Administration (Bundesverwaltungsamt, BVA)
 * licenses this file to you under the Apache License, Version 2.0 (the
 * License). You may not use this file except in compliance with the
 * License. You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or
 * implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package de.bund.bva.isyfact.sicherheit.common.exception;

/**
 * Diese Klasse kapselt alle Exceptions die beim Aufruf der Methode authorisiere des Interfaces Sicherheit
 * auftreten.
 *
 */
public class AutorisierungFehlgeschlagenException extends SicherheitTechnicalRuntimeException {

    /**
     * Serial Id.
     */
    private static final long serialVersionUID = -5582929933896402663L;

    /**
     * Erstellt eine neue fachliche <i>checked</i> Exception mit einer Ausnahme-ID für den Fehlertext.
     * Außerdem wird, wie im Default Konstruktor, <code>null</code> als Fehlertext verwendet.
     * <p>
     * Der Grund wird nicht initialisiert und kann später durch den Aufruf der Methode
     * {@link #initCause(Throwable)} initialisiert werden.
     *
     * @param ausnahmeID
     *            Die Ausnahme-ID. Der Schlüssel, welcher verwendet wird, um einen Nachrichtentext, welcher
     *            als Fehler-Nachricht für die Exception verwendet wird aus einem ResourceBundle zu laden.
     */
    public AutorisierungFehlgeschlagenException(String ausnahmeID) {
        super(ausnahmeID);
    }

    /**
     * Erstellt eine neue fachliche <i>checked</i> Exception mit einer Ausnahme-ID für den Fehlertext.
     * Außerdem wird, wie im Default Konstruktor, <code>null</code> als Fehlertext verwendet.
     * <p>
     * Der Grund wird nicht initialisiert und kann später durch den Aufruf der Methode
     * {@link #initCause(Throwable)} initialisiert werden.
     *
     * @param ausnahmeID
     *            Die Ausnahme-ID. Der Schlüssel, welcher verwendet wird, um einen Nachrichtentext, welcher
     *            als Fehler-Nachricht für die Exception verwendet wird aus einem ResourceBundle zu laden.
     * @param parameter
     *            Die Parameter. Parameter für die möglichen Variablen in einer Fehler-Nachricht.
     *            <code>null</code> als Wert ist erlaubt und bedeutet, dass kein Variablen zu ersetzen sind.
     */
    public AutorisierungFehlgeschlagenException(String ausnahmeID, String... parameter) {
        super(ausnahmeID, parameter);
    }

    /**
     * Erstellt eine neue fachliche <i>checked</i> Exception mit einer Ausnahme-ID für den Fehlertext und dem
     * übergebenen Grund mit dem Fehlertext basierend auf <code>(cause==null ? null : cause.toString())</code>
     * (was normalerweise die Klasse und den Fehlertext von <code>cause</code> enthält).
     * <p>
     * Dieser Konstruktor ist sinnvoll für Fehler, die durch diese Exception gewrapped werden sollen, z.B.
     * {@link java.security.PrivilegedActionException}).
     *
     * @param ausnahmeID
     *            Die Ausnahme-ID. Der Schlüssel, welcher verwendet wird, um einen Nachrichtentext, welcher
     *            als Fehler-Nachricht für die Exception verwendet wird aus einem ResourceBundle zu laden.
     * @param throwable
     *            Der Grund. Throwable wird gespeichert für die spätere Nutzung durch die Methode
     *            {@link #getCause()}. <code>null</code> als Wert ist erlaubt und bedeutet, dass kein Grund
     *            existiert oder der Grund nicht bekannt ist.
     */
    public AutorisierungFehlgeschlagenException(String ausnahmeID, Throwable throwable) {
        super(ausnahmeID, throwable);
    }

}
