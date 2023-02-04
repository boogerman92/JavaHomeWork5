package ru.netology.sqr.JavaHomeWork5.services;

public class SQRService {
    public int quantitySqrt(int min, int max){
        int count = 0;
        for (int i = 1; i <= 99; i++){
            if (i * i >= min && i * i <= max){
                count++;
            }
        }
        return count;
    }
}
