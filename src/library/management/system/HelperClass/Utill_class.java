

package library.management.system.HelperClass;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;


public  class Utill_class {
    
   public static int getMaxId(final String tabName) {

        int id = 0;
        try {
            Statement st = DBConnUtill.getConn().createStatement();
            ResultSet rs = st.executeQuery("select max(id) from " + tabName);

            if (rs.next()) {
                id = rs.getInt(1);
            }
            rs.close();
            st.close();

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("err: " + e);
        }
        return id;
    }
    
   public static int getMaxCode(final String tabName) {

        int id = 0;
        try {
            Statement st = DBConnUtill.getConn().createStatement();
            ResultSet rs = st.executeQuery("select max(CODE) from " + tabName);

            if (rs.next()) {
                id = rs.getInt(1);
            }
            rs.close();
            st.close();

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("err: " + e);
        }
        return id;
    }
   
    
  public  static void setImage(final Integer currObj, final String path,final JLabel lbl){
    
        String imagePath="LMS_IMAGE\\"+path;
        System.out.println("hhh=="+path);
        System.out.println("obr="+currObj);
        ImageIcon icon=new ImageIcon(imagePath+"\\"+currObj+".jpg");
        lbl.setIcon(icon);
       
    }
    
    public static boolean delete(final Integer currObj, final String tabName) {
        int ret = 0;
        try {
            Statement st = DBConnUtill.getConn().createStatement();

            if (currObj != null) {
                ret = st.executeUpdate("delete from " + tabName + " where id= " + currObj);
            }

            st.close();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("err: " + e);
        }

        return ret == 1;
    }
     
    public  static String lpad(final int id, final int size, final String reapt) {

        String ret = id + "";

        while (ret.length() < size) {
            ret = reapt + ret;
        }

        return ret;
    }
      
      
    public static void imageCopy(final File src, final File dest) {

        try {

            BufferedImage bufferedImage = ImageIO.read(src);
//           BufferedImage bufferedImage = ImageIO.read(new File("E:\\Manik_Profile\\Desktop\\java_logo.png"));

            // create a blank, RGB, same width and height, and a white background
            BufferedImage newBufferedImage = new BufferedImage(120,
                    120, BufferedImage.TYPE_INT_RGB);
            Graphics2D g = newBufferedImage.createGraphics();
            g.drawImage(bufferedImage, 0, 0, 120, 120, Color.WHITE, null);
            g.dispose();

            ImageIO.write(newBufferedImage, "jpg", dest);
//            ImageIO.write(newBufferedImage, "jpg", new File("E:\\Manik_Profile\\Desktop\\java_logo_cp.jpg"));

            System.out.println("Done");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
