package Database.RDBMS.src.database;

/**
 *
 * @author Louis Henry
 */
public class TableFactory {
    // parameter int pKey removed
    public static TableInterface createTable(String tableType, String tableName) {
        
        if (tableType.equalsIgnoreCase("parent table")) {
            return new ParentTable(tableName);
        } else if (tableType.equalsIgnoreCase("child table")) {
            return new ChildTable(tableName);
        } else {
            throw new IllegalArgumentException("Cannot create a '" + tableType + "'table.");
        }

    }
    
    
}
