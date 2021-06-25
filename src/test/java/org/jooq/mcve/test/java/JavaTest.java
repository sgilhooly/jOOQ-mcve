package org.jooq.mcve.test.java;

import org.jooq.mcve.java.tables.records.TestRecord;
import org.junit.Test;

import static org.jooq.mcve.java.Tables.TEST;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class JavaTest extends AbstractTest {

    @Test
    public void mcveTest() {
        TestRecord record = ctx.newRecord(TEST);
        record.setCompanyId("company-01");
        record.setName("This is a name");
        record.insert();

        System.out.println("RECORD RESULT: " + record);
        assertNotNull(record.getAllocationId());
        assertEquals(0L, (long)record.getAllocationId());

    }
}
