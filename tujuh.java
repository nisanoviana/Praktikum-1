/**
 * Created by nicun on 3/25/2015.
 */
public class tujuh {
    public static void main(String[] args) {
    float awal=1;
        float akhir=10;
        float jumlah=0;
        float ratarata=0;

        while(awal<=akhir){
            jumlah=jumlah+awal;
            ratarata=jumlah/akhir;
            awal++;
        }
    System.out.print("hasil rata-rata " +ratarata);
    }

}
