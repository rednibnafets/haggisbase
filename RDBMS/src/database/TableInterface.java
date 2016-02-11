package Database.RDBMS.src.database;

/**
 *
 * @author Louis Henry
 */
public interface TableInterface {
       //Methods
    // no need for the tableName (the table object "knows" the table name)
    //public void select(String tableName, String statement);
    public void select() ;  // SELECT * FROM table  -- for the time being
    public void insert(Row newRow);
    public void update();
    public void delete();

}
