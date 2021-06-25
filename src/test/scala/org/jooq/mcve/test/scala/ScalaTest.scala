package org.jooq.mcve.test.scala

import org.jooq.mcve.java.Tables.TEST
import org.jooq.mcve.test.java.AbstractTest
import org.junit.Assert.assertEquals
import org.junit.Test


class ScalaTest extends AbstractTest {

  @Test
  def mcveTest(): Unit = {
    val result = ctx
      .insertInto(TEST)
      .columns(TEST.COMPANY_ID, TEST.NAME)
      .values("42", "A name")
      .returning(TEST.COMPANY_ID)
      .fetchOne

    result.refresh
    assertEquals("42", result.getCompanyId)
  }
}
