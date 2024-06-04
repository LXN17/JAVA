package Task1;

import java.util.Comparator;

public class Main
{
    public static void main(String[] args)
    {
        Comparator<Object[]> comparator = Comparator.comparingInt(arr -> arr.length);
        var newArr1 = new Integer[]{1, 2, 4, 7};
        var newArr2 = new Integer[]{1, 10, 10, 10, 10};
        System.out.println(comparator.compare(newArr1, newArr2));
    }
}