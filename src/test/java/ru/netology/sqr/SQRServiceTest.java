package ru.netology.sqr;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {
    @ParameterizedTest
    @CsvSource (value ={"'positive test, min SQR', 625, 625, 1",
            "'positive test, max SQR', 100, 9801, 89",
            "'negative test, zero SQR', 10, 10, 0",
            "'negative test, uncorrect expected', 10, 10, 1"
    })
     void calculateSQR(String name, int min, int max, int expected) {

        SQRService service = new SQRService();
        int actual = service.calculateSQR(min, max);
        assertEquals(expected, actual);
    }
}