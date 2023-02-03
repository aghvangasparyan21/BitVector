import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Main obj = new Main();
        int countofbitsofgivennumber = obj.BitsCounter();
        int[] arr = new int[countofbitsofgivennumber/32+1];
        System.out.print("Please enter which bit you want to change: ");
        int bit = sc.nextInt();
        System.out.print("Please say 0 or 1: ");
        int zeroorone = sc.nextInt();
        if(zeroorone == 1) {
            obj.SetOne(arr, bit);
        }
        else if (zeroorone == 0) {
            obj.SetZero(arr, bit);
        }
        else {
            System.out.println("Your input is wrong");
        }
    }
     int BitsCounter() {
        System.out.print("Please enter the count of bits։ ");
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        return count;
    }
     void SetOne(int[] arr, int bit){
        int tmp = bit / 32;
        if( ( ( arr[tmp] >> (bit- 1 - (tmp * 32) ) ) | 0) == ( ( arr[tmp] >> (bit - 1 -(tmp * 32 ) ) ) | 0)  ) {
            arr[tmp] = (arr[tmp] + ((int) Math.pow(2, bit - 1 - (tmp * 32))));
            System.out.println("Your " + bit + "nd bit changed to 1");
        }
        else{
            System.out.println("Your" + bit + "nd bit is already 1");
        }
        }
     void SetZero(int [] arr, int bit ){
      int tmp = bit / 32;
        if( ( ( arr[tmp] >> (bit - 1 - (tmp  * 32) ) ) | 0) != ( ( arr[tmp] >> (bit - 1 -(tmp * 32 ) ) ) | 0) ) {
            arr[tmp] = (arr[tmp] - ((int) Math.pow(2, bit - 1 - (tmp * 32))));
            System.out.println("Your " + bit + "nd bit changed to 0");
        }
        else System.out.println("Your " + bit + "nd bit is already 0");
    }
  }
