
package library.management.system.HelperClass;


public class Dual {
   public int id;
    String display;

    public Dual(int id, String display) {
        this.id = id;
        this.display = display;
    }


    @Override
    public String toString() {
        return display;
    }
}
