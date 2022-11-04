public class Fibonacci {
    public static int recursiveFibonacci(int n){

        if (n == 0){
            return 0;
        }
        else if(n == 1){
            return 1;
        }
        else {
            return recursiveFibonacci(n - 2) + recursiveFibonacci(n - 1);
        }
    }

    public static void iterativeFibonacci(int n) {

        int num1 = 0;
        int num2 = 1;
        int counter = 0;

        while (counter < n){
            System.out.println(num1 + " ");

            int num3 = num2 + num1;
            num1 = num2;
            num2 = num3;
            counter = counter + 1;
        }
    }

    public static void main(String[] args) {
        int n = 10;
        // call of recursive function
        for (int i = 0; i < n; i++){
            System.out.println(recursiveFibonacci(i) + " ");
        }
        // call of iterative function
        iterativeFibonacci(n);
    }


}
