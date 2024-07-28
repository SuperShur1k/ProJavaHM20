package org.example.lesson20.hmls20;

import org.junit.Test;

public class ProdeTest {
    @Test
    public void testMaxOfArray() {
        // Тест для массива {1, 2, 3, 4}
        int[] array1 = {1, 2, 3, 4};
        int expectedMax1 = 4;
        int actualMax1 = Prode.maxOfArray(array1);

        // Тест для пустого массива
        int[] emptyArray = {};
        int expectedMax2 = 0;
        int actualMax2 = Prode.maxOfArray(emptyArray);
    }

    @Test
    public void testIsOnlyPositive() {
        // Добавляем тест для проверки isOnlyPositive
        int[] positiveArray = {1, 2, 3, 4};
        int[] mixedArray = {1, -2, 3, 4};
        int[] emptyArray = {};

        // Положительный тест
        boolean expectedPositive1 = true;
        boolean actualPositive1 = Prode.isOnlyPositive(positiveArray);

        // Негативный тест
        boolean expectedPositive2 = false;
        boolean actualPositive2 = Prode.isOnlyPositive(mixedArray);

        // Тест для пустого массива
        boolean expectedPositive3 = true;
        boolean actualPositive3 = Prode.isOnlyPositive(emptyArray);
    }
}
