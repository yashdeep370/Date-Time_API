import java.util.*;
public class datedemo {
    public static void main(String[] args) {
        Date d = new Date();
        System.out.println(d);
        System.out.println(d.getTime());
        System.out.println(d.getDate());
        System.out.println(d.getDay());
        // System.out.println(System.currentTimeMillis()/1000/60/60/24/365);
    }
}
