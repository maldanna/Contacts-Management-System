
package java_contacts_management_system;
import com.mysql.jdbc.Connection;
import java.sql.*;
import java.sql.Statement;
import java.sql.PreparedStatement;
import com.mysql.jdbc.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import javax.swing.JOptionPane;



public class ContactQuery {
               public  InputStream im;

    
    ContactQuery() throws FileNotFoundException 
    {   
          
        
        
    }

    

    
    public  boolean insert(Contact cnt){
        try{
        
       Connection con=myConnection.getconnection();
        ResultSet res;
        
        PreparedStatement ps;

            ps=(PreparedStatement) con.prepareStatement("INSERT INTO `mycontacts`"
                    + "( `fname`, `lname`, `group1`, `phone`, `email`, `address`,`pic`, `userid`) "
                    + "VALUES (?,?,?,?,?,?,?,?)");
            
            
            ps.setString(1,cnt.getFname());
            ps.setString(2,cnt.getLname());
            ps.setString(3,cnt.getGroup1());
            ps.setString(4,cnt.getPhone());
            ps.setString(5,cnt.getEmail());
            ps.setString(6,cnt.getAddress());
           
            ps.setBytes(7,cnt.getPic());
            ps.setInt(8,cnt.getUid());

                        
          if(ps.executeUpdate()!=0)
           {
              JOptionPane.showMessageDialog(null," record inserted");
              return true;
           }
          else
          {
            JOptionPane.showMessageDialog(null," erro occured u");
            return false;

              
          }
          
         
        }
        catch(Exception e)
        {
            
            
            System.out.println(e);
        }
        return false;
        
        
       
    }
    
    
    
    
 public ArrayList<Contact> contactList() 

{

 ArrayList<Contact> clist =new ArrayList<Contact>();

Connection con=myConnection.getconnection();

Statement st;

ResultSet rs;
try{
st=con.createStatement();

rs=st.executeQuery("SELECT `id`, `fname`, `lname`, `group1`, `phone`,"
        + " `email`, `address`, `pic` FROM `mycontacts` ");


Contact ct;
while(rs.next())
{    

ct=new Contact(rs.getInt("id"),
    rs.getString("fname"),
    rs.getString("lname"),
    rs.getString("email")

    ,rs.getString("phone")
    ,rs.getString("address")


    ,rs.getBytes("pic"),
    rs.getString("group1")

    ,0);
    
clist.add(ct);

}
}


catch (Exception e)

{
    System.out.println(e);
}



return clist;


}









}



 
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
   
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

