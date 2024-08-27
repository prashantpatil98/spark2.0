package JavaCollections.ListInJava;

import java.util.ArrayList;
import java.util.List;

public class ListDemo
{
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        if(list.isEmpty())
        {
            System.out.println("List is empty....");
        }
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(10);

        System.out.println(list);

        for(int data:list)
        {
            System.out.println(data);
        }
    }
}
