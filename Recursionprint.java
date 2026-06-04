public class Recursionprint {
    public static void main(String[] args) {
        System.out.println("When n is 10: ");
        System.out.println(factorial(10));
        OneToN(10);
    }
    static int factorial(int n){
        if (n <= 1)
            return n;
        return n*factorial(n-1);
    }

    static void OneToN(int n)
    {
        if (n==0) return;

        OneToN(n-1);
        System.out.print(n + " ");
    }
}
