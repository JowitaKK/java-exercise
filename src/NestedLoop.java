public class NestedLoop {

    /* nested for loop*/

    public static void main(String[] args) {
        for (int i = 1; i <=5; i++) {
            System.out.println("loop iteration " + i);

            for (int j = 1; j <= 2; j++) {
                System.out.println("i = " + i + "; j = " + j);

            }
        }
    }
}

/*nested loop
    public static void main(String[] args) {

        int i = 1;

        while (i <= 5) {
            System.out.println("Outer loop iteration " + i);

            for (int j = 1; j <= 2; j++) {
                System.out.print("i = " + i + "j = " + j);
            }

            i++;

        }
   }
}
*/
