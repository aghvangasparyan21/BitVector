package BitVector;

public class Bitvector {
    public void setOne(int[] memory, int position){
        int tmp = position / 32;
        if( ( ( memory[tmp] >> (position- 1 - (tmp * 32) ) ) | 0) == ( ( memory[tmp] >> (position - 1 -(tmp * 32 ) ) ) | 0)  ) {
            memory[tmp] = (memory[tmp] | (1 << (position - 1 -(tmp * 32) ) ) );
            System.out.println("Your " + position + "nd bit changed to 1");
        }
        else{
            System.out.println("Your" + position + "nd bit is already 1");
        }
    }
    public void setZero(int[] memory, int position){
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
