public class Main
{
    public static void main (String[] args) {
        int a=10, b=5, c=0;
        if (a >= 5) {
            // bloco true
            c = a + b;
            System.out.print("sei somar! o resultado é");
            System.out.println(c);
        } else {
            c=a-b;
            System.out.print("sei subtrair! o resultado é");
            System.out.println(c);
        }
    }

}