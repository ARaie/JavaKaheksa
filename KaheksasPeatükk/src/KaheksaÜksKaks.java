/**
 * Created by Janari on 11/14/2016.
 */
public class KaheksaÜksKaks {

    public static int inRange(int[] a, int low, int high) {
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] >= low && a[i] < high) {
                count++;
            }
        }
        return count;
    }
    public static void main ( String[]args){}

    int numValues = 8;


}

