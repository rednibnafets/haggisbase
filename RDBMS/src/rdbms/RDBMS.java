package rdbms;

import database.*;

/**
 *
 * @author Louis Henry
 */
public class RDBMS {


    public static void main(String[] args) {
        
        //Create databse and table
        Database d = new Database("Freight");
        d.createTable("Parent Table", "Goods", 100);
        
        
        //Insert a row  
        insert("Goods", "Apples");
    }

}
