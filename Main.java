import java.util.Scanner;

class Main{
    public static void main(String[] args){
        System.out.println("Hello World");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Number of files to download: ");
        String userInput = scanner.nextLine();
        System.out.println(userInput);
        int numberOfFiles = Integer.parseInt(userInput);
    }
}