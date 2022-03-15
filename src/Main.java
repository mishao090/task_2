public class Main {
    public static void main(String[] args) {

        int balance = 100;
        int bonus = 0;
        int pay = 2000;

        if (pay > 1000) {
            bonus = pay / 100;
        }

        int check = pay + balance + bonus;

        System.out.println("итоговый счет: " + check);
        System.out.println("бонус: " + bonus);

    }
}