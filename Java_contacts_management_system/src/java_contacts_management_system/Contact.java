
package java_contacts_management_system;

import com.mysql.jdbc.Blob;
import java.io.InputStream;

public class Contact {
    
    private Integer cid;
    private String fname;
    
    private String lname;

    private String email;
    private String phone;
    private String address;
    private byte[] pic;
    private String group1;
    
    private int uid;
    
    public Contact(){}

    public Contact(Integer cid, String fname, String lname, String email, String phone, String address, byte[] pic, String group1, int uid) {
        this.cid = cid;
        this.fname = fname;
        this.lname = lname;
        this.email = email;
        this.phone = phone;
        this.address = address;
        this.pic = pic;
        this.group1 = group1;
        this.uid = uid;
    }

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public byte[] getPic() {
        return pic;
    }

    public void setPic(byte[] pic) {
        this.pic = pic;
    }

    public String getGroup1() {
        return group1;
    }

    public void setGroup1(String group1) {
        this.group1 = group1;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }
    
}