import java.sql.Connection; 
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet; 
import java.sql.SQLException; 
import java.sql.Statement;
import java.util.Scanner;

 

public class PreparedStmtExample {

 

    // JDBC URL, username and password of MySQL server
    private static final String url = "jdbc:mysql://localhost:3306/db_world";
    private static final String user = "root";
    private static final String password = "root";
    
    Connection con;
    PreparedStatement prSt;
    Statement stmt;
    
    public static void main(String[] args) {
        
        PreparedStmtExample pse = new PreparedStmtExample();
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("=============PREPARED STATEMENT MENU=================");
        System.out.println("1. Insert the new employee Record"); 
        System.out.println("2. Update the employee Record");
        System.out.println("3. Delete the employee Record");
        System.out.println("====================================================");
        System.out.println("Enter your choice from (1-3): ");
        
        int number = input.nextInt();
        System.out.println("You entered option" + number);
        
        switch(number)
        {
        case 1: pse.insertPSRecord();
                break;
        
        case 2: pse.updatePSRecord();
                break;
                
        case 3: pse.deletePSRecord();
                break;
        }    
            
    }
    
    //-------------------------- Inserting The Record-----------------------------//
    public void insertPSRecord()
    {  
        String query = "insert into emp(empid,empname,salary) values(?,?,?)";
        
          try {
                Class.forName("com.mysql.jdbc.Driver");
                con = DriverManager.getConnection(url, user, password);
               
                prSt = con.prepareStatement(query);
                
                // Take user input for insertion
                Scanner input = new Scanner(System.in);    
                
                System.out.print("Enter the empid:  ");
                int eid = input.nextInt();
                System.out.println();
                
                System.out.print("Enter the employee salary:  ");
                int esal = input.nextInt();
                System.out.println();
                
                System.out.print("Enter the employee name:  ");
                String ename = input.next();
                System.out.println();
                
                prSt.setInt(1, eid);
                prSt.setString(2, ename);
                prSt.setInt(3, esal);
                
                int count = prSt.executeUpdate();
                
                //show the number of records
                stmt = con.createStatement();
                
                String query1 = "select * from emp";
                ResultSet rs =  stmt.executeQuery(query1);
                System.out.println("Id    Name    Salary");
                
                while (rs.next()) {
                   int id = rs.getInt("empid");
                   String name = rs.getString("empname");
                   String sal = rs.getString("salary");
                   System.out.println(id + "    " + name+"    "+sal);
                }    
                
            } catch (ClassNotFoundException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            } catch (SQLException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            } finally{
                try{
                    if(prSt != null) prSt.close();
                    if(con != null) con.close();
                } catch(Exception ex){}
            }
    }
    
    //-------------------------- Updating The Record-----------------------------//
    public void updatePSRecord()
    { 
        String sqlUpdate = "UPDATE emp SET salary = ? WHERE empid = ?";
        
        try {
            try {
                Class.forName("com.mysql.jdbc.Driver");
                con = DriverManager.getConnection(url, user, password);
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
            prSt = con.prepareStatement(sqlUpdate);
            
            // Take user input for insertion
            Scanner input = new Scanner(System.in);    
            
            System.out.print("Enter the empid:  ");
            int eid = input.nextInt();
            System.out.println();
            
            System.out.print("Enter the employee salary:  ");
            int esal = input.nextInt();
            System.out.println();
            
            prSt.setInt(1, esal);
            prSt.setInt(2, eid);
 
            int rowAffected = prSt.executeUpdate();
            System.out.println(String.format("Row affected %d", rowAffected));
 
            // update another record -reuse the prepared statement
            System.out.print("Enter the another empid:  ");
            int eid1 = input.nextInt();
            System.out.println();
            
            System.out.print("Enter the another employee salary:  ");
            int esal1 = input.nextInt();
            System.out.println();
            
            prSt.setInt(1, esal1);
            prSt.setInt(2, eid1);
 
            rowAffected = prSt.executeUpdate();
            System.out.println(String.format("Row affected %d", rowAffected));
 
        }
        catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }        
    }
    
    //-------------------------- Deleting The Record-----------------------------//
        public void deletePSRecord()
        { 
            String sqlUpdate = "DELETE from emp where empid=?";
            
            try {
                try {
                    Class.forName("com.mysql.jdbc.Driver");
                    con = DriverManager.getConnection(url, user, password);
                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                }
                prSt = con.prepareStatement(sqlUpdate);
                
                // Take user input for insertion
                Scanner input = new Scanner(System.in);    
                
                System.out.print("Enter the empid:  ");
                int eid = input.nextInt();
                System.out.println();
                
                prSt.setInt(1, eid);
                prSt.executeUpdate();
                
                System.out.println("Record deleted successfully");
            }
            catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }                
        }
        
}