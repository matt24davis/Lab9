package Company;

import java.util.Scanner;

public class Main {
    public static int recursive_multiply(int x, int y){

        if(y==0)return 0;
        else if(y==1)return x;
        else return x + recursive_multiply(x,y-1);
    }

    public static int recursive_div(int x, int y){

        if(x<y) return 0;
        else if(x==y)return 1;
        else return 1 + recursive_div(x-y,y);
    }

    public static int recursive_mod(int x, int y){
        if(x<y)return x;
        if(x==y)return 0;
        else return recursive_mod(x-y,y);
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int choice, x,y;
        while (true){
            System.out.println("[1] - Recursive Multiplication");
            System.out.println("[2] - Recursive Division");
            System.out.println("[3] - Recursive Modulus");
            System.out.println("[0] - Exit");
            System.out.print("Enter choice: ");
            choice = scanner.nextInt();

            if(1<=choice && choice<=3){
                System.out.print("Enter the first number: ");x = scanner.nextInt();
                System.out.print("Enter the second number: ");y = scanner.nextInt();
                switch (choice){
                    case 1:                    System.out.println("Product: "+recursive_multiply(x,y));break;
                    case 2:                    System.out.println("Division: "+recursive_div(x,y));break;
                    case 3:                    System.out.println("Modulus: "+recursive_mod(x,y));break;
                }
            }

            else if (choice==0) break;

        }
    }

}

