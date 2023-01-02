package groot;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
public class ArrayListLiveExDBRetrieval {
	public static void main(String[] args) {
        Connection connection = null;
        Statement selectStmt = null;
        Statement insertStmt = null;
  List customerList = new ArrayList();
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/dsk","root","Devi@0538");
             
            selectStmt = connection.createStatement();
            ResultSet rs = selectStmt.executeQuery("SELECT FULL_NAME, EMAIL, PASSWORD, DOB, MOBILE_NUMBER FROM CUSTOMER ");
            while(rs.next())
            {
            	ArrayListLiveExbean customer = new ArrayListLiveExbean();
      
               customer.setFullName(rs.getString(1)); 
               customer.setEmail(rs.getString(2)); 
               customer.setPassword(rs.getString(3)); 
               customer.setDateOfBirth(new java.util.Date(rs.getDate(4).getTime())); 
      customer.setMobileNumber(rs.getString(5)); 
      
      customerList.add(customer);
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }finally {
            try {
                selectStmt.close();
                insertStmt.close();
                connection.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
  
  System.out.println("Customer records count : "+customerList.size());
    }

}
