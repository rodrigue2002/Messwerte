package messsswerte;
import java.util.Random;
public class Messwerte {
    int[] stunden = new int[24];
    static double[] messWerte = new double [24];
    static Random rand = new Random();
    public static void main (String[] args){
        for(int i = 0; i < messWerte.length; i++){
           messWerte[i] = rand.nextDouble(30.1);
        }
        findMax();
        findMin();
    }
    public static void findMax(){
        int a = 0;
        double max =  messWerte[0];
        for(int i = 1; i< messWerte.length; i++){
            if (messWerte[i] > max) {
                max = messWerte[i];
                a = i;
            }
        }
        System.out.printf("Um " + a + "Uhr war es am wärmsten mit %.2f ", max , "°C" );
        System.out.println();
    }
    public static void findMin(){
        int a = 0;
        double min =  messWerte[0];
        for(int i = 1; i< messWerte.length; i++){
            if (messWerte[i] < min) {
                min = messWerte[i];
                a = i;
            }
        }
        System.out.printf("Um " + a + "Uhr war es am kältesten mit %.2f", min , "°C" );
    }
}
