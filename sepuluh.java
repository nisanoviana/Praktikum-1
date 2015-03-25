import com.sun.org.apache.xpath.internal.SourceTree;

/**
 * Created by nicun on 3/25/2015.
 */
public class sepuluh {
    public static void main(String[] args) {
        int panjang = 3;
        System.out.println("panjang= " + panjang);
        for (int i = 1; i <= panjang; i++) {
            for (int j = 1; j <= panjang; j++) {
                System.out.print("#");
            }
            System.out.println("");
        }
    }
}