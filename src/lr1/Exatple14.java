package lr1;

import java.util.Scanner;

public class Exatple14 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int a = scanner.nextInt();
        System.out.print((a-1)+" "+ a+" " +(a+1)+ "  "+ (((a-1)+a+(a+1))^2));
    }
}
