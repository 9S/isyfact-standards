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
package de.bund.bva.isyfact.konfiguration.common.exception;

/**
 * Exception für Fehler, die beim Arbeiten mit Konfigurationsdateien auftreten.
 * 
 *
 */
public class KonfigurationDateiException extends KonfigurationException {

    /**
     * UID.
     */
    private static final long serialVersionUID = 7599335414052120366L;

    /**
     * Erstellt eine neue technische <i>unchecked</i> KonfigurationException mit einer Ausnahme-ID für
     * den Fehlertext, einem Werten für die Variablenersetzung im Fehlertext und mit dem übergebenen
     * Grund.
     * <p>
     * Anmerkung: Der Fehlertext von <code>cause</code> (dem Grund) ist <i>nicht</i> automatisch mit dem
     * übergebenen Fehlertext verbunden.
     * 
     * @param ausnahmeId
     *            Die Ausnahme-ID. Der Schlüssel, welcher verwendet wird, um einen Nachrichtentext,
     *            welcher als Fehler-Nachricht für die Exception verwendet wird aus einem ResourceBundle
     *            zu laden.
     * @param cause
     *            Der Grund. Throwable wird gespeichert hfür die spätere Nutzung durch die Methode
     *            {@link #getCause()}. <code>null</code> als Wert ist erlaubt und bedeutet, dass kein Grund
     *            existiert oder der Grund nicht bekannt ist.
     * @param parameter
     *            Die variablen Parameterwerte. Parameterwerte für die möglichen Variablen in einer
     *            Fehler-Nachricht. <code>null</code> als Wert ist erlaubt und bedeutet, dass kein Variablen zu
     *            ersetzen sind.            
     */
    public KonfigurationDateiException(String ausnahmeId, Throwable cause, String... parameter) {
        super(ausnahmeId, cause, parameter);
    }

    /**
     * Erstellt eine neue technische <i>unchecked</i> KonfigurationException mit einer Ausnahme-ID für
     * den Fehlertext und dem übergebenen Grund.
     * <p>
     * Anmerkung: Der Fehlertext von <code>cause</code> (dem Grund) ist <i>nicht</i> automatisch mit dem
     * übergebenen Fehlertext verbunden.
     * 
     * @param ausnahmeId
     *            Die Ausnahme-ID. Der Schlüssel, welcher verwendet wird, um einen Nachrichtentext,
     *            welcher als Fehler-Nachricht für die Exception verwendet wird aus einem ResourceBundle
     *            zu laden.
     * @param throwable
     *            Der Grund. Throwable wird gespeichert für die spätere Nutzung durch die Methode
     *            {@link #getCause()}. <code>null</code> als Wert ist erlaubt und bedeutet, dass kein Grund
     *            existiert oder der Grund nicht bekannt ist.
     */
    public KonfigurationDateiException(String ausnahmeId, Throwable throwable) {
        super(ausnahmeId, throwable);
    }

    /**
     * Erstellt eine neue <i>unchecked</i> KonfigurationException mit einer Ausnahme-ID für den
     * Fehlertext.
     * <p>
     * Der Grund wird nicht initialisiert und kann später durch den Aufruf der Methode
     * {@link #initCause(Throwable)} initialisiert werden.
     * 
     * @param ausnahmeId
     *            Die Ausnahme-ID. Der Schlüssel, welcher verwendet wird, um einen Nachrichtentext,
     *            welcher als Fehler-Nachricht für die Exception verwendet wird aus einem ResourceBundle
     *            zu laden.
     */
    public KonfigurationDateiException(String ausnahmeId) {
        super(ausnahmeId);
    }

    /**
     * Erstellt eine neue <i>unchecked</i> KonfigurationException mit einer Fehler-ID für den Fehlertext
     * und einem Werten für die Variablenersetzung im Fehlertext. Au&szlig;serdem wird, wie im Default
     * Konstruktor, <code>null</code> als Fehlertext verwendet.
     * <p>
     * Der Grund wird nicht initialisiert und kann später durch den Aufruf der Methode
     * {@link #initCause(Throwable)} initialisiert werden.
     * 
     * @param ausnahmeId
     *            Die Fehler-ID. Der Schlüssel, welcher verwendet wird, um einen Nachrichtentext, welcher
     *            als Fehler-Nachricht für die Exception verwendet wird aus einem ResourceBundle zu
     *            laden.
     * @param parameter
     *            Die variablen Parameterwerte. Parameterwerte f&uml;r die möglichen Variablen in einer
     *            Fehler-Nachricht. <code>null</code> als Wert ist erlaubt und bedeutet, dass kein Variablen zu
     *            ersetzen sind.
     */
    public KonfigurationDateiException(String ausnahmeId, String... parameter) {
        super(ausnahmeId, parameter);
    }

}
