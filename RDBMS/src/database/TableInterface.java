package database;

/**
 *
 * @author Louis Henry
 */
public interface TableInterface {
       //Methods
    public void select(String tableName, String statement);
    public void insert(String tableName, String data);
    public void update();
    public void delete();

}
