package com.example.GcdMethods;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Alternative;

// import com.example.Annotation.EUCLIDEAN;



@ApplicationScoped
@Alternative
// @EUCLIDEAN @ApplicationScoped
public class EuclideanGcd implements IGcdCalculator {

    @Override
    public int calculateGcd(int a, int b) {
        System.out.println("Запуск алгоритма Евклида...");
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
