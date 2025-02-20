package prelim;

import java.util.Scanner;

public class practice {

    public static void main(String[] args) {
        int x, y, z;

        Scanner in = new Scanner(System.in);

        System.out.println("Enter First number: ");
        x = in.nextInt();
        System.out.println("Enter Seond number: ");
        y = in.nextInt();
        System.out.println("Enter Third number: ");
        z = in.nextInt();

        System.out.println(x + "*" +  y + "+" + z + "=" + (x*y+z));
        System.out.println("("+x + "-" +  y + ")%" + z + "=" +((x-y)%z));
        System.out.println("("+x + "+" +  y + "+" + z +")" + "/3"+"=" + ((x+y+z)/3));
        System.out.println(x + "*" +  z + "-(" + y + "*" + y + "=" + (x*z-(4*4)));

    }

}
