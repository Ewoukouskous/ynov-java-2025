package fr.ynov.java.easy;

public class Loops {

    public static void main(String[] args) {
        System.out.println("For : ");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        System.out.println("-=-=-=-=-=-=-");

        System.out.println("While : ");

        int Whileindex = 1;
        while (Whileindex <= 10) {
            System.out.println(Whileindex);
            Whileindex++;
        }

        System.out.println("-=-=-=-=-=-=-");

        System.out.println("Do While : ");

        int DoWhileindex = 1;
        do {
            System.out.println(DoWhileindex);
            DoWhileindex++;
        }
        while (DoWhileindex <= 10);
    }

}
