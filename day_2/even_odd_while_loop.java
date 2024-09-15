class Demo {
    public static void main(String[] args) {
        int a = 1;
        System.out.println("Even numbers betweewn 1 to 20 ");
        while (a <= 20) {
            if (a % 2 == 0) {
                System.out.println(a);
            }
            a++;
        }
        a = 1;
        System.out.println("Odd numbers betweewn 1 to 20 ");
        while (a <= 20) {
            if (a % 2 != 0) {
                System.out.println(a);
            }
            a++;
        }
    }
}
