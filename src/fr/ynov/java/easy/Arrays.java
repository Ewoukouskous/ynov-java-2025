package fr.ynov.java.easy;

public class Arrays {

    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,9,10};

        System.out.println("For : ");

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");
        }

        System.out.println();

        System.out.println("-=-=-=-=-=-=-=-");

        System.out.println("Foreach : ");

        for (int i :  array) {
            System.out.print(i + ", ");
        }
    }

}
