package Database.RDBMS.src.database;

import java.util.ArrayList;

/**
 *
 * @author Louis Henry
 */
// avoid
// public class ChildTable extends Table implements TableInterface{
//
// use
public class ChildTable extends Table {
    public int foreignKey;
       
    //Default ctor
     public ChildTable(String tableName){
        this.primaryKey = 0;
        this.foreignKey = 0;
        this.name = null;  
        ArrayList rows = new ArrayList();
    }
     
    //Overloaded ctor takes foreign key
    public ChildTable(String tableName, int fKey){
        this.primaryKey = 0;
        this.foreignKey = 0;
        this.name = null; 
        ArrayList rows = new ArrayList();
    }
    
    public String getName(){
        return this.name;
    }
    
    private String setName(String name){
        return this.name = name;
    }
    
    @Override
    public void select(){
    //public void select(String tableName, String statement) {
        //No need to pass the table name! The object "knows" the table name. 
    
    }
    
    @Override
    public void insert(Row newRow){
    
    }
    
    @Override
    public void update(){
    
    }
    
    @Override
    public void delete(){
    
    }
}
