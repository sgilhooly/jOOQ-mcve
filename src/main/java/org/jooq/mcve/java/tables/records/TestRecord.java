/*
 * This file is generated by jOOQ.
 */
package org.jooq.mcve.java.tables.records;


import org.jooq.Field;
import org.jooq.Record2;
import org.jooq.Record3;
import org.jooq.Row3;
import org.jooq.impl.UpdatableRecordImpl;
import org.jooq.mcve.java.tables.Test;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TestRecord extends UpdatableRecordImpl<TestRecord> implements Record3<String, Integer, String> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>MCVE.TEST.COMPANY_ID</code>.
     */
    public void setCompanyId(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>MCVE.TEST.COMPANY_ID</code>.
     */
    public String getCompanyId() {
        return (String) get(0);
    }

    /**
     * Setter for <code>MCVE.TEST.ALLOCATION_ID</code>.
     */
    public void setAllocationId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>MCVE.TEST.ALLOCATION_ID</code>.
     */
    public Integer getAllocationId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>MCVE.TEST.NAME</code>.
     */
    public void setName(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>MCVE.TEST.NAME</code>.
     */
    public String getName() {
        return (String) get(2);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record2<String, Integer> key() {
        return (Record2) super.key();
    }

    // -------------------------------------------------------------------------
    // Record3 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row3<String, Integer, String> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    @Override
    public Row3<String, Integer, String> valuesRow() {
        return (Row3) super.valuesRow();
    }

    @Override
    public Field<String> field1() {
        return Test.TEST.COMPANY_ID;
    }

    @Override
    public Field<Integer> field2() {
        return Test.TEST.ALLOCATION_ID;
    }

    @Override
    public Field<String> field3() {
        return Test.TEST.NAME;
    }

    @Override
    public String component1() {
        return getCompanyId();
    }

    @Override
    public Integer component2() {
        return getAllocationId();
    }

    @Override
    public String component3() {
        return getName();
    }

    @Override
    public String value1() {
        return getCompanyId();
    }

    @Override
    public Integer value2() {
        return getAllocationId();
    }

    @Override
    public String value3() {
        return getName();
    }

    @Override
    public TestRecord value1(String value) {
        setCompanyId(value);
        return this;
    }

    @Override
    public TestRecord value2(Integer value) {
        setAllocationId(value);
        return this;
    }

    @Override
    public TestRecord value3(String value) {
        setName(value);
        return this;
    }

    @Override
    public TestRecord values(String value1, Integer value2, String value3) {
        value1(value1);
        value2(value2);
        value3(value3);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached TestRecord
     */
    public TestRecord() {
        super(Test.TEST);
    }

    /**
     * Create a detached, initialised TestRecord
     */
    public TestRecord(String companyId, Integer allocationId, String name) {
        super(Test.TEST);

        setCompanyId(companyId);
        setAllocationId(allocationId);
        setName(name);
    }
}
