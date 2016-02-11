package Database.RDBMS.src.database;

import java.util.ArrayList;

/**
 *
 * @author Louis Henry
 */
public class ParentTable extends Table {

    //Default ctor
    public ParentTable(String newName) {
        super() ;
        this.name = newName ;
    }

    //Overloaded ctor takes primary key
    public ParentTable(String tableName, int pKey) {
        //this.primaryKey = pKey;
        this.name = tableName;
    }
    
    //Accessors
    public String getName(){
        return this.name;
    }
    
//    public int getPrimaryKey(){
//        return this.primaryKey;
//    }
    
    //Mutators
//    private int setPrimaryKey(int pKey){
//        return this.primaryKey = pKey;
//    }
    
    //Table Methods
    @Override
    public void select(){
    //public void select(String tableName, String statement) {
        //No need to pass the table name! The object "knows" the table name.        
        //If tablename matched
        //if(this.name.equals(tableName) && statement.equals("*")){            
            System.out.println("Table --" + this.name + "-- ");
        //    for(int i = 0; i < rows.size(); i++)

             //System.out.println("Row " + i + ": " + rows.get(i));
        //}
        for (Row r : rows) {
            System.out.println("Row key: " + r.getPrimaryKey()
                              + "  Row value: " + r.getRowValue() );   
        }
    }

    @Override
    public void insert(Row newRow) {
        //No need to pass the table name! The object "knows" the table name.
        //if(this.name.equals(tableName)){
        this.rows.add(newRow) ;
        System.out.println("Data inserted into table " + this.name);

    }

    @Override
    public void update() {

    }

    @Override
    public void delete() {

    }

}
