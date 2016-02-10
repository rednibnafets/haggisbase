package database;

/**
 *
 * @author Louis Henry
 */
public class TableFactory {

    public static TableInterface createTable(String tableType, String tableName, int pKey) {
        
        if (tableType.equalsIgnoreCase("parent table")) {
            return new ParentTable(tableName);
        } else if (tableType.equalsIgnoreCase("child table")) {
            return new ChildTable(tableName);
        } else {
            throw new IllegalArgumentException("Cannot create a '" + tableType + "'table.");
        }

    }
    
    
}
