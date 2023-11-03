 
package provemax;

import Vistas.Bienvenida;
import Vistas.Menu;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
//import java.sql.Connection;

public class Provemax {

    
    public static void main(String[] args) throws SQLException {
    

        Bienvenida bien = new Bienvenida();
        bien.setVisible(true);
        
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            //  e.printStackTrace();
        }

        bien.setVisible(false);
        
        Menu menu = new Menu();
        menu.setVisible(true);
    }


    }


   


    
    




    
    


