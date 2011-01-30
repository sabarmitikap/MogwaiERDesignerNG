package de.erdesignerng.dialect;

/**
 * Descriptor for a table.
 *
 * @author $Author: mirkosertic $
 * @version $Date: 2009-03-09 19:07:30 $
 */
public class TableEntry extends SchemaEntry {

    private String tableName;

    private String tableType;

    public TableEntry(String aCatalogName, String aSchemaName, String aTableName, String aTableType) {
        super(aCatalogName, aSchemaName);
        tableName = aTableName;
        tableType = aTableType;
    }

    public String getTableName() {
        return tableName;
    }

    public String getTableType() {
        return tableType;
    }

    @Override
    public String toString() {
        String theResult = super.toString();
        if (theResult != null) {
            return theResult + " " + tableName;
        }

        return tableName;
    }
}
