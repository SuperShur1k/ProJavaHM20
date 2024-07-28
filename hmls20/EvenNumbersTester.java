package org.example.lesson20.hmls20;

import org.junit.Test;

import java.util.List;
import java.util.function.Predicate;

public class EvenNumbersTester {

    @Test
    public void testAllValuesAreEven() {
        List<Integer> odds = List.of(22, 12, 6);

        Predicate<Integer> isEven = n -> n % 2 == 0;
    }

}
