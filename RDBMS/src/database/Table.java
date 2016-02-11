package Database.RDBMS.src.database;

import java.util.ArrayList;

/**
 *
 * @author Louis Henry
 */
public abstract class Table implements TableInterface{
    
    protected int primaryKey;
    protected String name;
    protected ArrayList< Row > rows ;
    
    public Table() 
    {
        rows = new ArrayList<>() ;
       // default ctor
    }
 
    @Override
    public abstract void select();    
    
    @Override
    public abstract void insert(Row newRow);
}
