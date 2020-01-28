package de.bund.bva.pliscommon.persistence.datetime.attributeconverter;

import java.sql.Date;
import java.time.LocalDate;
import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

/**
 * {@link javax.persistence.AttributeConverter} für {@link LocalDate}.
 *
 */
@Deprecated
@Converter//(autoApply = true) // Auskommentiert damit dieser nicht mehr angewandt wird.
public class LocalDateAttributeConverter implements AttributeConverter<LocalDate, Date> {

    @Override
    public Date convertToDatabaseColumn(LocalDate localDate) {
        if (localDate == null) {
            return null;
        }

        return Date.valueOf(localDate);
    }

    @Override
    public LocalDate convertToEntityAttribute(Date date) {
        if (date == null) {
            return null;
        }
        return date.toLocalDate();
    }
}
