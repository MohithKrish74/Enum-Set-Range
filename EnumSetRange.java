package com.keyword;

import java.util.EnumSet;
import java.util.Iterator;

enum Numbers{ONE,TWO,THREE,FOUR,FIVE,SIX,SEVEN,EIGTH,NINE,TEN}
public class EnumSetRange
{
    public static void main(String[] args)
    {
        EnumSet<Numbers> set = EnumSet.range(Numbers.SIX,Numbers.TEN);
        Iterator<Numbers> iterate = set.iterator();
        System.out.println("The Numbers from Six to Ten are Displayed:  ");
        while (iterate.hasNext())
        {
            System.out.println(iterate.next());
        }
    }
}
