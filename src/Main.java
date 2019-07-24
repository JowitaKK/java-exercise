import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        String[] guests = new String[10];
        Scanner scanner = new Scanner(System.in);

        guests[0] = "Jov";
        guests[1] = "Marcin";
        guests[2] = "Antos";
        guests[3] = " Mac";

        do {
            System.out.println("______________________\n - Guests - \n ");

            for (int i = 0; i < guests.length; i++) {
//                    if (guests[i] == null ){
//                        System.out.println("--");
//                    } else {
//                        System.out.println(guests [i]);  or

                System.out.println(guests[i] == null ? "--" : guests[i]);// if true prints -- if false guests
            }

            System.out.println("______________________\n - Menu - \n ");
            System.out.println("1 - Add Guests");
            System.out.println("2 - Remove Guests");
            System.out.println("3 -Exit");
            System.out.println("option: ");
            int option = scanner.nextInt();
            System.out.println();


            if (option == 1) {
                for (int i = 0; i < guests.length; i++)
                    if (guests[i] == null) {
                        System.out.println(" Name : ");
                        String name = scanner.next();
                        // or without variable just guests[i] = scanner.next();
                        guests[i] = name;
                        break;
                    }

            } else if (option == 2) {
                System.out.println("Name :");
                String name = scanner.next();
                for (int i = 0; i < guests.length; i++) {
                    if (guests[i] != null && guests[i].equals(name)) {
                        guests[i] = null;
                        break;
                    }
                }
            } else if (option == 3) {
                    System.out.println("exiting ....");
                    break;

                }

            } while (true) ;
    }
}