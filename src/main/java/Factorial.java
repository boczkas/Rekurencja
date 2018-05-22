public class Factorial {
    public static void main(String[] args) {
//        System.out.println(factorial(3));
//        System.out.println(bunnyEars(1));
//        System.out.println(fibonacci(5));
        System.out.println(bunnyEars2(2));
    }

    private static int bunnyEars2(int bunnys) {
        if(bunnys == 0){
            return 0;
        }

        int count = 2;

        if(bunnys % 2 == 0){
            count = 3;
        }

        return count + bunnyEars(bunnys - 1);

    }

    private static int fibonacci(int n) {
        if(n == 0){
            return 0;
        }

        if(n == 1){
            return 1;
        }

        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    private static int bunnyEars(int bunny) {
        if(bunny == 0){
            return 0;
        }

        int count = 2;
        return count + bunnyEars(bunny - 1);
    }

    private static int factorial(int n) {
        int result;

        if(n == 1){
            return 1;
        }

        result = factorial(n - 1) * n;
        return result;
    }


}
