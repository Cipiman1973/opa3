import java.util.Scanner;

class slovo{

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Zadejte vetu o o minimalne 3 slovech");
        String veta = scan.nextLine();


        String[] what = veta.split("[ ]+");

        System.out.println("predposledni slovo je =" + what[what.length - 2]);



    }
}