/**
 * Created by nicun on 3/25/2015.
 */
public class delapan {
    public static void main(String[] args) {
      int akhir=110;
        System.out.println("nilai "+akhir);
        for(int i=1; i<=akhir; i++){
            System.out.print(i);
            System.out.print(" ");
            if(i%11==0){
                System.out.println(" ");
            }
        }

    }
}

