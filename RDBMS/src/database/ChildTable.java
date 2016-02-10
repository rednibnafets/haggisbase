package database;

import java.util.ArrayList;

/**
 *
 * @author Louis Henry
 */
public class ChildTable extends Table implements TableInterface{
    
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
    public void select(String tableName, String statement){
    
    }
    
    @Override
    public void insert(String tableName,String data){
    
    }
    
    @Override
    public void update(){
    
    }
    
    @Override
    public void delete(){
    
    }
}
