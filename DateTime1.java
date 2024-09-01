import java.util.Date;

public class DateTime1 {
    public static void main(String[] args) {
        Date dt=new Date();
  // or java.util.Date = new java.util.Date(); by using this we did'nt require to
  //import java util date package. Same we can do with ArrayList. This was older
  //version, after java 8 new version came in which we make object.
        System.out.println(dt);

        long I = dt.getTime();

        java.sql.Date dt1 = new java.sql.Date(I);//it only prints date, not time
        System.out.println(dt1);
    }
}
