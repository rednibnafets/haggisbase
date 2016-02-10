package database;

/**
 *
 * @author Louis Henry
 */
public interface DatabaseInterface {
    //Methods
    void createTable(String type, String name);
    void dropTable(String name);
    
}
