package database;

import java.util.ArrayList;

/**
 *
 * @author Louis Henry
 */
public abstract class Table implements TableInterface{
    
    protected int primaryKey;
    protected String name;
    protected ArrayList rows = new ArrayList();
    
}
