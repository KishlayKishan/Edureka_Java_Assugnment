package Module4;

import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.TypeVariable;

public class Thread {
    public Thread(Calculator calculator) {

    }

    public static void main(String[] args) {

        //Launch 10 threads that make the operation with a different number
        for (int i=1; i<=10; i++){
            Calculator calculator=new Calculator(i);
            Thread thread=new Thread(calculator);
            thread.start();
        }
    }

    public static TypeVariable<GenericDeclaration> currentThread() {
        return null;
    }

    private void start() {
    }
}

class Calculator implements Runnable {

    /**
     *  The number
     */
    private int number;

    /**
     *  Constructor of the class
     * @param number : The number
     */
    public Calculator(int number) {
        this.number=number;
    }

    /**
     *  Method that do the calculations
     */
    @Override
    public void run() {
        for (int i=1; i<=10; i++){
            System.out.printf("%s: %d * %d = %d\n",Thread.currentThread().getName(),number,i,i*number);
        }
    }

}


