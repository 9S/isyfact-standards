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
package de.bund.bva.isyfact.serviceapi.core.serviceimpl;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import de.bund.bva.isyfact.exception.BaseException;
import de.bund.bva.isyfact.exception.TechnicalRuntimeException;
import de.bund.bva.pliscommon.exception.service.PlisTechnicalToException;
import de.bund.bva.pliscommon.exception.service.PlisToException;

/**
 * Defines how exceptions of the application core are mapped to TO exceptions in a service component.
 * This annotation must be used in the implementation package
 * of the service component (package name = package name of the RemoteBean interface + ".impl").
 */
@Target(ElementType.PACKAGE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface ExceptionMapping {

    /**
     * The technical TO exception to which all {@link TechnicalRuntimeException} and all unchecked exceptions are mapped.
     */
    Class<? extends PlisTechnicalToException> technicalToException();

    /**
     * Images from {@link BaseException Exceptions} at {@link PlisToException PlisToExceptions}.
     */
    Mapping[] mappings();
}
