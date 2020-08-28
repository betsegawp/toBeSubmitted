import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        int count = 10;
        String temp;
        Scanner scan = new Scanner(System.in);


        String str[] = new String[count];
        Scanner scan2 = new Scanner(System.in);


        System.out.println("Enter ten words:");
        for (int i = 0; i < count; i++) {

            str[i] = scan2.nextLine();
        }
        scan.close();
        scan2.close();
        System.out.print("\nOriginal order: \n");
        for (int i = 0; i <= count - 1; i++) {
            System.out.print(", " + str[i]);
        }

        for (int i = 0; i < count; i++) {
            for (int j = i + 1; j < count; j++) {
                if (str[i].compareTo(str[j]) > 0) {
                    temp = str[i];
                    str[i] = str[j];
                    str[j] = temp;
                }
            }
        }

        System.out.print("\n Sorted Alphabetical Order:\n");

        for (int i = 0; i <= count - 1; i++) {
            System.out.print(str[i] + ", ");
        }
        for (int i = 0; i < count; i++) {

            for (int j = i + 1; j < count; j++) {

                if (str[j].compareTo(str[i]) > 0) {

                    temp = str[i];
                    str[i] = str[j];
                    str[j] = temp;
                }
            }

        }

        System.out.print(" \n Reverse Alphabetical Order:\n");

        for (int i = 0; i <= count - 1; i++) {
            System.out.print(str[i] + ", ");
        }
        System.out.println("\n Upper Case array");
        for (int i = 0; i <= count - 1; i++)
        {
            System.out.println(str[i].toUpperCase());


        }
    }
}
