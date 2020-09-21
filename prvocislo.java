import java.util.Scanner;

class prvocislo {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);

        System.out.println("zadejte kolik prvocisel chcete vypsat");
         int inp = scan.nextInt();

        int jedna = 1;

        int cislo = 3;

        System.out.println(2);
        for (int i = 2; i <= inp; ) {
            for (int j = 2; j <= Math.sqrt(cislo); j++) {
                if (cislo % j == 0) {
                    jedna = 0;
                    break;
                }
            }

            if (jedna != 0) {
                System.out.println(cislo);
                i++;
            }
            jedna = 1;
            cislo++;
        }
    }
}