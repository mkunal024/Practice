public class Reverse {
    public static void main(String[] args) {
        int num = 1234110, n;
        do {
            n = num % 10;
            num = num / 10;
            System.out.print(n);
        } while (num > 0);
    }
}
