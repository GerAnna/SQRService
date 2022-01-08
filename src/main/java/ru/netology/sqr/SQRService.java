package ru.netology.sqr;

public class SQRService {
    public static int calculateSQR(int min, int max) {
        int counter = 0;
        for (int i = 10; i < 99; i++) {
            if (i * i >= min & i * i <= max) {
                counter ++;
            }
        }
        return (counter);
    }
    }