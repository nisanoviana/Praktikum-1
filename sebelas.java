/**
 * Created by nicun on 3/25/2015.
 */
public class sebelas {
    public static void main(String[] args) {
        int panjang=5;
        System.out.println(+panjang);
        for(int i=1; i<=panjang; i++)
        {
            for (int a=1; a<=panjang; a++){
                System.out.print("#");
            }
            System.out.println(" ");
            if(i%2==1){
                System.out.print(" ");
            }
        }
    }

}
