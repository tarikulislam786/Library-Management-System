/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tarik
 */
/* java.sql.* package used for Making a connection with a database via the DriverManager facility
 Sending SQL statements to a database
 Retrieving and updating the results of a query
 Standard mappings for SQL types to classes and interfaces in the Java programming language
 Custom mapping an SQL user-defined type (UDT) to a class in the Java programming language
 Metadata
 Exceptions */
/* javax.swing.JOptionPane package
JOptionPane class. Dialog Boxes. A dialog box is a small graphical window that displays a message to the user 
or requests input. A variety of dialog boxes can be displayed using the JOptionPane class.
*/
import java.sql.*; 
import javax.swing.JOptionPane;
public class JavaConnect {
    Connection conn;
    public static Connection ConnectDB(){
        try{
            Class.forName("org.sqlite.JDBC");
            Connection conn = DriverManager.getConnection("jdbc:sqlite:E:\\NetbeansProjects\\Library Management System\\LibraryNew.sqlite");
            return conn;
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }
    
}
