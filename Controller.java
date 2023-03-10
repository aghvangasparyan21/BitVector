package BitVector;

import java.util.Scanner;

public class Controller {
    Memory storage = new Memory();
    Bitvector obj = new Bitvector();
    private Scanner sc = new Scanner(System.in);
    private int lenghtOfVector;
    private int position;
    static int[] memory;
    void validVector(){
        int[] tmpMemory;
        do {
            System.out.print("Please enter the lenght of vector with bits: ");
            lenghtOfVector = sc.nextInt();
        }while(lenghtOfVector <= 0);
        tmpMemory = storage.memoryAllocation(lenghtOfVector);
        memory = tmpMemory;

    }
    private int inputPosition(){
        int position1;
        do {
            System.out.print("Please enter the bit which you want to change: ");
            position1 = sc.nextInt();
        }while (position1 <= 0);
        return position1;
    }

    void mainProcess(){
        int num;
        boolean iteration = true;
        while(iteration){
            position = inputPosition();
            if(position > lenghtOfVector){
                memory = storage.memoryReAllocation(memory, position-1);
                lenghtOfVector = position;
            }
            System.out.print("Do you want to change to 1 or 0?։ ");
            num = sc.nextInt();
            if(num == 1){
                obj.setOne(memory, position-1,lenghtOfVector);
            }
            else if (num == 0) {
                obj.setZero(memory, position-1, lenghtOfVector);
            }
            else{
                System.out.println("Wrong input!");
                iteration = false;
            }
        }
    }
}