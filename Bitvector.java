package Running;

import java.util.Scanner;

public class Bitvector {
    private Scanner sc = new Scanner(System.in);
    static int[] memory;
    private int[] initializationOfVector(int size){
        return new int[size / 32 +1];
    }
    public void setOne(int lenghtOfVector,int position){
        memory =  initializationOfVector(lenghtOfVector);
        int tmp = position / 32;
        if( ( ( memory[tmp] >> (position- 1 - (tmp * 32) ) ) | 0) == ( ( memory[tmp] >> (position - 1 -(tmp * 32 ) ) ) | 0)  ) {
            memory[tmp] = (memory[tmp] | (1 << (position - 1 -(tmp * 32) ) ) );
            System.out.println("Your " + position + "nd bit changed to 1");
        }
        else{
            System.out.println("Your" + position + "nd bit is already 1");
        }
    }
    public void setZero(int lenghtOfVector, int position){
        memory =  initializationOfVector(lenghtOfVector);
        int tmp = position / 32;
        if( ( ( memory[tmp] >> (position - 1 - (tmp  * 32) ) ) & 0) != ( ( memory[tmp] >> (position - 1 -(tmp * 32 ) ) ) | 0) ) {
            memory[tmp] = (memory[tmp] &  (~( 1 << (position - 1 -(tmp * 32 ) ) ) ) );
            System.out.println("Your " + position + "nd bit changed to 0");
        }
        else {
            System.out.println("Your " + position + "nd bit is already 0");
        }
    }
}
