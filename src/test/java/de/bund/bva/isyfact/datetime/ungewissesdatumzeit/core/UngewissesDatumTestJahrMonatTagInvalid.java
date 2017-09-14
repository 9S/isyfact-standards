package de.bund.bva.isyfact.datetime.ungewissesdatumzeit.core;

import java.time.DateTimeException;
import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

/**
 * @author Björn Saxe, msg systems ag
 */
@RunWith(Parameterized.class)
public class UngewissesDatumTestJahrMonatTagInvalid {

    @Parameterized.Parameters(name = "{index}: of(Jahr={0}, Monat={1}, Tag={2})")
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {
            // Jahr, Monat,   Tag
            { 0, 0, -1 }, { 0, -1, 0 }, { 0, -1, -1 }, { -1, 0, 0 }, { -1, 0, -1 }, { -1, -1, 0 },
            { -1, -1, -1 }, { 0, 0, 10000 }, { 0, 10000, 0 }, { 0, 10000, 10000 }, { 10000, 0, 0 },
            { 10000, 0, 10000 }, { 10000, 10000, 0 }, { 10000, 10000, 10000 }, { 0, 0, 1 }, { 0, 1, 1 },
            { 1, 0, 1 } });
    }

    @Parameterized.Parameter
    public int jahr;

    @Parameterized.Parameter(1)
    public int monat;

    @Parameterized.Parameter(2)
    public int tag;

    @Test(expected = DateTimeException.class)
    public void ofJahrMonatTag() {
        UngewissesDatum.of(jahr, monat, tag);
    }
}