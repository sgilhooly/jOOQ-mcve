/*
 * This file is generated by jOOQ.
 */
package org.jooq.mcve.kotlin.keys


import org.jooq.UniqueKey
import org.jooq.impl.DSL
import org.jooq.impl.Internal
import org.jooq.mcve.kotlin.tables.Test
import org.jooq.mcve.kotlin.tables.records.TestRecord



// -------------------------------------------------------------------------
// UNIQUE and PRIMARY KEY definitions
// -------------------------------------------------------------------------

val PK_PRIMARY_KII: UniqueKey<TestRecord> = Internal.createUniqueKey(Test.TEST, DSL.name("PK_PRIMARY_KII"), arrayOf(Test.TEST.COMPANY_ID, Test.TEST.ALLOCATION_ID), true)
