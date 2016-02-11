package Database.RDBMS.src.rdbms;

import Database.RDBMS.src.database.*;

/**
 *
 * @author Louis Henry
 */
public class RDBMS {


    public static void main(String[] args) {
        
        //Create databse and table
        Database d = new Database("Freight");
        //d.createTable("Parent Table", "Goods", 100);
        

        //d.getTable("Goods").insert("Goods", "first_row");
        
        TableInterface ti = TableFactory.createTable("Parent Table", "Goods");
        
        Row r = new Row("row_value") ;  
        
        ti.insert(r);
        ti.select();
                
        //d.getTable("Goods").insert(r);
                
        //Insert a row  
        //insert("Goods", "Apples");
    }

}
