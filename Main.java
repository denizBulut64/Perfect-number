public class Main {
//Mükemmel sayi (Perfect numbers made by myself)
    public static void main(String[] args) {

        int sayi = 8128;
        int total = 0;
        for (int i = 1; i < sayi; i++) {

            total = total + i;

            if (sayi == total) {
                System.out.println("Sayi mükkemmel sayidir.");

                return;
            }
        }

        System.out.println("Sayi mükemmel sayi değildir.");
    }


}



