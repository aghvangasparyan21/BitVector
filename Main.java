package BitVector;
public class Main {
    public static void main(String[] args) {
        Controller control = new Controller();
        int[] memory = control.validVector();
        control.mainProcess(memory);
    }
}
