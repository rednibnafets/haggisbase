package Database.RDBMS.src.database;

import java.util.ArrayList;

/**
 * A Database.RDBMS.src.database that stores tables containing records.
 *
 * @version 0.1
 * @author Louis Henry
 *
 */
public class Database {

    public String name;
    ArrayList< TableInterface > tables = new ArrayList<>();
    
//    public TableInterface getTable(String tableName)
//    {
//       TableInterface ifce = null ;
//       for (TableInterface ti : tables )
//       {
//           if(ti.equals(tableName))
//           {
//               return ifce = ti;
//           }
//       }
//       return ifce ;
//    }

    public Database(String newName) {
        this.name = newName;
        System.out.println("Database " + name + " created.");
    }

    //Create table in Database
    public void createTable(String type, String name) {
        
        if (checkExists(name) == false){
            tables.add(TableFactory.createTable(type, name));
            System.out.println(type + " " + name + " created.");
        } else {
            System.out.println("Please re-enter with a valid table name.");
        }  
    }

    //Drop table in Database
    public void dropTable(String tableName) {
        tables.remove(tableName);
        System.out.println("Table " + tableName + " removed.");
    }

    private boolean checkExists(String tableName) {

        for (int i = 0; i < tables.size(); i++) {
            if (tables.contains((tableName))) {
                System.out.println("Database " + this.name + " contains table " + tableName + ".");
                return true;
            }
        }
        return false;
    }

}
