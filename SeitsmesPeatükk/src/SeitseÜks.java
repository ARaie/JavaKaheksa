/**
 * Created by Janari on 11/7/2016.
 */
public class SeitseÜks {

    public static void main (String[]args){
        loop(900);
    }
    public static void loop (int n){
        int i = n;
        while(i > 1){
            System.out.println(i);
        }if (i % 2 == 0){
            i = i / 2;
        }else{
            i = i + 1;
        }
    }
}
