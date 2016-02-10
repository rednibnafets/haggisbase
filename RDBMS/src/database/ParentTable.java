package database;

import java.util.ArrayList;

/**
 *
 * @author Louis Henry
 */
public class ParentTable extends Table implements TableInterface {

    //Default ctor
    public ParentTable(String tableName) {
        this.primaryKey = 0;
        this.name = null;
        ArrayList rows = new ArrayList();
    }

    //Overloaded ctor takes primary key
    public ParentTable(String tableName, int pKey) {
        this.primaryKey = pKey;
        this.name = tableName;
        ArrayList rows = new ArrayList();
    }
    
    //Accessors
    public String getName(){
        return this.name;
    }
    
    public int getPrimaryKey(){
        return this.primaryKey;
    }
    
    //Mutators
    private int setPrimaryKey(int pKey){
        return this.primaryKey = pKey;
    }
    
    //Table Methods
    @Override
    public void select(String tableName, String statement) {
        //If tablename matched
        if(this.name.equals(tableName) && statement.equals("*")){            
            System.out.println("Table --" + this.name + "-- ");
            for(int i = 0; i < rows.size(); i++)
            System.out.println("Row " + i + ": " + rows.get(i));
        }
    }

    @Override
    public void insert(String tableName, String data) {
        if(this.name.equals(tableName)){
            this.rows.add(data);
            System.out.println("Data inserted into table " + this.name);
        }
    }

    @Override
    public void update() {

    }

    @Override
    public void delete() {

    }

}
