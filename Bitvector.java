package BitVector;

public class Bitvector {

    private void printMemory(int[] memory) {
        for (int i = 0; i < memory.length; ++i) {
            System.out.print(memory[i] + " ");
        }
        System.out.println("");
    }

    void setOne(int[] memory, int position, int lenghtOfVector) {
        int tmp = position / 32;
        if(position % 32 == 0 && lenghtOfVector == position){
            if((memory[tmp] & 1) == 0) {
                memory[tmp] = 1;
                System.out.println("Your " + position + "nd bit changed to 1");
            }
            else {
                System.out.println("Your" + position + "nd bit is already 1");
            }
            printMemory(memory);
            return;
        }
        if(position % 32 == 0 && lenghtOfVector > position){
            if((memory[tmp] & 1) == 0) {
                memory[tmp] = 1;
                System.out.println("Your " + position + "nd bit changed to 1");
            }
            else {
                System.out.println("Your " + position + "nd bit is already 1");
            }
            printMemory(memory);
            return;
        }
        if (((memory[tmp] >> (position - 1 - (tmp * 32))) & 0) == ((memory[tmp] >> (position - 1 - (tmp * 32))) | 0)) {
            memory[tmp] = (memory[tmp] | (1 << (position - 1 - (tmp * 32))));
            System.out.println("Your " + position + "nd bit changed to 1");
        } else {
            System.out.println("Your " + position + "nd bit is already 1");
        }
      printMemory(memory);

    }

    void setZero(int[] memory, int position, int lenghtOfVector) {
        int tmp = position / 32;
        if(position % 32 == 0 && lenghtOfVector == position){
            if ((memory[tmp] & 1) == 1) {
                memory[tmp] = 0;
                System.out.println("Your " + position + "nd bit changed to 0");
            }
            else {
                System.out.println("Your " + position + "nd bit is already 0");
            }
            printMemory(memory);
            return;
        }
        if(position % 32 == 0 && lenghtOfVector > position){
            if (((memory[tmp] >> (position  - (tmp * 32))) & 0) != ((memory[tmp] >> (position  - (tmp * 32))) | 0)) {
                memory[tmp] = 0;
                System.out.println("Your " + position + "nd bit changed to 0");
            }
            else  {
                System.out.println("Your " + position + "nd bit is already 0");
            }
            printMemory(memory);
            return;
        }
        if (((memory[tmp] >> (position - 1 - (tmp * 32))) & 0) != ((memory[tmp] >> (position - 1 - (tmp * 32))) | 0)) {
            memory[tmp] = (memory[tmp] & (~(1 << (position - 1 - (tmp * 32)))));
            System.out.println("Your " + position + "nd bit changed to 0");
        } else {
            System.out.println("Your " + position + "nd bit is already 0");
        }
        printMemory(memory);
    }

}