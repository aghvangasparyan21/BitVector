package Running;
import java.util.*;
public class Controller {
    void validLenght(){
       Bitvector obj = new Bitvector();
       Scanner sc = new Scanner(System.in);
       int lenghtOfVector;
       do {
           System.out.println("Please enter the lenght of vector with bits: ");
           lenghtOfVector = sc.nextInt();
       }while(lenghtOfVector <= 0);
       int position;
       int num;
       boolean iteration = true;
       while (iteration){
           System.out.print("Դo you want to change to 1 or 0?։ ");
           num = sc.nextInt();
           if(num == 1){
               do {
                   System.out.println("Please enter the bit which you want to change: ");
                   position = sc.nextInt();
               }while (position < 0);
               if(lenghtOfVector >= position ){
                   obj.setOne(lenghtOfVector, position);
               } else  {
                   obj.setOne(position, position);
               }
           }
           else if (num == 0) {
               do {
                   System.out.println("Please enter the bit which you want to change: ");
                   position = sc.nextInt();
               }while (position < 0);
               if(lenghtOfVector >= position ){
                   obj.setZero(lenghtOfVector, position);
               } else  {
                   obj.setZero(position, position);
               }
           }
           else {
               System.out.println("Wrong input!");
               iteration = false;
           }

       }

   }
}
