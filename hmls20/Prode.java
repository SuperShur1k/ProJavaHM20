package org.example.lesson20.hmls20;

import java.util.Arrays;

public class Prode {
    public static int maxOfArray(int [] a)
    {
        // вернуть максимум массива
        return Arrays.stream(a).max().orElse(0);
    }


    public static boolean isOnlyPositive(int [] a)
    {
        // вернуть true если в массиве только положительные числа
        return Arrays.stream(a).allMatch(i -> i > 0);
    }

//    Проверьте что maxOfArray для {1,2,3,4} вернет 4
//И что maxOfArray для пустого массива вернет 0
}
