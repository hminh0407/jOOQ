/**
 * This class is generated by jOOQ
 */
package org.jooq.util.hsqldb.information_schema.tables.records;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = {"http://www.jooq.org", "2.0.2"},
                            comments = "This class is generated by jOOQ")
public class ConstraintColumnUsageRecord extends org.jooq.impl.TableRecordImpl<org.jooq.util.hsqldb.information_schema.tables.records.ConstraintColumnUsageRecord> {

	private static final long serialVersionUID = 1140323331;

	/**
	 * An uncommented item
	 */
	public void setTableCatalog(java.lang.String value) {
		setValue(org.jooq.util.hsqldb.information_schema.tables.ConstraintColumnUsage.CONSTRAINT_COLUMN_USAGE.TABLE_CATALOG, value);
	}

	/**
	 * An uncommented item
	 */
	public java.lang.String getTableCatalog() {
		return getValue(org.jooq.util.hsqldb.information_schema.tables.ConstraintColumnUsage.CONSTRAINT_COLUMN_USAGE.TABLE_CATALOG);
	}

	/**
	 * An uncommented item
	 */
	public void setTableSchema(java.lang.String value) {
		setValue(org.jooq.util.hsqldb.information_schema.tables.ConstraintColumnUsage.CONSTRAINT_COLUMN_USAGE.TABLE_SCHEMA, value);
	}

	/**
	 * An uncommented item
	 */
	public java.lang.String getTableSchema() {
		return getValue(org.jooq.util.hsqldb.information_schema.tables.ConstraintColumnUsage.CONSTRAINT_COLUMN_USAGE.TABLE_SCHEMA);
	}

	/**
	 * An uncommented item
	 */
	public void setTableName(java.lang.String value) {
		setValue(org.jooq.util.hsqldb.information_schema.tables.ConstraintColumnUsage.CONSTRAINT_COLUMN_USAGE.TABLE_NAME, value);
	}

	/**
	 * An uncommented item
	 */
	public java.lang.String getTableName() {
		return getValue(org.jooq.util.hsqldb.information_schema.tables.ConstraintColumnUsage.CONSTRAINT_COLUMN_USAGE.TABLE_NAME);
	}

	/**
	 * An uncommented item
	 */
	public void setColumnName(java.lang.String value) {
		setValue(org.jooq.util.hsqldb.information_schema.tables.ConstraintColumnUsage.CONSTRAINT_COLUMN_USAGE.COLUMN_NAME, value);
	}

	/**
	 * An uncommented item
	 */
	public java.lang.String getColumnName() {
		return getValue(org.jooq.util.hsqldb.information_schema.tables.ConstraintColumnUsage.CONSTRAINT_COLUMN_USAGE.COLUMN_NAME);
	}

	/**
	 * An uncommented item
	 */
	public void setConstraintCatalog(java.lang.String value) {
		setValue(org.jooq.util.hsqldb.information_schema.tables.ConstraintColumnUsage.CONSTRAINT_COLUMN_USAGE.CONSTRAINT_CATALOG, value);
	}

	/**
	 * An uncommented item
	 */
	public java.lang.String getConstraintCatalog() {
		return getValue(org.jooq.util.hsqldb.information_schema.tables.ConstraintColumnUsage.CONSTRAINT_COLUMN_USAGE.CONSTRAINT_CATALOG);
	}

	/**
	 * An uncommented item
	 */
	public void setConstraintSchema(java.lang.String value) {
		setValue(org.jooq.util.hsqldb.information_schema.tables.ConstraintColumnUsage.CONSTRAINT_COLUMN_USAGE.CONSTRAINT_SCHEMA, value);
	}

	/**
	 * An uncommented item
	 */
	public java.lang.String getConstraintSchema() {
		return getValue(org.jooq.util.hsqldb.information_schema.tables.ConstraintColumnUsage.CONSTRAINT_COLUMN_USAGE.CONSTRAINT_SCHEMA);
	}

	/**
	 * An uncommented item
	 */
	public void setConstraintName(java.lang.String value) {
		setValue(org.jooq.util.hsqldb.information_schema.tables.ConstraintColumnUsage.CONSTRAINT_COLUMN_USAGE.CONSTRAINT_NAME, value);
	}

	/**
	 * An uncommented item
	 */
	public java.lang.String getConstraintName() {
		return getValue(org.jooq.util.hsqldb.information_schema.tables.ConstraintColumnUsage.CONSTRAINT_COLUMN_USAGE.CONSTRAINT_NAME);
	}

	/**
	 * Create a detached ConstraintColumnUsageRecord
	 */
	public ConstraintColumnUsageRecord() {
		super(org.jooq.util.hsqldb.information_schema.tables.ConstraintColumnUsage.CONSTRAINT_COLUMN_USAGE);
	}
}
