package JavaCollections;

import javax.security.auth.login.AccountExpiredException;
import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo
{
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println(list);

        Iterator<Integer> iterator = list.iterator();

        while(iterator.hasNext())
        {
            Integer data = iterator.next();
            System.out.println(data);
            if(data == 20) {
                iterator.remove();
            }

        }
        System.out.println(list);
    }
}

