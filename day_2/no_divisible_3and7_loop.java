class Demo {
    public static void main(String[] args) {
        int a = 1;
        System.err.println("numbers are divisble by 3 and 7 between 1 to 20 ");
        for (a = 1; a <= 20; a++) {
            if (a % 3 == 0 && a % 7 == 0) {
                System.err.println(a);
            }
        }
    }
}