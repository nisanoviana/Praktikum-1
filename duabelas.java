/**
 * Created by nicun on 3/25/2015.
 */
public class duabelas {
    public static void main(String[] args) {
        int p=7;
        int l=3;
        System.out.println("panjang= " +p);
        System.out.println("lebar= " +l);
        for(int i=1; i<=p; i++)
        {
            for(int a=1; a<=l; a++){
                System.out.print("#");
            }
            System.out.print("");
            if(i%2==1){
                System.out.println(" ");
            }
        }
    }
}
