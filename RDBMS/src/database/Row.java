/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Database.RDBMS.src.database;

/**
 *
 * @author s.binder
 */
public class Row {

    private int primaryKey;
    private String rowValue;

    public Row() {
        primaryKey = 0;
        rowValue = null;
    }
    
    public Row(String newRowValue) {
        this.primaryKey = increasePrimaryKeyValue() ;
        this.rowValue = newRowValue;
    }    

    public int getPrimaryKey() {
        return primaryKey ;
    }

    public String getRowValue() {
        return rowValue ;
    }

    public int setPrimaryKey(int newPrimaryKey) {
        this.primaryKey = newPrimaryKey;
        return this.primaryKey;
    }

    public String setRowValue(String newRowValue)
    {
        this.rowValue = newRowValue;
        return this.rowValue ;
    }
    
    // only called when the overloaded ctor is used
    private int increasePrimaryKeyValue()
    {
        return this.primaryKey++ ;
    }
}
