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
package de.bund.bva.isyfact.exception;

/**
 * Abstrakte (<i>checked</i>) Hauptexception, welche als Basis für die abstrakten <b>fachlichen</b> Exceptions
 * (<i>checked</i>) auf Anwendungsebene verwendet wird.
 */
public abstract class BusinessException extends BaseException {

    /**
     * Erstellt eine fachliche neue <i>checked</i> Exception mit einer Ausnahme-ID für den Fehlertext und
     * einem Werten für die Variablenersetzung im Fehlertext.
     * <p>
     * Der Grund wird nicht initialisiert und kann später durch den Aufruf der Methode
     * {@link #initCause(Throwable)} initialisiert werden.
     *
     * @param ausnahmeId
     *            Die Ausnahme-ID. Der Schlüssel, welcher verwendet wird, um einen Nachrichtentext, welcher
     *            als Fehler-Nachricht für die Exception verwendet wird aus einem ResourceBundle zu laden.
     * @param fehlertextProvider
     *            Die FehlertextProvider-Implementierung, welche verwendet wird, um eine Fehlertext zu laden.
     * @param parameter
     *            Variable Anzahl an Parameterwerten. Parameterwert für die mögliche Variable in einer
     *            Fehler-Nachricht.
     */
    protected BusinessException(String ausnahmeId, FehlertextProvider fehlertextProvider,
        String... parameter) {

        super(ausnahmeId, fehlertextProvider, parameter);
    }

    /**
     * Erstellt eine fachliche neue <i>checked</i> Exception mit einer Ausnahme-ID für den Fehlertext, einem
     * Werten für die Variablenersetzung im Fehlertext und mit dem übergebenen Grund.
     * <p>
     * Anmerkung: Der Fehlertext von <code>cause</code> (dem Grund) ist <i>nicht</i> automatisch mit dem
     * übergebenen Fehlertext verbunden.
     *
     * @param ausnahmeId
     *            Die Ausnahme-ID. Der Schlüssel der den Fehlertext identifiziert.
     * @param throwable
     *            Der Grund. Throwable wird gespeichert für die spätere Nutzung durch die Methode
     *            {@link #getCause()}. <code>null</code> als Wert ist erlaubt und bedeutet, dass kein Grund
     *            existiert oder der Grund nicht bekannt ist.
     * @param fehlertextProvider
     *            Die FehlertextProvider-Implementierung, welche verwendet wird, um eine Fehlertext zu laden.
     * @param parameter
     *            Variable Anzahl an Parameterwerten. Parameterwert für die mögliche Variable in einer
     *            Fehler-Nachricht.
     */
    protected BusinessException(String ausnahmeId, Throwable throwable,
        FehlertextProvider fehlertextProvider, String... parameter) {

        super(ausnahmeId, throwable, fehlertextProvider, parameter);
    }

}
