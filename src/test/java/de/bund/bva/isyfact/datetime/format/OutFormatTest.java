package de.bund.bva.isyfact.datetime.format;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Björn Saxe, msg systems ag
 */
public class OutFormatTest {

    @Test
    public void toDauerStringPeriod() {
        Period period = Period.of(2, 3, 5);

        assertEquals("2a 3M 5d", OutFormat.toDauerString(period));

        period = Period.of(2, 0, 5);

        assertEquals("2a 5d", OutFormat.toDauerString(period));

        period = Period.ZERO;

        assertEquals("", OutFormat.toDauerString(period));
    }

    @Test
    public void toDauerStringDuration() {
        final long eineStundeMinuteSekundeMillisekunde = 3661001;

        Duration duration = Duration.ofMillis(eineStundeMinuteSekundeMillisekunde);

        assertEquals("1h 1min 1s 1ms", OutFormat.toDauerString(duration));

        duration = Duration.ZERO;

        assertEquals("", OutFormat.toDauerString(duration));
    }
}