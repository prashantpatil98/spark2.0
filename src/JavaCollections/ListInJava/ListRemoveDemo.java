package JavaCollections.ListInJava;

import java.util.ArrayList;
import java.util.Scanner;

public class ListRemoveDemo
{
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < 5; i++)
        {
            list.add(i);
        }

        System.out.println("List :" + list);
        System.out.println("Enter the index to remove: ");
        Scanner sc = new Scanner(System.in);
    }
}
