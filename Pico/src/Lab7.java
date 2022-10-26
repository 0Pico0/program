import  java.util.Scanner;
public class Lab7 {
    public static void main(String[] args) {
        int n;
        System.out.println("  ");
        Scanner scan = new Scanner(System.in);

        if (scan.hasNextInt() ){
            do {
                n = scan.nextInt();
                if (n <= 3)
                {System.out.println(" ");}
            }
                while (n<=3);
                int[] ar1 = new int[n];
                for ( int i =0; i < n; i++)
                {ar1[i] = (int)(Math.round(Math.random() + n));
                    System.out.print(ar1[i] + " ");}
                System.out.println(" ");

                for (int i=0 ; i< n; i++)
                { if (ar1[i]%2<1)
                {System.out.print(ar1[i] + " ");}}
        }}}


