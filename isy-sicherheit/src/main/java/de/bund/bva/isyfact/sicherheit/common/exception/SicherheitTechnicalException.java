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

import de.bund.bva.isyfact.exception.FehlertextProvider;
import de.bund.bva.isyfact.exception.BaseException;

/**
 * Abstrakte technische <i>checked</i> Hauptexception. Alle technischen, <i>checked</i> Exceptions im
 * Service-Gateway müssen von dieser Klasse abgeleitet werden.
 * 
 * 
 */
public abstract class SicherheitTechnicalException extends BaseException {

    /**
     * Zum Zugriff auf die Fehlertexte.
     */
    private static final FehlertextProvider FEHLERTEXT_PROVIDER = new SicherheitFehlertextProvider();

    /** Die UID. */
    private static final long serialVersionUID = 5018039454021358342L;

    /**
     * Erstellt eine neue <i>checked</i> Exception mit einer Ausnahme-ID für den Fehlertext und einem Array
     * mit Werten für die Variablenersetzung im Fehlertext.
     * <p>
     * Der Grund wird nicht initialisiert und kann später durch den Aufruf der Methode
     * {@link #initCause(Throwable)} initialisiert werden.
     * 
     * @param ausnahmeID
     *            Die Ausnahme-ID. Der Schlüssel der den Fehlertext identifiziert.
     * @param parameter
     *            Die Parameter. Parameter für die möglichen Variablen in einer Fehler-Nachricht.
     *            <code>null</code> als Wert ist erlaubt und bedeutet, dass kein Variablen zu ersetzen sind.
     */
    public SicherheitTechnicalException(String ausnahmeID, String... parameter) {
        super(ausnahmeID, FEHLERTEXT_PROVIDER, parameter);
    }

    /**
     * Erstellt eine neue <i>checked</i> Exception mit einer Ausnahme-ID für den Fehlertext, einem Array mit
     * Werten für die Variablenersetzung im Fehlertext und mit dem übergebenen Grund.
     * <p>
     * Anmerkung: Der Fehlertext von <code>cause</code> (dem Grund) ist <i>nicht</i> automatisch mit dem
     * übergebenen Fehlertext verbunden.
     * 
     * @param ausnahmeID
     *            Die Ausnahme-ID. Der Schlüssel der den Fehlertext identifiziert.
     * @param parameter
     *            Die Parameter. Parameter für die möglichen Variablen in einer Fehler-Nachricht.
     *            <code>null</code> als Wert ist erlaubt und bedeutet, dass kein Variablen zu ersetzen sind.
     * @param throwable
     *            Der Grund. Throwable wird gespeichert für die spätere Nutzung durch die Methode
     *            {@link #getCause()}. <code>null</code> als Wert ist erlaubt und bedeutet, dass kein Grund
     *            existiert oder der Grund nicht bekannt ist.
     */
    public SicherheitTechnicalException(String ausnahmeID, Throwable throwable, String... parameter) {
        super(ausnahmeID, throwable, FEHLERTEXT_PROVIDER, parameter);
    }

}
