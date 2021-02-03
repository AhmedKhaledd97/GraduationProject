package DBClass;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DB {

    private static Connection conn() {
        Connection con = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/graduatedb", "root", "root");
        } catch (ClassNotFoundException ex) {
            System.out.println("conn error");

        } catch (SQLException ex) {
            Logger.getLogger(DB.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("url error");
        }
        return con;
    }

    public ResultSet selecoDoctorCatagory() {
        ResultSet set = null;
        try {
            String sql = "select * from doctors_catagory";
            PreparedStatement ps = conn().prepareStatement(sql);

            set = ps.executeQuery();
        } catch (SQLException ex) {
            Logger.getLogger(DB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return set;

    }

    public boolean insertIntoDoctors(String fname, String lname, String spe, String location, String fees, String address, String phon, String email, String pass, String nimg, int rate) {

        boolean flag = false;
        try {
            String sql = "insert into doctors (fname , lname, specialist,location,price,Adress,phone,mail,pass,nimage,rate) values (?,?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement ps = conn().prepareStatement(sql);
            ps.setString(1, fname);
            ps.setString(2, lname);
            ps.setString(3, spe);
            ps.setString(4, location);
            ps.setString(5, fees);
            ps.setString(6, address);
            ps.setString(7, phon);
            ps.setString(8, email);
            ps.setString(9, pass);
            ps.setString(10, nimg);
            ps.setInt(11, rate);

            int x = ps.executeUpdate();

            if (x == 0) {
                flag = false;
            } else {
                flag = true;
            }

        } catch (SQLException ex) {
            Logger.getLogger(DB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return flag;

    }

    public boolean insertIntoEngineers(String fname, String lname, String spe, String location, String fees, String address, String phon, String email, String pass, String nimg, int rate) {

        boolean flag = false;
        try {
            String sql = "insert into engineers (fname , lname, specialist,location,price,Adress,phone,mail,pass,nimage,rate) values (?,?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement ps = conn().prepareStatement(sql);
            ps.setString(1, fname);
            ps.setString(2, lname);
            ps.setString(3, spe);
            ps.setString(4, location);
            ps.setString(5, fees);
            ps.setString(6, address);
            ps.setString(7, phon);
            ps.setString(8, email);
            ps.setString(9, pass);
            ps.setString(10, nimg);
            ps.setInt(11, rate);
            int x = ps.executeUpdate();

            if (x == 0) {
                flag = false;
            } else {
                flag = true;
            }

        } catch (SQLException ex) {
            Logger.getLogger(DB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return flag;

    }

    public boolean insertIntoAll(String fname, String lname, String spe, String location, String fees, String address, String phon, String email, String pass, String nimg, int rate) {

        boolean flag = false;
        try {
            String sql = "insert into alljops (fname , lname, specialist,location,price,Adress,phone,mail,pass,nimage,rate) values (?,?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement ps = conn().prepareStatement(sql);
            ps.setString(1, fname);
            ps.setString(2, lname);
            ps.setString(3, spe);
            ps.setString(4, location);
            ps.setString(5, fees);
            ps.setString(6, address);
            ps.setString(7, phon);
            ps.setString(8, email);
            ps.setString(9, pass);
            ps.setString(10, nimg);
            ps.setInt(11, rate);

            int x = ps.executeUpdate();

            if (x == 0) {
                flag = false;
            } else {
                flag = true;
            }

        } catch (SQLException ex) {
            Logger.getLogger(DB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return flag;

    }

    public ResultSet selecoEngCatagory() {
        ResultSet set = null;
        try {
            String sql = "select * from engineers_catagory";
            PreparedStatement ps = conn().prepareStatement(sql);

            set = ps.executeQuery();
        } catch (SQLException ex) {
            Logger.getLogger(DB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return set;

    }

    public boolean insertIntoLaw(String fname, String lname, String spe, String location, String fees, String address, String phon, String email, String pass, String nimg, int rate) {

        boolean flag = false;
        try {
            String sql = "insert into laws (fname , lname, specialist,location,price,Adress,phone,mail,pass,nimage,rate) values (?,?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement ps = conn().prepareStatement(sql);
            ps.setString(1, fname);
            ps.setString(2, lname);
            ps.setString(3, spe);
            ps.setString(4, location);
            ps.setString(5, fees);
            ps.setString(6, address);
            ps.setString(7, phon);
            ps.setString(8, email);
            ps.setString(9, pass);
            ps.setString(10, nimg);
            ps.setInt(11, rate);
            int x = ps.executeUpdate();

            if (x == 0) {
                flag = false;
            } else {
                flag = true;
            }

        } catch (SQLException ex) {
            Logger.getLogger(DB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return flag;

    }

    public ResultSet selecoLawCatagory() {
        ResultSet set = null;
        try {
            String sql = "select * from lawyers_catagory";
            PreparedStatement ps = conn().prepareStatement(sql);

            set = ps.executeQuery();
        } catch (SQLException ex) {
            Logger.getLogger(DB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return set;

    }

    public boolean insertIntoTeacher(String fname, String lname, String spe, String location, String fees, String address, String phon, String email, String pass, String nimg, int rate) {

        boolean flag = false;
        try {
            String sql = "insert into teatchers (fname , lname, specialist,location,price,Adress,phone,mail,pass,nimage,rate) values (?,?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement ps = conn().prepareStatement(sql);
            ps.setString(1, fname);
            ps.setString(2, lname);
            ps.setString(3, spe);
            ps.setString(4, location);
            ps.setString(5, fees);
            ps.setString(6, address);
            ps.setString(7, phon);
            ps.setString(8, email);
            ps.setString(9, pass);
            ps.setString(10, nimg);
            ps.setInt(11, rate);
            int x = ps.executeUpdate();

            if (x == 0) {
                flag = false;
            } else {
                flag = true;
            }

        } catch (SQLException ex) {
            Logger.getLogger(DB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return flag;

    }

    public ResultSet selecoTechCatagory() {
        ResultSet set = null;
        try {
            String sql = "select * from teatchers_catagory";
            PreparedStatement ps = conn().prepareStatement(sql);

            set = ps.executeQuery();
        } catch (SQLException ex) {
            Logger.getLogger(DB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return set;

    }

    public boolean doctorSearch(String username, String pass) {

        boolean flag = false;
        try {
            PreparedStatement ps = conn().prepareStatement("select * from doctors where mail=? and pass=?");
            ps.setString(1, username);
            ps.setString(2, pass);

            ResultSet set = ps.executeQuery();
            if (set.next()) {
                flag = true;
            }

        } catch (SQLException ex) {
            Logger.getLogger(DB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return flag;
    }

    public boolean engSearch(String username, String pass) {

        boolean flag = false;
        try {
            PreparedStatement ps = conn().prepareStatement("select * from engineers where mail=? and pass=?");
            ps.setString(1, username);
            ps.setString(2, pass);

            ResultSet set = ps.executeQuery();
            if (set.next()) {
                flag = true;
            }

        } catch (SQLException ex) {
            Logger.getLogger(DB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return flag;
    }

    public boolean lawSerach(String username, String pass) {

        boolean flag = false;
        try {
            PreparedStatement ps = conn().prepareStatement("select * from laws where mail=? and pass=?");
            ps.setString(1, username);
            ps.setString(2, pass);

            ResultSet set = ps.executeQuery();
            if (set.next()) {
                flag = true;
            }

        } catch (SQLException ex) {
            Logger.getLogger(DB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return flag;
    }

    public boolean teacherSerach(String username, String pass) {

        boolean flag = false;
        try {
            PreparedStatement ps = conn().prepareStatement("select * from teatchers where mail=? and pass=?");
            ps.setString(1, username);
            ps.setString(2, pass);

            ResultSet set = ps.executeQuery();
            if (set.next()) {
                flag = true;
            }

        } catch (SQLException ex) {
            Logger.getLogger(DB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return flag;
    }

    public boolean AllSearch(String username, String pass) {

        boolean flag = false;
        try {
            PreparedStatement ps = conn().prepareStatement("select * from alljops where mail=? and pass=?");
            ps.setString(1, username);
            ps.setString(2, pass);

            ResultSet set = ps.executeQuery();
            if (set.next()) {
                flag = true;
            }

        } catch (SQLException ex) {
            Logger.getLogger(DB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return flag;
    }

    public ResultSet selectallSpeDoc() {
        ResultSet set = null;
        try {
            String sql = "select distinct specialist from doctors";
            PreparedStatement ps = conn().prepareStatement(sql);

            set = ps.executeQuery();
        } catch (SQLException ex) {
            Logger.getLogger(DB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return set;

    }

    public ResultSet selectallLocationsDoc() {
        ResultSet set = null;
        try {
            String sql = "select distinct location from doctors";
            PreparedStatement ps = conn().prepareStatement(sql);

            set = ps.executeQuery();
        } catch (SQLException ex) {
            Logger.getLogger(DB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return set;

    }

    public ResultSet selectallSpeEng() {
        ResultSet set = null;
        try {
            String sql = "select distinct specialist from engineers";
            PreparedStatement ps = conn().prepareStatement(sql);

            set = ps.executeQuery();
        } catch (SQLException ex) {
            Logger.getLogger(DB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return set;

    }

    public ResultSet selectallLocationsEng() {
        ResultSet set = null;
        try {
            String sql = "select distinct location from engineers";
            PreparedStatement ps = conn().prepareStatement(sql);

            set = ps.executeQuery();
        } catch (SQLException ex) {
            Logger.getLogger(DB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return set;

    }

    public ResultSet selectallSpeLaw() {
        ResultSet set = null;
        try {
            String sql = "select distinct specialist from laws";
            PreparedStatement ps = conn().prepareStatement(sql);

            set = ps.executeQuery();
        } catch (SQLException ex) {
            Logger.getLogger(DB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return set;

    }

    public ResultSet selectallLocationsLaw() {
        ResultSet set = null;
        try {
            String sql = "select distinct location from laws";
            PreparedStatement ps = conn().prepareStatement(sql);

            set = ps.executeQuery();
        } catch (SQLException ex) {
            Logger.getLogger(DB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return set;

    }

    public ResultSet selectallSpeTeach() {
        ResultSet set = null;
        try {
            String sql = "select distinct specialist from teatchers";
            PreparedStatement ps = conn().prepareStatement(sql);

            set = ps.executeQuery();
        } catch (SQLException ex) {
            Logger.getLogger(DB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return set;

    }

    public ResultSet selectallLocationsTeach() {
        ResultSet set = null;
        try {
            String sql = "select distinct location from teatchers";
            PreparedStatement ps = conn().prepareStatement(sql);

            set = ps.executeQuery();
        } catch (SQLException ex) {
            Logger.getLogger(DB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return set;

    }

    public ResultSet selectbyWhereDoc(String sp, String location) {
        ResultSet set = null;
        try {
            String sql = "select * from doctors where specialist =? and location = ? order by rate desc";
            PreparedStatement ps = conn().prepareStatement(sql);
            ps.setString(1, sp);
            ps.setString(2, location);
            set = ps.executeQuery();
        } catch (SQLException ex) {
            Logger.getLogger(DB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return set;

    }

    public ResultSet selectbyWhereEng(String sp, String location) {
        ResultSet set = null;
        try {
            String sql = "select * from engineers where specialist =? and location = ? order by rate desc";
            PreparedStatement ps = conn().prepareStatement(sql);
            ps.setString(1, sp);
            ps.setString(2, location);
            set = ps.executeQuery();
        } catch (SQLException ex) {
            Logger.getLogger(DB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return set;

    }

    public ResultSet selectbyWhereLaw(String sp, String location) {
        ResultSet set = null;
        try {
            String sql = "select * from laws where specialist =? and location = ? order by rate desc";
            PreparedStatement ps = conn().prepareStatement(sql);
            ps.setString(1, sp);
            ps.setString(2, location);
            set = ps.executeQuery();
        } catch (SQLException ex) {
            Logger.getLogger(DB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return set;

    }

    public ResultSet selectbyWhereTeach(String sp, String location) {
        ResultSet set = null;
        try {
            String sql = "select * from teatchers where specialist =? and location = ? order by rate desc";
            PreparedStatement ps = conn().prepareStatement(sql);
            ps.setString(1, sp);
            ps.setString(2, location);
            set = ps.executeQuery();
        } catch (SQLException ex) {
            Logger.getLogger(DB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return set;

    }

    public int Allupdate(String fname, String lname, String price, String Address, String phone, String pass, String Email) {
        int x = 0;
        String insert = "update alljops set fname =? , lname =?  , price =? , Adress =? , phone = ? ,  pass =?  where mail =?";

        try {
            PreparedStatement ps = conn().prepareStatement(insert);
            ps.setString(1, fname);
            ps.setString(2, lname);

            ps.setString(3, price);
            ps.setString(4, Address);
            ps.setString(5, phone);
            ps.setString(6, pass);

            ps.setString(7, Email);
             x = ps.executeUpdate();
            

        } catch (SQLException ex) {
            Logger.getLogger(DB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return x;
    }

    public int doctorsUpdate(String fname, String lname, String price, String Address, String phone, String pass, String Email) {
        int x = 0;
        String insert = "update doctors set fname =? , lname =?  , price =? , Adress =? , phone =? ,  pass =?  where mail =?";

        try {
            PreparedStatement ps = conn().prepareStatement(insert);
            ps.setString(1, fname);
            ps.setString(2, lname);

            ps.setString(3, price);
            ps.setString(4, Address);
            ps.setString(5, phone);
            ps.setString(6, pass);

            ps.setString(7, Email);
             x = ps.executeUpdate();
            

        } catch (SQLException ex) {
            Logger.getLogger(DB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return x;
    }

    public int engUpdate(String fname, String lname, String price, String Address, String phone, String pass, String Email) {
        int x = 0;
        String insert = "update engineers set fname =? , lname =? , price =? , Adress =? , phone =? ,  pass =?  where mail =?";

        try {
            PreparedStatement ps = conn().prepareStatement(insert);
            ps.setString(1, fname);
            ps.setString(2, lname);

            ps.setString(3, price);
            ps.setString(4, Address);
            ps.setString(5, phone);
            ps.setString(6, pass);

            ps.setString(7, Email);
             x = ps.executeUpdate();
            

        } catch (SQLException ex) {
            Logger.getLogger(DB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return x;
    }

    public  int lawUpdate(String fname, String lname, String price, String Address, String phone, String pass, String Email) {
        int x = 0;
        String insert = "update laws set fname =? , lname =? , price =? , Adress =? , phone =? ,  pass =?  where mail =?";

        try {
            PreparedStatement ps = conn().prepareStatement(insert);
            ps.setString(1, fname);
            ps.setString(2, lname);

            ps.setString(3, price);
            ps.setString(4, Address);
            ps.setString(5, phone);
            ps.setString(6, pass);

            ps.setString(7, Email);
             x = ps.executeUpdate();
           

        } catch (SQLException ex) {
            Logger.getLogger(DB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return x;
    }

    public int teachUpdate(String fname, String lname, String price, String Address, String phone, String pass, String Email) {
        int x = 0;
        String insert = "update teatchers set fname =? , lname =? , price =? , Adress =? , phone =? ,  pass =?  where mail =?";

        try {
            PreparedStatement ps = conn().prepareStatement(insert);
            ps.setString(1, fname);
            ps.setString(2, lname);

            ps.setString(3, price);
            ps.setString(4, Address);
            ps.setString(5, phone);
            ps.setString(6, pass);

            ps.setString(7, Email);
             x = ps.executeUpdate();
            

        } catch (SQLException ex) {
            Logger.getLogger(DB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return x;
    }

    public ResultSet selectbyMailEng(String email) {
        ResultSet set = null;
        try {
            String sql = "select * from engineers where mail = ?";
            PreparedStatement ps = conn().prepareStatement(sql);
            ps.setString(1, email);

            set = ps.executeQuery();
        } catch (SQLException ex) {
            Logger.getLogger(DB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return set;

    }

    public ResultSet selectbyMailDoctors(String email) {
        ResultSet set = null;
        try {
            String sql = "select * from doctors where mail = ?";
            PreparedStatement ps = conn().prepareStatement(sql);
            ps.setString(1, email);

            set = ps.executeQuery();
        } catch (SQLException ex) {
            Logger.getLogger(DB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return set;

    }

    public ResultSet selectbyMailLaw(String email) {
        ResultSet set = null;
        try {
            String sql = "select * from laws where mail = ?";
            PreparedStatement ps = conn().prepareStatement(sql);
            ps.setString(1, email);

            set = ps.executeQuery();
        } catch (SQLException ex) {
            Logger.getLogger(DB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return set;

    }

    public ResultSet selectbyMailTeach(String email) {
        ResultSet set = null;
        try {
            String sql = "select * from teatchers where mail = ?";
            PreparedStatement ps = conn().prepareStatement(sql);
            ps.setString(1, email);

            set = ps.executeQuery();
        } catch (SQLException ex) {
            Logger.getLogger(DB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return set;

    }

    public ResultSet selectbyMailAll(String email) {
        ResultSet set = null;
        try {
            String sql = "select * from alljops where mail = ?";
            PreparedStatement ps = conn().prepareStatement(sql);
            ps.setString(1, email);

            set = ps.executeQuery();
        } catch (SQLException ex) {
            Logger.getLogger(DB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return set;

    }

    public boolean boolSelectByMailDoc(String mail) {

        boolean flag = false;
        try {
            PreparedStatement ps = conn().prepareStatement("select * from doctors where mail = ?");
            ps.setString(1, mail);

            ResultSet set = ps.executeQuery();
            if (set.next()) {
                flag = true;
            }

        } catch (SQLException ex) {
            Logger.getLogger(DB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return flag;
    }

    public boolean boolSelectByMailEng(String mail) {

        boolean flag = false;
        try {
            PreparedStatement ps = conn().prepareStatement("select * from engineers where mail = ?");
            ps.setString(1, mail);

            ResultSet set = ps.executeQuery();
            if (set.next()) {
                flag = true;
            }

        } catch (SQLException ex) {
            Logger.getLogger(DB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return flag;
    }

    public boolean boolSelectByMailLaw(String mail) {

        boolean flag = false;
        try {
            PreparedStatement ps = conn().prepareStatement("select * from laws where mail = ?");
            ps.setString(1, mail);

            ResultSet set = ps.executeQuery();
            if (set.next()) {
                flag = true;
            }

        } catch (SQLException ex) {
            Logger.getLogger(DB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return flag;
    }

    public boolean boolSelectByMailTeach(String mail) {

        boolean flag = false;
        try {
            PreparedStatement ps = conn().prepareStatement("select * from teatchers where mail = ?");
            ps.setString(1, mail);

            ResultSet set = ps.executeQuery();
            if (set.next()) {
                flag = true;
            }

        } catch (SQLException ex) {
            Logger.getLogger(DB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return flag;
    }

    public boolean boolSelectByMailAll(String mail) {

        boolean flag = false;
        try {
            PreparedStatement ps = conn().prepareStatement("select * from alljops where mail = ?");
            ps.setString(1, mail);

            ResultSet set = ps.executeQuery();
            if (set.next()) {
                flag = true;
            }

        } catch (SQLException ex) {
            Logger.getLogger(DB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return flag;
    }

    public boolean boolDoctorsSearch(String spe, String loc) {

        boolean flag = false;
        try {
            PreparedStatement ps = conn().prepareStatement("select * from doctors where specialist=? and location=?");
            ps.setString(1, spe);
            ps.setString(2, loc);

            ResultSet set = ps.executeQuery();
            if (set.next()) {
                flag = true;
            }

        } catch (SQLException ex) {
            Logger.getLogger(DB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return flag;
    }

    public boolean boolEngSearch(String spe, String loc) {

        boolean flag = false;
        try {
            PreparedStatement ps = conn().prepareStatement("select * from engineers where specialist=? and location=?");
            ps.setString(1, spe);
            ps.setString(2, loc);

            ResultSet set = ps.executeQuery();
            if (set.next()) {
                flag = true;
            }

        } catch (SQLException ex) {
            Logger.getLogger(DB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return flag;
    }

    public boolean boolLawSearch(String spe, String loc) {

        boolean flag = false;
        try {
            PreparedStatement ps = conn().prepareStatement("select * from laws where specialist=? and location=?");
            ps.setString(1, spe);
            ps.setString(2, loc);

            ResultSet set = ps.executeQuery();
            if (set.next()) {
                flag = true;
            }

        } catch (SQLException ex) {
            Logger.getLogger(DB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return flag;
    }

    public boolean boolTeachSearch(String spe, String loc) {

        boolean flag = false;
        try {
            PreparedStatement ps = conn().prepareStatement("select * from teatchers where specialist=? and location=?");
            ps.setString(1, spe);
            ps.setString(2, loc);

            ResultSet set = ps.executeQuery();
            if (set.next()) {
                flag = true;
            }

        } catch (SQLException ex) {
            Logger.getLogger(DB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return flag;
    }

    public int deletDoctors(String mail, String pass) {
        int x = 0;
        try {
            String sql = "delete  from doctors where mail =? and pass = ?";
            PreparedStatement ps = conn().prepareStatement(sql);
            ps.setString(1, mail);
            ps.setString(2, pass);
            x = ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return x;

    }

    public int deletEng(String mail, String pass) {
        int x = 0;
        try {
            String sql = "delete  from engineers where mail =? and pass = ?";
            PreparedStatement ps = conn().prepareStatement(sql);
            ps.setString(1, mail);
            ps.setString(2, pass);
            x = ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return x;

    }

    public int deletLawyer(String mail, String pass) {
        int x = 0;
        try {
            String sql = "delete  from laws where mail =? and pass = ?";
            PreparedStatement ps = conn().prepareStatement(sql);
            ps.setString(1, mail);
            ps.setString(2, pass);
            x = ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return x;

    }

    public int deletTeach(String mail, String pass) {
        int x = 0;
        try {
            String sql = "delete  from teatchers where mail =? and pass = ?";
            PreparedStatement ps = conn().prepareStatement(sql);
            ps.setString(1, mail);
            ps.setString(2, pass);
            x = ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return x;

    }

    public int deletAll(String mail, String pass) {
        int x = 0;
        try {
            String sql = "delete  from alljops where mail =? and pass = ?";
            PreparedStatement ps = conn().prepareStatement(sql);
            ps.setString(1, mail);
            ps.setString(2, pass);
            x = ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return x;

    }

    public int editeDocRate(int rate, String name) {
        int x = 0;
        try {
            String sql = "update doctors set rate=?  where mail =?";
            PreparedStatement ps = conn().prepareStatement(sql);

            ps.setInt(1, rate);
            ps.setString(2, name);

            x = ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return x;

    }

    public ResultSet selectDocrate(String mail) {
        ResultSet set = null;
        try {
            String sql = "select rate from doctors where mail = ?";
            PreparedStatement ps = conn().prepareStatement(sql);
            ps.setString(1, mail);
            set = ps.executeQuery();
        } catch (SQLException ex) {
            Logger.getLogger(DB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return set;

    }

    public int editeEngRate(int rate, String name) {
        int x = 0;
        try {
            String sql = "update engineers set rate=?  where mail =?";
            PreparedStatement ps = conn().prepareStatement(sql);

            ps.setInt(1, rate);
            ps.setString(2, name);

            x = ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return x;

    }

    public ResultSet selectEngrate(String mail) {
        ResultSet set = null;
        try {
            String sql = "select rate from engineers where mail = ?";
            PreparedStatement ps = conn().prepareStatement(sql);
            ps.setString(1, mail);
            set = ps.executeQuery();
        } catch (SQLException ex) {
            Logger.getLogger(DB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return set;

    }

    public int editeLawRate(int rate, String name) {
        int x = 0;
        try {
            String sql = "update laws set rate=?  where mail =?";
            PreparedStatement ps = conn().prepareStatement(sql);

            ps.setInt(1, rate);
            ps.setString(2, name);

            x = ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return x;

    }

    public ResultSet selectLawrate(String mail) {
        ResultSet set = null;
        try {
            String sql = "select rate from laws where mail = ?";
            PreparedStatement ps = conn().prepareStatement(sql);
            ps.setString(1, mail);
            set = ps.executeQuery();
        } catch (SQLException ex) {
            Logger.getLogger(DB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return set;

    }

    public int editeTeachRate(int rate, String name) {
        int x = 0;
        try {
            String sql = "update teatchers set rate=?  where mail =?";
            PreparedStatement ps = conn().prepareStatement(sql);

            ps.setInt(1, rate);
            ps.setString(2, name);

            x = ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return x;

    }

    public ResultSet selectTeachrate(String mail) {
        ResultSet set = null;
        try {
            String sql = "select rate from teatchers where mail = ?";
            PreparedStatement ps = conn().prepareStatement(sql);
            ps.setString(1, mail);
            set = ps.executeQuery();
        } catch (SQLException ex) {
            Logger.getLogger(DB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return set;

    }

    public int editeAllRate(int rate, String name) {
        int x = 0;
        try {
            String sql = "update alljops set rate=?  where mail =?";
            PreparedStatement ps = conn().prepareStatement(sql);

            ps.setInt(1, rate);
            ps.setString(2, name);

            x = ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return x;

    }

    public ResultSet selectAllrate(String mail) {
        ResultSet set = null;
        try {
            String sql = "select rate from alljops where mail = ?";
            PreparedStatement ps = conn().prepareStatement(sql);
            ps.setString(1, mail);
            set = ps.executeQuery();
        } catch (SQLException ex) {
            Logger.getLogger(DB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return set;

    }

    public static void main(String[] args) {
//      int x = DB.lawUpdate("manga", "farwla", "548", "dsfds", "214545", "147", "ma@nga");
//       if (x > 0){
//           System.out.println("good");
//       }else{
//           System.out.println("bad");
//       }
    }
}
