package de.bund.bva.isyfact.logging;

import de.bund.bva.isyfact.logging.util.MdcHelper;
import org.junit.Ignore;
import org.junit.Test;

/*
 * #%L
 * isy-logging
 * %%
 * 
 * %%
 * See the NOTICE file distributed with this work for additional
 * information regarding copyright ownership.
 * The Federal Office of Administration (Bundesverwaltungsamt, BVA)
 * licenses this file to you under the Apache License, Version 2.0 (the
 * "License"). You may not use this file except in compliance with the
 * License. You may obtain a copy of the License at
 * 
 *     http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or
 * implied. See the License for the specific language governing
 * permissions and limitations under the License.
 * #L%
 */

/**
 * Testfälle zum Kennzeichnen des MDCs mit Fachdaten.
 */
@Ignore("Gradle does not use the main thread to run tests, making log output different")
public class MdcFachdatenTest extends AbstractLogTest {
    
    /**
     * Tests der Logausgabe des MDC-Fachdaten flags.
     */
    @Test
    public void testMdcFachdaten() {
        IsyLoggerStandard logger = IsyLoggerFactory.getLogger(this.getClass());
        logger.debug("MdcFachdaten wurde nicht gesetzt.");
        
        MdcHelper.setzeMarkerFachdaten(true);
        logger.debug("MdcFachdaten wurde auf 'true' gesetzt.");
        
        MdcHelper.setzeMarkerFachdaten(false);
        logger.debug("MdcFachdaten wurde auf 'false' gesetzt.");
        
        MdcHelper.entferneMarkerFachdaten();
        logger.debug("MdcFachdaten wurde auf 'null' gesetzt.");
        
        pruefeLogdatei("testMdcFachdaten");
    }

}
