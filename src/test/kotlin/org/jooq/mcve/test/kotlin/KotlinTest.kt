package org.jooq.mcve.test.kotlin

import org.jooq.mcve.java.Tables.TEST
import org.jooq.mcve.test.java.AbstractTest
import org.junit.Assert.assertEquals
import org.junit.Test

class KotlinTest : AbstractTest() {

    @Test
    fun mcveTest() {
        val result = ctx
                .insertInto(TEST)
                .columns(TEST.COMPANY_ID, TEST.NAME)
                .values("42", "Some name")
                .returning(TEST.COMPANY_ID)
                .fetchOne()

        result?.refresh()
        assertEquals("42", result?.companyId)
    }
}
