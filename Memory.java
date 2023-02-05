package BitVector;

public class Memory {
    int[] memoryAllocation(int size){
        return new int[size / 32 + 1];
    }
    int[] memoryReAllocation(int[] memory , int size){
        int[] memory1 = new int[size / 32 +1];
        for (int i = 0; i < memory.length; ++i){
            memory1[i] = memory[i];
        }
        return memory1;
    }
    int[] caseOfequal(int[] memory, int size){
        int[] memory1 = new int[size];
        for (int i = 0; i < memory.length; ++i){
            memory1[i] = memory[i];
        }
        return memory1;
    }
}
